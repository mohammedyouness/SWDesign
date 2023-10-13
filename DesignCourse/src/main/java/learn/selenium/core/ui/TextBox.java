package learn.selenium.core.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {
    // Locators
    private final By textbox;
    // Driver
    private static WebDriver webDriver;
    public static void setDriver(WebDriver driver) {
        webDriver = driver;
    }
    // Constructor
    public TextBox(By textbox) {
        this.textbox = textbox;
    }

    // Actions
    public void type(String text) {
        webDriver.findElement(textbox).sendKeys(text);
    }

}
