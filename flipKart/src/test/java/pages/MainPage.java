 package pages;

import Drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends DriverManager {


    @FindBy(xpath = "//a[contains(text(),'Flights')]")
  private   WebElement flightSearch;


    public void search(){
        flightSearch.click();
    }

    public String getUrl(){
        return driver.getCurrentUrl();

    }
}
