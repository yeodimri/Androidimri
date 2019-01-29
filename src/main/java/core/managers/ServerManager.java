package core.managers;


import api.android.Android;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.lang3.ObjectUtils;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class ServerManager {
    private static String OS;
    private static String ANDROID_HOME;

    public static String getAndroidHome() {
        if (ANDROID_HOME == null)
            ANDROID_HOME = System.getenv("ANDROID_HOME");
        if (ANDROID_HOME == null)
            throw new RuntimeException("Failed to find ANDROID_HOME, make sure the environment variable is set");
        return ANDROID_HOME;
    }

    private static AndroidDriver driver = null;

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static String getOS() {
        if (OS == null) OS = System.getenv("os.name");
        return OS;

    }

    public static boolean isWindows() {
        return getOS().startsWith("Windows");
    }

    public static boolean isMac() {
        return getOS().startsWith("Mac");
    }

    public static String runCommand(String command) {
        String output = null;
        try {
            Scanner scanner = new Scanner(Runtime.getRuntime().exec(command).getInputStream()).useDelimiter("\\A");
            if (scanner.hasNext()) output = scanner.next();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return output;
    }

    public static void startAppium() throws MalformedURLException {
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), DriverManager.getCaps("emulator-5554"));
    }

}
