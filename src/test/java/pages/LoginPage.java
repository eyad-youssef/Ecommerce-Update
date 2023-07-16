package pages;

//import org.example.Definitions.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class LoginPage extends BaseTest {

 public  void  going (){
     webDriver.navigateTo();
 }

    public void clickLoginButton1() throws InterruptedException {
        Thread.sleep(4000);
        WebElement loginButton = webDriver.getWebDriver().findElement(By.cssSelector(".ico-login"));
        loginButton.click();

    }
    public WebElement enter_Email1()
    {
        return webDriver.getWebDriver().findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
    }

    public WebElement enter_Password1()
    {
        return  webDriver.getWebDriver().findElement(By.xpath("//*[@id=\"Password\"]"));
    }

    public  WebElement click_Final_Login1()
    {
        return webDriver.getWebDriver().findElement(By.cssSelector(".login-button"));
    }
    public WebElement get_login_validation1(){


        WebElement buttonlist = webDriver.getWebDriver().findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
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
