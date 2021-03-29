package homework11.auototests;

import homework11.BaseTest;
import homework11.utils.Screenshot;
import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LinksTests extends BaseTest {

    @Epic("Links")
    @Test
    public void navigateToHomePage() {
        page.links().openLinkPage();
        page.links().navigateToHomePage();
        Assert.assertEquals(page.getText(page.buttons().headingMainPagePath), page.buttons().headingMainPage + "123");
    }

    @Epic("Links")
    @Test
    public void findPathLink() {
        page.links().openLinkPage();
        String potentialLink = page.links().findPathLink();
        page.open(potentialLink);
        Assert.assertEquals(page.driver.getCurrentUrl(), potentialLink);
    }

    @Epic("Links")
    @Test
    @Issue("TEST-206")
    @TmsLink("JENKINS-45678")
    public void verifyBrokenLink() {
        page.links().openLinkPage();
        page.click(page.links().verifyLink);
        page.driver.getTitle();
        Assert.assertEquals(page.driver.getTitle(), "HTTP Status 404 - Not Found");
    }

    @Epic("Links")
    @Test
    public void countLinks() {
        page.links().openLinkPage();
        page.links().countLinks();
    }


}

