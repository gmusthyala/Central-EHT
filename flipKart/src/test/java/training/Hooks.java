package training;

import Drivers.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hooks {
    DriverManager driverManager= new DriverManager();
    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.navigateTo("http://demo.guru99.com/test/newtours/");
        driverManager.maxBrowser();
        driverManager.impliWait();

    }
    @After
    public void tearDown(){
        driverManager.sleep();
    }
}
