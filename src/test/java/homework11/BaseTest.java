package homework11;

import homework11.utils.Screenshot;
import homework11.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private final static int SECONDSTOWAIT = 10;
    public WebDriver driver;
    public Page page;
    public String BaseUrl;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");
        page = new Page(driver);
        driver.manage().timeouts().implicitlyWait(SECONDSTOWAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        BaseUrl = "http://www.leafground.com/home.html";
    }

    @AfterMethod
    public void takeScreenshot(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            Screenshot.screenshot(driver);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
