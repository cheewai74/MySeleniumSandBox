package MasteringSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverThread {

    private WebDriver driver;
    private final String OperatingSystem = System.getProperty("on name").toUpperCase();
    private final String SystemArchitecture = System.getProperty("os arch").toUpperCase();

    public WebDriver getDriver() {
        if(null!=driver){

            System.out.println("");
            System.out.println("Current Operating System");
            System.out.println("Current System Architecture");
            System.out.println("Current Browser");
            System.out.println("");
          //  driver = new ChromeDriver(DesiredCapabilities.chrome());
            driver= new ChromeDriver();
            driver.get("http://google.com");
        }
        return driver;
    }

    public void quitDriver(){
        if(null!=driver){
            driver.quit();
            driver = null;
        }

    }
}
