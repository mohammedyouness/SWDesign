package learn.selenium.core.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Element {
    protected By locator;
    protected static WebDriver webDriver;

    public void setLocator(By locator) {
        this.locator = locator;
    }
    public static void setDriver(WebDriver driver) {
        webDriver = driver;
    }
    public boolean isDisplayed(By locator) {
        if (webDriver.findElement(locator).isDisplayed()) {
            return true;
        } else {
            System.out.println("Element not found...");
            return false;
        }
    }

}
