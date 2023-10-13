package learn.selenium.core.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {
    // Locators
    private final By button;
    // Driver
    private static WebDriver webDriver;
    public static void setDriver(WebDriver driver) {
        webDriver = driver;
    }
    // Constructor
    public Button(By button) {
        this.button = button;
    }

    // Actions
    public void clickOn() {
        webDriver.findElement(button).click();
    }
}
