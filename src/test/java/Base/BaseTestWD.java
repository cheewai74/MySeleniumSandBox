package Base;

import MasteringSelenium.DriverFactory;
import MasteringSelenium.WebDriverThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTestWD {

    //private WebDriver driver = DriverFactory.getDriver();
    private static ThreadLocal<WebDriverThread> driverThread;
   // private WebDriver driver;

    @BeforeClass
    public void  setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
       // driver= new ChromeDriver();
      //  driverThread.get("http://google.com");
    }

    @BeforeSuite
    public static void instantiateDriverObject(){
        driverThread = new ThreadLocal<WebDriverThread>(){
            @Override
            protected WebDriverThread initialValue() {
                WebDriverThread webDriverThread = new WebDriverThread();
                return webDriverThread;
            }
        };
    }

    public static WebDriver getDriver() {
        return driverThread.get().getDriver();
    }

    @AfterClass
    public static void quiteDriver(){
        driverThread.get().quitDriver();
    }
}
