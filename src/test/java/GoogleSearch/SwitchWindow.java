package GoogleSearch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SwitchWindow {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");

        WebElement switchWin = driver.findElement(By.linkText("Switch Window"));
        switchWin.click();
        sleep(1000);

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        sleep(5000);
        driver.switchTo().window(originalHandle);
        sleep(5000);
        driver.quit();


    }
}
