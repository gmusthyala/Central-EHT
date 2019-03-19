package Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
public class DriverManager {
    public static WebDriver driver;
    private String browser = "";
    public DriverManager() {
        PageFactory.initElements(driver, this);
    }
    public void openBrowser() {
        switch ("chrome") {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
    }
    public void navigateTo(String url) {
        driver.get("http://demo.guru99.com/test/newtours/");
    }
    public void maxBrowser() {
        driver.manage().window().maximize();
    }
    public void sleep() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } }

        public void impliWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void waitUntilElementClickable(WebElement element){
        new WebDriverWait(driver,15).until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitUntilElementInvisible(By by){
        new WebDriverWait(driver,10).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

}