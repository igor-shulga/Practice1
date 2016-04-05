import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest extends TestCase {

    private WebDriver driver = new FirefoxDriver();

    private By input = By.id("lst-ib");

    @BeforeClass
    public void setUp() throws Exception{
        this.driver.get("http://google.com");
    }
    public void test() throws Exception{
        System.out.println(this.driver.getCurrentUrl());

       WebElement googleSearch = driver.findElement(input);
        googleSearch.sendKeys("Selenium IDE \n");
        Thread.sleep(2000);
        //ssa
    }

    @AfterClass
    public void tearDown() throws Exception{
        this.driver.quit();
    }



}
