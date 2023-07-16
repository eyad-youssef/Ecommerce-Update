package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import tests.BaseTest;

public class LoginStepDef extends BaseTest {

    @Given("User login")
    public void login() throws InterruptedException {
        browser.ecommerce.login.going();
        browser.ecommerce.login.clickLoginButton1();

//        ecommerce..login.enterUsername("AbdallahE2");
//        ecommerce.vmp.login.enterPassword("123456");
//        ecommerce.vmp.login.clickOnLoginButton();
//        ecommerce.vmp.home = ecommerce.vmp.login.login(properties.getProperty("username"), properties.getProperty("password"));
//
//        ecommerce.vmp.home.clickOnTestingPortal();
//        ecommerce.vmp.home.selectFromTestingPortalList();
//        ecommerce.vmp.vmpPage = ecommerce.vmp.home.goToVmpPage();
//
//        ecommerce.vmp.home.assertLogin();
////    ecommerce.vmp.home.isdisplayed();
    }


}
