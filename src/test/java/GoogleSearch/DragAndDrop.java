package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");

        WebElement dragdropclicked = driver.findElement(By.linkText("Drag and Drop"));
        dragdropclicked.click();
        sleep(1000);

        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        sleep(1000);
        actions.dragAndDrop(image, box).build().perform();
        sleep(5000);
        driver.quit();
    }
}
