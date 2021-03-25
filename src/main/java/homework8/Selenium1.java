package homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;


public class Selenium1 {
    public static void main(String[] args) {

        String mainUrl = "http://www.leafground.com/pages/Window.html";

        By openMultipleWindowsButton = By.xpath("//button[@onclick='openWindows()']");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AndriiIvanenko\\IdeaProjects\\TestSelenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);
        driver.get(mainUrl);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element;
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(openMultipleWindowsButton));
        element.click();

        String originalWindowHandle = driver.getWindowHandle();
        System.out.println("original Window handles are: " + originalWindowHandle);
        System.out.println("Title of original Page: " + driver.getTitle());
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        int count = windowHandles.size();

        if (count > 1) {
            for (String window : windowHandles) {
                if (!window.equals(originalWindowHandle)) {
                    driver.switchTo().window(window);
                    String url = driver.getCurrentUrl();
                    String title = driver.getTitle();
                    System.out.println("current url is: " + url);
                    System.out.println("current title is: " + title);

                    if (driver.getTitle().contains("Interact with Buttons")) {
                        driver.switchTo().window(window);
                        driver.manage().window().maximize();

                        List<WebElement> elements = driver.findElements(By.xpath("//*[@for]"));
                        for (WebElement el : elements) {
                            if (el.isDisplayed()) {
                                System.out.println("Title for button: " + el.getText());
                            }
                        }
                    }

                }
            }
        }
        driver.quit();
    }
}