import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SauceDemoLocators extends BaseTest {


    @Test
    private void testLocators() {
        driver.get(URL);

        By usernameId = By.id("user-name");
        By passwordName = By.name("password");
        By loginButtonClassName = By.className("btn_action");
        By productTitleTagName = By.tagName("span");
        By aboutLinkText = By.linkText("About");
        By facebookPartialLinkText = By.partialLinkText("Facebook");
    }

    @Test
    public void testLocatorsByXPath() {
        driver.get(URL);

        By xpathByAttribute = By.xpath("//input[@id='user-name']");
        By xpathByText = By.xpath("//button[text()='Login']");
        By xpathContainsAttribute = By.xpath("//input[contains(@class,'input')]");
        By xpathContainsText = By.xpath("//button[contains(text(),'Log')]");
        By xpathAncestor = By.xpath("//*[text()='Enterprise Testing']//ancestor::div");
        By xpathDescendant = By.xpath("//div[@class='product_list']/descendant::span[text()='Sauce Labs Backpack']");
        By xpathFollowing = By.xpath("//div[@class='header_container']/following::div[@class='footer']");
        By xpathParent = By.xpath("//input[@id='user-name']/parent::div");
        By xpathPreceding = By.xpath("//button[text()='Login']/preceding::input[@id='user-name']");
    }
    @Test
    public void testLocatorsBySccSelector () {
        driver.get(URL);

        By cssClass = By.cssSelector(".input_error");
        By cssMultipleClasses = By.cssSelector(".login_logo .bot_triangle");
        By cssDescendant = By.cssSelector(".login_wrapper .login_button");
        By cssId = By.cssSelector("#user-name");
        By cssTagName = By.cssSelector("input");
        By cssTagClass = By.cssSelector("input.login_input");
        By cssAttributeEquals = By.cssSelector("[type='text']");
        By cssAttributeContainsWord = By.cssSelector("[class~='error']");
        By cssAttributePrefix = By.cssSelector("[placeholder|='Username']");
        By cssAttributeStartsWith = By.cssSelector("[data-test^='login']");
        By cssAttributeEndsWith = By.cssSelector("[data-test$='submit']");
        By cssAttributeContains = By.cssSelector("[placeholder*='Password']");
    }

}
