package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import tests.BaseTest;

public class LoginStepDef extends BaseTest {


    @Given("User register")
    public void register() throws InterruptedException {

        browser.ecommerce.home.going();
        browser.ecommerce.home.clickOnRegisterButton();
        browser.ecommerce.register = browser.ecommerce.home.goToRegisterPage();
        browser.ecommerce.register.register();


    }

    @And("user login")
    public void login() throws InterruptedException {
        browser.ecommerce.login = browser.ecommerce.register.goToLogin();
        browser.ecommerce.login.login();

    }


}
