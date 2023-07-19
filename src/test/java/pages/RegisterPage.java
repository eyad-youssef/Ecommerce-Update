package pages;


import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tests.BaseTest;

public class RegisterPage extends BasePage {

    WebElement genderCheckBox = driver.findElement(By.id("gender-male"));
    WebElement firstName = driver.findElement(By.id("FirstName"));
    WebElement lastName = driver.findElement(By.id("LastName"));
    WebElement day = driver.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(1)"));
    WebElement month = driver.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(2)"));
    WebElement year = driver.findElement(By.cssSelector(".date-picker-wrapper > select:nth-child(3)"));
    WebElement email = driver.findElement(By.id("Email"));
    WebElement companyName = driver.findElement(By.id("Company"));
    WebElement newsLetterCheckBox = driver.findElement(By.id("Newsletter"));
    WebElement password = driver.findElement(By.id("Password"));
    WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
    WebElement clickRegisterButton = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));


    public void register() {
        genderCheckBox.click();
        firstName.sendKeys("mohamed");
        lastName.sendKeys("ali");
        dayList().selectByVisibleText("5");
        monthsList().selectByVisibleText("May");
        yearList().selectByVisibleText("1977");
        email.sendKeys("beeeb123@beeeeb.com");
        companyName.sendKeys("corporate");
        newsLetterCheckBox.click();
        password.sendKeys("asd123");
        confirmPassword.sendKeys("asd123");
        clickRegisterButton.click();


    }


    private Select dayList() {
        return new Select(day);
    }


    private Select monthsList() {
        return new Select(month);
    }


    private Select yearList() {
        return new Select(year);
    }


    public LoginPage goToLogin() {
        return new LoginPage();
    }


    public WebElement getregistertitle() {
        return driver.findElement(By.cssSelector(".result"));
    }

    public WebElement getregistertitleColor() {
        return driver.findElement(By.cssSelector(".result"));
    }


}
