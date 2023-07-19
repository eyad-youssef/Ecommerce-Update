package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class searchFunction extends BasePage {
    WebElement currencyList =driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]"));
    public Select currencyList()
    {
        return new Select(cuurencyList);
    }


    public  void changeCurrency(){
        currencyList().selectByVisibleText("Euro");

    }

    
    public  void  selectCurrency2()
    {
        currencyList().selectByVisibleText("US Dollar");
    }

//
//  public  String getsign(){ Setup.d.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span"))  ;}

    public void  check(){
        String  sign;
        List<WebElement> grid =  Setup.d.findElements(By.cssSelector("div.item-grid:nth-child(2)"));

        for (int i=0; i<grid.size();i++){

            sign = grid.get(i).getText();
            if (sign.contains("€"))
            {
                System.out.println(" euro sign found  ");
            }


        }

    }
