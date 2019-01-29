package tests;

import api.android.Android;
import api.apps.Apps;
import core.managers.ServerManager;
import core.managers.TestManager;
import api.apps.cropX.cropX;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class loginTests extends TestManager {

    private static cropX cropx = Android.app.cropXApp;

    @BeforeClass
    private static void beforeClass() throws MalformedURLException {
        testInfo.suite("loginTest");
        ServerManager.startAppium();
    }

    @Test
    public void correctLogIn() {
        testInfo.id("test1").name("try to log in with correct values");
        cropx.homePage.uiObject.Login().waitToAppear(60);
        cropx.homePage.tapLogin();
//        Assert.assertTrue(cropx.logIn.uiObject.loginEmailAddressField().exists());
        Assert.assertTrue(cropx.logIn.uiObject.fabLoginButton().exists(), "האובייקט נמצא");
        cropx.logIn.addTextloginEmailAddressField("demo@cropx.com");
        cropx.logIn.addTextloginPasswordField("Ddemo123");
        cropx.logIn.tapFabLoginButton();


    }
}
