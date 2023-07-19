package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class SearchPage  extends BasePage {
//    public WebElement clickLoginButton()
//    {
//        return driver.findElement(By.cssSelector(".ico-login"));
//    }
//    public WebElement enter_Email()
//    {
//        return driver.findElement(By.xpath("//*[@id=\"Email\"]"))/**/;
//    }
//
//    public WebElement enter_Password()
//    {
//        return  driver.findElement(By.xpath("//*[@id=\"Password\"]"));
//    }
//
//    public  WebElement click_Final_Login()
//    {
//        return driver.findElement(By.cssSelector(".login-button"));
//    }


//
//
    WebElement searchTextField =  driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
    WebElement searchButton = driver.findElement(By.cssSelector(".search-box-button"));

    public  void search (){
        searchTextField.sendKeys("iphone 14 pro ");
        searchButton.click();

    }





    public WebElement getsearchbar(){
        return driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
    }



    public   void  getlistofproducts() throws InterruptedException {
        Thread.sleep(100);
        WebElement list = driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(list).click().perform();






//        // Webdriver wait
//        WebDriverWait wait = new WebDriverWait(Setup.d, Duration.ofSeconds(10));
//
//        getsearchbar().sendKeys("searchKey");
//      wait.until(
//               driver -> ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"ui-id-1\\\"]")).apply(driver));
//
//  // wait until the search results is displayed with the expected result
//
//            List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
//                      (By.xpath("//*[@id=\"small-searchterms\"]")));


    }
    public  WebElement getthesku(){
        return  driver.findElement(By.xpath("//*[@id=\"sku-4\"]"));
    }






}
