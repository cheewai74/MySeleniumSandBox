package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class PageScroll {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");
        WebElement clickLink = driver.findElement(By.linkText("Page Scroll"));
        clickLink.click();
        sleep(1000);
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        sleep(5000);
        name.sendKeys("Moses Wong");
        sleep(5000);
        WebElement date = driver.findElement(By.id("date"));
       // WebElement date
        date.sendKeys("17/05/2020");

        driver.quit();
    }
}
