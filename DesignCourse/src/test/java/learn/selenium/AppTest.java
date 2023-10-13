package learn.selenium;

import learn.selenium.core.ui.Driver;
import learn.selenium.pages.DemoBlaze;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

    Driver driver = new Driver();
    DemoBlaze demoBlaze = new DemoBlaze(driver);


    @BeforeTest
    public void setUp() {
        demoBlaze.open();
    }

    @Test
    public void verifySignUp() {
        demoBlaze.signUp("brad","P@ssw0rd");
    }

    @AfterTest
    public void tearDown() {
        driver.tearDown();
    }
}