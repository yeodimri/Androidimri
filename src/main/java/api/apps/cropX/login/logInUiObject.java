package api.apps.cropX.login;

import core.UiObject;
import core.UiSelector;

public class logInUiObject {

    private static UiObject
            logInHeader,
            loginEmailAddress,
            loginEmailAddressField,
            loginPassword,
            loginPasswordField,
            loginForgotPassword,
            fabLoginButton,
            loginBackButton;

    public UiObject logInHeader() {
        if (logInHeader == null)
            logInHeader = new UiSelector().text("com.cropx.adaptive:id/headerTextView").makeUiObject();
        return logInHeader;
    }

    public UiObject loginEmailAddress() {
        if (loginEmailAddress == null)
            loginEmailAddress = new UiSelector().text("Email address").makeUiObject();
        return loginEmailAddress;
    }

    public UiObject loginEmailAddressField() {
        if (loginEmailAddressField == null)
            loginEmailAddressField = new UiSelector().resourceId("com.cropx.adaptive:id/email_edit_text").makeUiObject();
        return loginEmailAddressField;
    }

    public UiObject loginPassword() {
        if (loginPassword == null)
            loginPassword = new UiSelector().resourceId("com.cropx.adaptive:id/welcome_prompt_text_view").makeUiObject();
        return loginPassword;
    }

    public UiObject loginPasswordField() {
        if (loginPasswordField == null)
            loginPasswordField = new UiSelector().resourceId("com.cropx.adaptive:id/password_edit_text").makeUiObject();
        return loginPasswordField;
    }

    public UiObject loginForgotPassword() {
        if (loginForgotPassword == null)
            loginForgotPassword = new UiSelector().resourceId("com.cropx.adaptive:id/rightTextView").makeUiObject();
        return loginForgotPassword;
    }

    public UiObject fabLoginButton() {
        if (fabLoginButton == null)
            fabLoginButton = new UiSelector().resourceId("com.cropx.adaptive:id/fab_login_button").makeUiObject();
        return fabLoginButton;
    }

    public UiObject loginBackButton() {
        if (loginBackButton == null)
            loginBackButton = new UiSelector().resourceId("com.cropx.adaptive:id/leftTextView").makeUiObject();
        return loginBackButton;
    }


}
