package learn.selenium.core.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox extends Element{
//    // Constructor
    public TextBox(By textbox) {
        this.setLocator(textbox);
    }

    // Actions
    public void type(String text) {
        webDriver.findElement(locator).sendKeys(text);
    }

}
