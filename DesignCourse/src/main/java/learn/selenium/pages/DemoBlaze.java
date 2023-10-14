package learn.selenium.pages;

import learn.selenium.core.ui.Button;
import learn.selenium.core.ui.Driver;
import learn.selenium.core.ui.Element;
import learn.selenium.core.ui.TextBox;
import org.openqa.selenium.By;

public class DemoBlaze {
Driver webDriver;
    public DemoBlaze(Driver webDriver) {
        this.webDriver = webDriver;
        Element.setDriver(webDriver.getWebDriver());
    }

    public Button signUp = new Button(By.id("signin2"));
    public TextBox username = new TextBox(By.id("sign-username"));
    public TextBox password = new TextBox(By.id("sign-password"));
    public Button signUpModal = new Button(By.cssSelector("#signInModal .modal-footer button.btn-primary"));




    public void open() {
        webDriver.goTo("https://www.demoblaze.com/");
    }


    public void signUp(String username, String password) {
        this.signUp.clickOn();
        this.username.type(username);
        this.password.type(password);
        this.signUpModal.clickOn();
    }

}
