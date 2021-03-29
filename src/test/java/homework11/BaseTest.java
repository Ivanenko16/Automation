package homework11;

import com.google.common.collect.ImmutableMap;
import homework11.utils.Screenshot;
import homework11.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class BaseTest {

    private final static int SECONDSTOWAIT = 10;
    public WebDriver driver;
    public Page page;
    public String BaseUrl;
    public WebDriverWait wait;

    @BeforeSuite
    public void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "89.0.4389.90")
                        .put("URL", "http://aiva2.local8888.net")
                        .build());
    }

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
