package core;

import api.android.Android;
import core.managers.DriverManager;
import core.managers.ServerManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;

public class UiObject {


    public String locator;

    UiObject(String locator) {
        this.locator = locator;
        System.out.println(this.locator);

    }

    private boolean isXpath() {
        return !locator.contains("UiSelector");
    }

    public boolean exists() {
        MyLogger.log.debug("checking if Object Exists...");
        try {
            WebElement element;
            if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
            else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {

            return false;
        }


    }

    public boolean isChecked() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("checked").equals("true");
    }

    public boolean isCheckable() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("Checkable").equals("true");
    }

    public boolean isClikable() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("Clikable").equals("true");
    }

    public boolean isEnabled() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("enabled").equals("true");
    }

    public boolean isFocusable() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("focusable").equals("true");
    }

    public boolean isFocused() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("focused").equals("true");
    }

    public boolean isScrollable() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("scrollable").equals("true");
    }

    public boolean isSelected() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("selected").equals("true");
    }

    public Point getLocation() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getLocation();
    }

    public String getText() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("name");
    }

    public String getResourceId() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("resourceId");
    }

    public String getClassName() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("className");
    }

    public String getContentDesc() {
        WebElement element;
        if (isXpath()) element = ServerManager.getDriver().findElementByXPath(locator);
        else element = ServerManager.getDriver().findElementByAndroidUIAutomator(locator);
        return element.getAttribute("contentDesc");
    }

    public UiObject clearText() {

        if (isXpath()) ServerManager.getDriver().findElementByXPath(locator).clear();
        else ServerManager.getDriver().findElementByAndroidUIAutomator(locator).clear();
        return this;

    }

    public UiObject typeText(String value) {
        if (isXpath()) ServerManager.getDriver().findElementByXPath(locator).sendKeys(value);
        else ServerManager.getDriver().findElementByAndroidUIAutomator(locator).sendKeys(value);
        return this;
    }

    public UiObject tap(){
        if (isXpath()) ServerManager.getDriver().findElementByXPath(locator).click();
        else ServerManager.getDriver().findElementByAndroidUIAutomator(locator).click();
        return this;
    }

 //   public UiObject scrollTo(){

    public UiObject waitToAppear(int seconds){
        Timer timer = new Timer();
        timer.start();
        while(!timer.expired(seconds)) if(exists()) break;
        if(timer.expired(seconds) && !exists()) throw new AssertionError("Element "+locator+" failed to appear within "+seconds+" seconds");
        return this;
    }
    public UiObject waitToDisappear(int seconds){
        Timer timer = new Timer();
        timer.start();
        while(!timer.expired(seconds)) if(!exists()) break;
        if(timer.expired(seconds) && exists()) throw new AssertionError("Element "+locator+" failed to disappear within "+seconds+" seconds");
        return this;
    }

}

