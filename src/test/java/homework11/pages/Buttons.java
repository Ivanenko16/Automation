package homework11.pages;

import homework11.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class Buttons {
    private Page page;

    public Buttons(Page p) {
        page = p;
    }

    public String buttonPageUrl = "http://www.leafground.com/pages/Button.html";
    public String headingMainPage = "Locators and Selenium Interactions";

    public By headingMainPagePath = By.xpath("//*[contains(text(), 'Selenium Interactions')]");
    public By goToHomePageButtonPath = By.xpath("//*[@id='home']");
    public By getPositionButtonPath = By.xpath("//*[@id='position']");
    public By whatColorAmIButtonPath = By.xpath("//*[@id='color']");
    public By whatIsMySizeButtonPath = By.xpath("//*[@id='size']");

    public void goToHomePage() {
        page.click(goToHomePageButtonPath);
    }

    public void getPositionButton(By buttonPath) {
        int coordinateX = page.driver.findElement(buttonPath).getLocation().getX();
        int coordinateY = page.driver.findElement(buttonPath).getLocation().getY();
        System.out.println("Button has coordinates:" + "\n" + "x: " + coordinateX + "\n" + "y: " + coordinateY);
    }

    public void getColorButton(By buttonPath) {
        String colorButton = page.driver.findElement(buttonPath).getAttribute("style");
        System.out.println("Button has color: " + colorButton.substring(18, colorButton.length() - 1));
    }

    public void getSizeButton(By buttonPath) {
        Dimension size = page.driver.findElement(buttonPath).getSize();
        System.out.println("Size button: " + size);
    }
}
