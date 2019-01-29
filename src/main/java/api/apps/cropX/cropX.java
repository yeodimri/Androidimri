package api.apps.cropX;

import api.android.Android;
import api.apps.cropX.createAcount.createAcount;
import api.apps.cropX.homePage.homePage;
import api.apps.cropX.login.logIn;
import api.interfaces.Application;

public class cropX implements Application {

    public api.apps.cropX.homePage.homePage homePage = new homePage();
    public api.apps.cropX.createAcount.createAcount createAcount = new createAcount();
    public api.apps.cropX.login.logIn logIn = new logIn();

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    @Override
    public String packageID() {

        return "com.cropx.adaptive";
    }

    @Override
    public String activityID() {
        return "com.cropx.adaptive.ui.splash.SplashActivity";
    }

}
