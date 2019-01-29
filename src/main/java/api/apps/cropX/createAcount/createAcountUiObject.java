package api.apps.cropX.createAcount;

import core.UiObject;
import core.UiSelector;

public class createAcountUiObject {
    private static UiObject
            createAccountHeader,
            emailAddressHeader,
            emailAddressField,
            passwordHeader,
            passwordField,
            confirmPasswordHeader,
            confirmPassword,
            backButton,
            fabCreateButton;

    public UiObject createAccountHeader() {
        if (createAccountHeader == null)
            createAccountHeader = new UiSelector().resourceId("com.cropx.adaptive:id/headerTextView").makeUiObject();
        return createAccountHeader;
    }

    public UiObject emailAddressHeaderv() {
        if (emailAddressHeader == null)
            emailAddressHeader = new UiSelector().resourceId("com.cropx.adaptive:id/text_view_email").makeUiObject();
        return emailAddressHeader;
    }

    public UiObject emailAddressField() {
        if (emailAddressField == null)
            emailAddressField = new UiSelector().resourceId("com.cropx.adaptive:id/email_edit_text").makeUiObject();
        return emailAddressField;
    }

    public UiObject passwordHeader() {
        if (passwordHeader == null)
            passwordHeader = new UiSelector().resourceId("com.cropx.adaptive:id/password_text_view").makeUiObject();
        return passwordHeader;
    }

    public UiObject passwordField() {
        if (passwordField == null)
            passwordField = new UiSelector().resourceId("com.cropx.adaptive:id/password_edit_text").makeUiObject();
        return passwordField;
    }

    public UiObject confirmPasswordHeader() {
        if (confirmPasswordHeader == null)
            confirmPasswordHeader = new UiSelector().resourceId("com.cropx.adaptive:id/confirm_text_view").makeUiObject();
        return confirmPasswordHeader;
    }

    public UiObject confirmPassword() {
        if (confirmPassword == null)
            confirmPassword = new UiSelector().resourceId("com.cropx.adaptive:id/confirm_text_view").makeUiObject();
        return confirmPassword;
    }

    public UiObject backButton() {
        if (backButton == null)
            backButton = new UiSelector().resourceId("com.cropx.adaptive:id/leftTextView").makeUiObject();
        return backButton;
    }


    public UiObject fabCreateButton() {
        if (fabCreateButton == null)
            fabCreateButton = new UiSelector().resourceId("com.cropx.adaptive:id/fab_create_button").makeUiObject();
        return fabCreateButton;
    }


}
