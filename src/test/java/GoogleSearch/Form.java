package GoogleSearch;

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Form {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // id  first-name
        driver.findElement(By.id("first-name")).sendKeys("Moses");
        driver.findElement(By.id("last-name")).sendKeys("Wong");
        driver.findElement(By.id("job-title")).sendKeys("Software Engineer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/18/2010");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);

        // Annotate each class by adding the dot
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        driver.quit();
    }
}
