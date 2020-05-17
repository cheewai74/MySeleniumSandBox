package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.enumerate;
import static java.lang.Thread.sleep;

public class Radiobuttons {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        sleep(1000);
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value=option2]"));
        radioButton2.click();
        sleep(1000);
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioButton3.click();
        sleep(1000);

        driver.quit();
    }
}
