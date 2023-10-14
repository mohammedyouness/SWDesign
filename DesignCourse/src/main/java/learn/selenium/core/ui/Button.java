package learn.selenium.core.ui;

import org.openqa.selenium.By;

public class Button extends Element{
    // Constructor
    public Button(By button) {
        this.setLocator(button);
    }

    // Actions
    public void clickOn() {
        webDriver.findElement(locator).click();
    }
}
