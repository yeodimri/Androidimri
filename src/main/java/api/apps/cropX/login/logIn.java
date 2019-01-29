package api.apps.cropX.login;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class logIn {

    public logInUiObject uiObject = new logInUiObject();

    public void addTextloginEmailAddressField(String eMail) {
        try {
            MyLogger.log.info("typing text to logIn Email address field");
            uiObject.loginEmailAddressField().typeText(eMail);

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("cant typing text to logIn Email address field");
        }
    }

    public void addTextloginPasswordField(String password) {
        try {
            MyLogger.log.info("typing text to logIn password field");
            uiObject.loginPasswordField().typeText(password);

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("cant typing text to logIn password field");
        }
    }

    public void tapFabLoginButton() {
        try {
            MyLogger.log.info("Tapping on the Fab Login Button");
            uiObject.fabLoginButton().tap();

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("Cant tap FabLogin Button, element absent or blocked");
        }
    }
}
