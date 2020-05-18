package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirmation {

    public WebDriver driver;

    public Confirmation(WebDriver driver) {
        this.driver = driver;
    }

    public static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10 );
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        //string alertText = alert.getText();
    }

    public static String getAlertBannerText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }

}
