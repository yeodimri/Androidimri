package api.apps.cropX.createAcount;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class createAcount {

    public createAcountUiObject uiObject = new createAcountUiObject();

    public void tapBackButton() {
        try {
            MyLogger.log.info("Tapping on the back Button");
            uiObject.backButton().tap();

        } catch (
                NoSuchElementException e) {
            throw new AssertionError("Cant tap back Button, element absent or blocked"+ e.getMessage());
        }
    }

    }



