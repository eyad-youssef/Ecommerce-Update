package pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {


    public void going() throws InterruptedException {

        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(4000);
    }

    public void clickOnRegisterButton() {
        driver.findElement(By.xpath("//a [@class = 'ico-register']")).click();
    }


    public RegisterPage goToRegisterPage() {
        return  new RegisterPage();


    }
}
