import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest extends TestCase {

    private WebDriver driver = new FirefoxDriver();

    private By input = By.id("lst-ib");
    private By result = By.id("resultStats");

    @BeforeClass
    public void setUp() throws Exception{
        this.driver.get("http://google.com");
    }
    @Test
    public void testGoogleResult() throws Exception{
        System.out.println(this.driver.getCurrentUrl());

        WebElement googleSearch = driver.findElement(input);
        googleSearch.sendKeys("Selenium IDE \n");
        System.out.println(googleSearch.getLocation());
        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.titleContains("Selenium IDE"));


        assertTrue("Wrong message", driver.getTitle().contains("Selenium IDE"));



        WebElement resultStatus =driver.findElement(result);
        assertTrue(resultStatus.isDisplayed());





        Thread.sleep(2000);

    }

    @AfterClass
    public void tearDown() throws Exception{
        this.driver.quit();
    }



}
