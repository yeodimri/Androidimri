package core.managers;

import api.android.Android;
import core.ADB;
import core.MyLogger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.seleniumhq.jetty9.util.HostMap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class DriverManager {
    private static HashMap<String, URL> hosts;

    public static DesiredCapabilities getCaps(String deviceId) throws MalformedURLException {
        MyLogger.log.info("creating device caps for device");
        AndroidDriver driver = null;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceId);
        caps.setCapability("platformName", "Android");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.cropx.adaptive.ui.splash.SplashActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.cropx.adaptive");
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

        return caps;
    }

//    private static URL host(String deviceId) throws MalformedURLException {
//        if (hosts == null) {
//            hosts = new HostMap<URL>();
//            hosts.put("emulator-5554", new URL("http://127.0.0.1:4723/wd/hub"));
//        }
//        return host(deviceId);
//
//    }
//    private static ArrayList<String> getArrayListDevices() {
//        MyLogger.log.info("checking for available devices");
//        ArrayList<String> availableDevices = new ArrayList<String>();
//
//        ArrayList<String> connectedDevices = ADB.getConnectedDevices();
//        for (Object connectedDevice : connectedDevices){
//
//        }
//    }


}
