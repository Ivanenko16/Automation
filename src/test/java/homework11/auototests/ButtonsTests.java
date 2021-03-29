package homework11.auototests;

import homework11.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTest {


    @Epic("Buttons")
    @Feature("Navigate to Home page")
    @Test(description = "Test with steps")
    public void navigateToHomePage() {
        openUrl("http://www.leafground.com/pages/Button.html");
        clickButton("Go To Home Page");
        verifyHeadingMainPage();
    }

    @Step("Open {url} url.")
    private void openUrl(String url) {
        url = page.buttons().buttonPageUrl;
        page.open(url);
        System.out.println("Opening url " + url);
    }

    @Step("Navigate to main page: click on the {button} button.")
    private void clickButton(String button) {
        button = page.getText(page.buttons().goToHomePageButtonPath);
        page.buttons().goToHomePage();
        System.out.println("Click on the button " + button);
    }

    @Step("Verify heading main page")
    private void verifyHeadingMainPage() {
        Assert.assertEquals(page.getText(page.buttons().headingMainPagePath), page.buttons().headingMainPage);
    }

    @Epic("Buttons")
    @Test
    public void getPositionButton() {
        page.open(page.buttons().buttonPageUrl);
        page.buttons().getPositionButton(page.buttons().getPositionButtonPath);
    }

    @Epic("Buttons")
    @Test
    public void getColorButton() {
        page.open(page.buttons().buttonPageUrl);
        page.buttons().getColorButton(page.buttons().whatColorAmIButtonPath);
    }


    @Epic("Buttons")
    @Feature("Get size Button")
    @Test
    public void getSizeButton() {
        page.open(page.buttons().buttonPageUrl);
        page.buttons().getSizeButton(page.buttons().whatIsMySizeButtonPath);
    }
}
