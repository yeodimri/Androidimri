package api.apps.cropX.homePage;

import core.UiObject;
import core.UiSelector;

public class homePageUiObject {

    private static UiObject
            Create_account,
            LearnMoreAboutCropX,
            TermsOfUse,
            Login,
            cropXSign;

    public UiObject Create_account() {
        if (Create_account == null) Create_account = new UiSelector().resourceId("com.cropx.adaptive:id/create_account_button").makeUiObject();
        return Create_account;
    }

    public UiObject LearnMoreAboutCropX() {
        if (LearnMoreAboutCropX == null) LearnMoreAboutCropX = new UiSelector().resourceId("com.cropx.adaptive:id/learn_more_button").makeUiObject();
        return LearnMoreAboutCropX;
    }

    public UiObject TermsOfUse() {
        if (TermsOfUse == null) TermsOfUse = new UiSelector().resourceId("com.cropx.adaptive:id/terms_text_view").makeUiObject();
        return TermsOfUse;
    }

    public UiObject Login() {
        if (Login == null) Login = new UiSelector().resourceId("com.cropx.adaptive:id/rightTextView").makeUiObject();
        return Login;
    }

    public UiObject cropXSign() {
        if (cropXSign == null) cropXSign = new UiSelector().resourceId("com.cropx.adaptive:id/logo_image_view").makeUiObject();
        return cropXSign;
    }

}
