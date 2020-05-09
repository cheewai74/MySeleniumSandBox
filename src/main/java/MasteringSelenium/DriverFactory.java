package MasteringSelenium;

//import net.bytebuddy.description.type.TypeDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class DriverFactory {

    private static ThreadLocal<WebDriverThread> driverThread;

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
