package pages;

import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver = WebDriverSingleton.getWebDriver();


//    public BasePage() {
//
////        PageFactory.initElements(driver, this);
//    }


    public WebElement findElement(By element){
        return  driver.findElement(element);
}
}
