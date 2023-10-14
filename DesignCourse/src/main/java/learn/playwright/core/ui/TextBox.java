package learn.playwright.core.ui;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class TextBox {
    // Locators
    private final Locator textbox;
    // Constructor
    public TextBox(String selector) {
        this.textbox = Driver.page.locator(selector);
    }

    // Actions
    public void type(String text) {
        textbox.fill(text);
    }
}
