package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void submitForm(WebDriver driver){

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

    }

}