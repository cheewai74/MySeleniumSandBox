package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;

    @BeforeClass
    public void  setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
    }

    // -- Commit --
    public void googleSearchesFor(final String searchString) {
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

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
