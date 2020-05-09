package GoogleSearch;

import Base.BaseTest;
import Base.BaseTestWD;
import MasteringSelenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class googleSearchExampleTest2 extends DriverFactory {

  //   private WebDriver driver;
    private WebDriver driver = DriverFactory.getDriver();

    private void googleSearchesFor(final String searchString) {
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.clear();
        searchField.sendKeys(searchString);
        searchField.submit();
        (new WebDriverWait(driver, 10)).until(new
                                                      ExpectedCondition<Boolean>() {
                                                          public Boolean apply(WebDriver driverObject) {
                                                              return driverObject.getTitle().toLowerCase().startsWith(searchString.toLowerCase());}
                                                      });
    }

    @Test
    public void googleHuskies(){
        googleSearchesFor("Huskies");
    }

    @Test
    public void googleKittens(){
        googleSearchesFor("Kittens");
    }
}
