package Browser;

import Ecommerce.Ecommerce;
import driver.WebDriverSingleton;

public class Browser {
    WebDriverSingleton webdriver = WebDriverSingleton.getDriverSingleton();
    public Ecommerce ecommerce;
    public Browser() {


        ecommerce = new Ecommerce();

    }
}
