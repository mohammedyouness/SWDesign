package learn.playwright.core.ui;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Driver {
    static Playwright playwright;
    static Browser browser;
    static Page page;
    public Driver() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch((new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(1000)));
        page = browser.newPage();
    }

    public void goTo(String URL) {
        page.navigate(URL);
    }
}