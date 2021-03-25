package homework11.auototests;

import homework11.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTest {

    @Test
    @Epic("Buttons")
    @Feature("Navigate to Home page")
    public void goToHomePage() {
        page.open(page.buttons().buttonPageUrl);
        page.buttons().goToHomePage();
        Assert.assertEquals(page.getText(page.buttons().headingMainPagePath), page.buttons().headingMainPage);
    }

    @Test
    @Epic("Buttons")
    public void getPositionButton() {
        page.open(page.buttons().buttonPageUrl);
        page.buttons().getPositionButton(page.buttons().getPositionButtonPath);
    }

    @Test
    @Epic("Buttons")
    public void getColorButton() {
        page.open(page.buttons().buttonPageUrl);
        page.buttons().getColorButton(page.buttons().whatColorAmIButtonPath);
    }

    @Test
    @Epic("Buttons")
    @Feature("Get size Button")
    public void getSizeButton() {
        page.open(page.buttons().buttonPageUrl);
        page.buttons().getSizeButton(page.buttons().whatIsMySizeButtonPath);
    }
}
