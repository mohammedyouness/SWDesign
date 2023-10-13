package learn.playwright.core.ui;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;



public class Button {
    // Locators
    private final Locator button;
    // Driver
    private static Page page;
    // Constructor
    public Button(String selector)
    {
        this.button = Driver.page.locator(selector);
    }

    // Actions
    public void clickOn() {
        button.click();
    }
}
