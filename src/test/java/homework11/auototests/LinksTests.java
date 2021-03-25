package homework11.auototests;

import homework11.BaseTest;
import homework11.utils.Screenshot;
import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class LinksTests extends BaseTest {

    @Test
    @Epic("Links")
    public void navigateToHomePage() {
        page.links().openLinkPage();
        page.links().navigateToHomePage();
        Assert.assertEquals(page.getText(page.buttons().headingMainPagePath), page.buttons().headingMainPage);
    }

    @Test
    @Epic("Links")
    public void findPathLink() {
        page.links().openLinkPage();
        String potentialLink = page.links().findPathLink();
        page.open(potentialLink);
        Assert.assertEquals(page.driver.getCurrentUrl(), potentialLink);
    }

    @Test
    @Epic("Links")
    public void verifyBrokenLink() {
        page.links().openLinkPage();
        page.click(page.links().verifyLink);
        page.driver.getTitle();
        Assert.assertEquals(page.driver.getTitle(), "HTTP Status 404 - Not Found");
    }

    @Test
    @Epic("Links")
    public void countLinks() {
        page.links().openLinkPage();
        page.links().countLinks();
    }
}

