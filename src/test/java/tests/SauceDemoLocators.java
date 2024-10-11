import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SauceDemoLocators extends BaseTest {
    String inventoryURL = "https://www.saucedemo.com/v1/inventory.html";

    @Test
    private void testLocators() {
        driver.get(URL);
        By usernameId = By.id("user-name");
        By passwordName = By.name("password");
        By loginButtonClassName = By.className("btn_action");
        By productTitleTagName = By.tagName("title");
        driver.get(inventoryURL);
        By aboutLinkText = By.linkText("About");
        By facebookPartialLinkText = By.partialLinkText("Items");
    }

    @Test
    public void testLocatorsByXPath() {
        driver.get(URL);
        By xpathByAttribute = By.xpath("//input[@id='user-name']");
        By xpathContainsAttribute = By.xpath("//input[contains(@placeholder,'User')]");
        By xpathParent = By.xpath("//parent::div//input[@id='user-name']");
        By xpathPreceding = By.xpath("//preceding::input[@id='user-name']");
        driver.get(inventoryURL);
        By xpathByText = By.xpath("//button[text()='Close Menu']");
        By xpathContainsText = By.xpath("//button[contains(text(),'Log')]");
        By xpathAncestor = By.xpath("//ancestor::div//*[text()='Products']");
        By xpathDescendant = By.xpath("//descendant::div[text()='Sauce Labs Backpack']");
        By xpathFollowing = By.xpath("//following::div[@class='header_container']");
        By xpathAnd = By.xpath("//input[@class = 'form_input' and @type = 'password']");
    }

    @Test
    public void testLocatorsBySccSelector () {
        driver.get(URL);
        By cssClass = By.cssSelector(".btn_action");
        By cssMultipleClasses = By.cssSelector(".login_logo.bot_column");
        By cssDescendant = By.cssSelector(".login_wrapper .login_button");
        By cssId = By.cssSelector("#user-name");
        By cssTagName = By.cssSelector("input");
        By cssTagClass = By.cssSelector("input.form_input");
        By cssAttributeEquals = By.cssSelector("[type='text']");
        By cssAttributeContainsWord = By.cssSelector("[class~='action']");
        By cssAttributePrefix = By.cssSelector("[placeholder|='btn']");
        By cssAttributeStartsWith = By.cssSelector("[class^='bot']");
        By cssAttributeEndsWith = By.cssSelector("[class$='action']");
        By cssAttributeContains = By.cssSelector("[placeholder*='Password']");
    }
}