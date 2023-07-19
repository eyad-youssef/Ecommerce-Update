package pages;

//import org.example.Definitions.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class LoginPage extends BasePage {
    WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
    WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
    WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/input[1]"));


    public void clickLoginButton1() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.cssSelector(".ico-login"));
        loginButton.click();

    }


    public void login() {
        email.sendKeys("beeeb123@beeeeb.com");
        password.sendKeys("asd123");
        loginButton.click();

    }


    public WebElement get_login_validation1() {


        WebElement buttonlist = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        /* Actions actions = new Actions(Setup.d);
         actions.moveToElement(buttonlist).perform();*/

        return buttonlist;
    }
//    public WebElement get_invalidlogin_text(){
//        return Setup.d.findElement(By.cssSelector(".message-error"));
//    }
//    public WebElement get_invalidlogin_textcolor(){
//        return Setup.d.findElement(By.cssSelector(".message-error"));
//    }
//


}
