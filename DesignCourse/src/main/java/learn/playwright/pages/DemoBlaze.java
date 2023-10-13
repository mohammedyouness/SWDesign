package learn.playwright.pages;

import learn.playwright.core.ui.Button;
import learn.playwright.core.ui.Driver;
import learn.playwright.core.ui.TextBox;

public class DemoBlaze {
    Driver driver;
    public DemoBlaze(Driver page) {
        this.driver = page;
    }
    public Button signUp = new Button("#signin2");
    public TextBox username = new TextBox("#sign-username");
    public TextBox password = new TextBox("#sign-password");
    public Button signUpModal = new Button("#signInModal .modal-footer button.btn-primary");

    public void open() {
        driver.goTo("https://www.demoblaze.com/");
    }


    public void signUp(String username, String password) {
        this.signUp.clickOn();
        this.username.type(username);
        this.password.type(password);
        this.signUpModal.clickOn();

    }

}
