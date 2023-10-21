package learn.playwright;


import learn.playwright.core.ui.Driver;
import learn.playwright.pages.DemoBlaze;
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
        demoBlaze.signUp("demo","P@ssw0rd");
    }


}
