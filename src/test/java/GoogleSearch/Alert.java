package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Alert {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");

        WebElement switchWin = driver.findElement(By.linkText("Switch Window"));
        switchWin.click();
        sleep(1000);

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        sleep(2000);

        org.openqa.selenium.Alert alert  = driver.switchTo().alert();
        alert.accept();

        sleep(5000);
        driver.quit();

    }

    }
