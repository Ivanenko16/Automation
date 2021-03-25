package homework9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Selenium2 extends DriverSetup {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AndriiIvanenko\\IdeaProjects\\TestSelenium\\drivers\\chromedriver.exe");
        driver().manage().window().maximize();
        String mainUrl = "http://www.leafground.com/";
        String waitToDisappearUrl = "http://www.leafground.com/pages/disapper.html";
        String waitForTextChangeUrl = "http://www.leafground.com/pages/TextChange.html";
        String radioButtonsUrl = "http://www.leafground.com/pages/radio.html";
        String checkboxesUrl = "http://www.leafground.com/pages/checkbox.html";

        driver().get(mainUrl);
        goToButtonPage();
        Thread.sleep(3000);

        clickButton();
        goToButtonPage();
        Thread.sleep(3000);
        positionButton();
        getColorButton();
        sizeButton();

        driver().get(waitToDisappearUrl);
        Thread.sleep(3000);
        checkDisappearButton();

        driver().get(waitForTextChangeUrl);
        Thread.sleep(3000);
        clickMeButton();

        driver().get(radioButtonsUrl);
        radioButtonDisplayed();
        radioButtonClick();
        choiceRadioButton();

        driver().get(checkboxesUrl);
        Thread.sleep(5000);
        choiceCheckBox();
        confirmCheckBox();
        selectAllCheckBoxes();


    }

    private static void goToButtonPage() {
        driver().findElement(By.xpath("//a[@href='pages/Button.html']")).click();
    }

    private static void clickButton() {
        WebElement goToHomePageButton = driver().findElement(By.xpath("//*[@id='home']"));
        goToHomePageButton.click();
    }

    private static void positionButton() {
        WebElement getPositionButton = driver().findElement(By.xpath("//*[@id='position']"));
        int coordinateX = getPositionButton.getLocation().getX();
        int coordinateY = getPositionButton.getLocation().getY();
        System.out.println("Get position button has coordinates:" + "\n" + "x: " + coordinateX + "\n" + "y: " + coordinateY);
    }

    private static void getColorButton() {
        WebElement whatColorAmIButton = driver().findElement(By.xpath("//*[@id='color']"));
        String colorButton = whatColorAmIButton.getAttribute("style");
        System.out.println("What color button: " + colorButton.substring(18, colorButton.length() - 1));
    }

    private static void sizeButton() {
        WebElement whatIsMySizeButton = driver().findElement(By.xpath("//*[@id='size']"));
        Dimension size = whatIsMySizeButton.getSize();
        System.out.println("Size button: " + size);
    }

    private static void checkDisappearButton() {
        WebElement DisappearButton = driver().findElement(By.xpath("//*[@id='btn']"));
        if (!DisappearButton.isDisplayed()) {
            System.out.println("The Disappear button is not displayed");
            WebElement Logo = driver().findElement(By.xpath("//*[@alt='logo Testleaf']"));
            Logo.click();
        }
    }

    private static void clickMeButton() {
        WebDriverWait wait = new WebDriverWait(driver(), 3);
        WebElement ClickMeButton = driver().findElement(By.xpath("//*[text()='Click ME!']"));
        ClickMeButton = wait.until(ExpectedConditions.visibilityOf(ClickMeButton));
        System.out.println(ClickMeButton.getText());
        ClickMeButton.click();
        Alert alertOK = driver().switchTo().alert();
        System.out.println("Alert massage: " + alertOK.getText());
        alertOK.accept();
    }

    public static void radioButtonDisplayed() {
        WebElement radioButtonYes = driver().findElement(By.xpath("//*[@id='yes']"));
        if (radioButtonYes.isDisplayed()) {
            System.out.println("Radiobutton 'yes' is displayed");
        } else {
            System.out.println("Radiobutton 'yes' is not displayed");
        }
        WebElement radioButtonNo = driver().findElement(By.xpath("//*[@id='no']"));

        if (radioButtonNo.isDisplayed()) {
            System.out.println("Radiobutton 'no' is displayed");
        } else {
            System.out.println("Radiobutton 'no' is not displayed");
        }
    }

    private static void radioButtonClick() {
        WebElement radioButtonUnChecked = driver().findElement(By.xpath("//*[@name='news' and @value='0']"));
        WebElement radioButtonChecked = driver().findElement(By.xpath("//*[@name='news' and @value='1']"));
        String str = radioButtonChecked.getAttribute("checked");
        if (str.equalsIgnoreCase("true")) {
            System.out.println("Radiobutton is selected");
            radioButtonUnChecked.click();
        }
    }

    private static void choiceRadioButton() {
        ArrayList<WebElement> arrayList = new ArrayList<>();
        arrayList.addAll(driver().findElements(By.xpath("//*[@class='myradio' and @name='age']")));
        for (WebElement element : arrayList) {

            if (element.isSelected()) {
                switch (element.getAttribute("value")) {
                    case "0":
                        System.out.println("0-20");
                        break;
                    case "1":
                        System.out.println("21-40");
                        break;
                    case "2":
                        System.out.println("Above 40 years");
                        break;
                }

            } else {
                driver().findElement(By.xpath("//*[@class='myradio' and @value='2']")).click();
            }

        }

    }

    private static void choiceCheckBox() {
        WebElement checkBoxJava = driver().findElement(By.xpath("//*[text()= 'Select the languages that you know?']/following-sibling::div[1]/input"));
        checkBoxJava.click();
    }

    private static void confirmCheckBox() {
        WebElement checkBoxSelenium = driver().findElement(By.xpath("//*[text()= 'Confirm Selenium is checked']/following-sibling::div[1]/input"));
        String str = checkBoxSelenium.getAttribute("checked");
        if (str.equalsIgnoreCase("true")) {
            System.out.println("CheckBox Selenium is selected");
        }
    }

    private static void selectAllCheckBoxes() {
        List<WebElement> webElements = driver().findElements(By.xpath("//*[text()= 'Select all below checkboxes ']/following-sibling::div/input"));
        System.out.println("Number of selected checkboxes: " + Integer.toString(webElements.size()));
        for (WebElement element : webElements) {
            element.click();
        }
    }
}
