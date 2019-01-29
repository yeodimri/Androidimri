package api.apps.cropX.homePage;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class homePage {

    public homePageUiObject uiObject = new homePageUiObject();

    public void tapCreateAcount() {
        try {
            MyLogger.log.info("Tapping on the Create account Button");
            uiObject.Create_account().tap();

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("Cant tap CreateAcount Button, element absent or blocked");
        }
    }

    public void tapLearnMoreAboutCropX() {
        try {
            MyLogger.log.info("Tapping on the Learn More About CropX Button");
            uiObject.LearnMoreAboutCropX().tap();

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("Cant tap Learn More About CropX Button, element absent or blocked");
        }
    }

    public void tapTermsOfUse() {
        try {
            MyLogger.log.info("Tapping on the Terms Of Use Button");
            uiObject.TermsOfUse().tap();

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("Cant tap Terms Of Use Button, element absent or blocked");
        }
    }

    public void tapLogin() {
        try {
            MyLogger.log.info("Tapping on the Login Button");
            uiObject.Login().tap();

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("Cant tap Login Button, element absent or blocked");
        }
    }

    public void tapcropXSign() {
        try {
            MyLogger.log.info("Tapping on the cropX Sign Button");
            uiObject.cropXSign().tap();

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("Cant tap Create Acount Button, element absent or blocked");
        }
    }

}

