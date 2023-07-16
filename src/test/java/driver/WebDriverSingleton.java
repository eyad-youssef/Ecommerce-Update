package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverSingleton {
    private static WebDriver webDriver;
    private static WebDriverSingleton webDriverSingleton = null;

    private WebDriverSingleton() {
        setDriverCapabilities();
    }

    public static WebDriverSingleton getDriverSingleton() {
        if (webDriverSingleton == null)
            webDriverSingleton = new WebDriverSingleton();
        return webDriverSingleton;
    }
    private void setDriverCapabilities() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--enable-javascript");

        webDriver = new EdgeDriver(options);
    }

    public void navigateTo() {
        webDriver.navigate().to("https://demo.nopcommerce.com/");
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }



    public void refreshCurrentUrl() {
        webDriver.navigate().refresh();
    }

    public void resetCache(){
        webDriver.manage().deleteAllCookies();
    }

    public static void close() {
        webDriver.quit();
    }



}
