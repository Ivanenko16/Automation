package homework11.pages;

import homework11.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Links {

    private final Page page;

    public Links(Page p) {
        page = p;
        PageFactory.initElements(page.driver, this);
    }


    public String linksPageUrl = "http://www.leafground.com/pages/Link.html";
    public String linksPageHeading = "Play with HyperLinks";

    @FindBy(xpath = "//*[contains(text(), 'Play with HyperLinks')]")
    public WebElement headingLinksPage;

    @FindBy(xpath = "//*[@id='contentblock']/section/div[1]/div/div/a")
    public WebElement goHomePageLinc;

    @FindBy(xpath = "//a[contains(text(), 'Find where am supposed to go without clicking me?')]")
    public WebElement findLink;

    @FindBy(linkText = "Verify am I broken?")
    public WebElement verifyLink;

    @FindBy(how = How.LINK_TEXT, using = "How many links are available in this page?")
    public WebElement checkCountLink;

    @FindBy(xpath = "//a")
    public List<WebElement> Links;

    public void openLinkPage() {
        page.open(linksPageUrl);
    }

    public String getLinkPageHeading() {
        return headingLinksPage.getText();
    }

    public void navigateToHomePage() {
        page.click(goHomePageLinc);
    }

    public String findPathLink() {
        return findLink.getAttribute("href");
    }

    public void countLinks() {
        int count = 0;
        for (WebElement element : Links) {
            if (element.getAttribute("href").contains("#")) {
                continue;
            }
            count++;
        }
        System.out.println("Number of links: " + count);
    }
}



