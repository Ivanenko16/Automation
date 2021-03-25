package homework11;

import homework11.pages.Buttons;
import homework11.pages.Links;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    public WebDriver driver;
    public WebDriverWait wait;
    private int timeOut = 10;

    public Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, timeOut);
    }

    private Buttons buttons;
    private Links links;


    public Buttons buttons() {
        return buttons == null ? buttons = new Buttons(this) : buttons;
    }

    public Links links() {
        return links == null ? links = new Links(this) : links;
    }

    public void open(String url) {
        driver.get(url);
    }

    public void click(By selector) {
        driver.findElement(selector).click();
    }

    public void click(WebElement element) {
        element.click();
    }

    public void typeText(By selector, String text) {
        driver.findElement(selector).sendKeys(text);
    }

    public String getText(By selector) {
        return driver.findElement(selector).getText();
    }

    public String getText(WebElement element) {
        return element.getText();
    }
}
