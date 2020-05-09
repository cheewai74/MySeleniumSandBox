package GoogleSearch;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class googleSearchExampleTest extends BaseTest {

    private WebDriver driver;

    @Test
    public void googleHuskies(){
        googleSearchesFor("Huskies");
    }

    @Test
    public void googleKittens(){
        googleSearchesFor("Kittens");
    }
}
