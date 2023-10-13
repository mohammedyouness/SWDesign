package learn.selenium.core.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    static WebDriver webDriver;
    public WebDriver getWebDriver() {
        return webDriver;
    }
    public Driver() {
        webDriver = new ChromeDriver();
        this.maximizeWindow();
    }
    public void maximizeWindow() {
        webDriver.manage().window().maximize();
    }
    public void tearDown() {
        webDriver.quit();
    }
    public void goTo(String URL) {
        webDriver.get(URL);
    }
}
