package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class KeyboardAndMouseInput {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty( "webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");

        WebElement clickLink = driver.findElement(By.linkText("Autocomplete"));
        clickLink.click();
        sleep(1000);
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Clementi Avenue 1, Singapore");
        sleep(1000);
        WebElement autocompleteResults = driver.findElement(By.className("pac-item"));
        sleep(1000);
        autocompleteResults.click();
        driver.quit();
    }
}
