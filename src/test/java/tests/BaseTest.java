package tests;

import Browser.Browser;
import driver.WebDriverSingleton;
import waits.Waits;

import java.util.Properties;

public class BaseTest  {
    protected static WebDriverSingleton webDriver;
    protected static Browser browser = new Browser();


    public BaseTest(){
        webDriver = WebDriverSingleton.getDriverSingleton();
    }
}
