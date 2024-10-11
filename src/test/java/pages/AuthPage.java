package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage extends BasePage {
    WebDriver driver;
    public static final By USERNAME_INPUT = By.id("user-name");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MASSAGE = By.xpath("//h3 [@data-test = 'error']");
    

    public void open() {
        driver.get(URL);
    }

    public void inputLoginAnDPassword(String name, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(name);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMassage() {
        return driver.findElement(ERROR_MASSAGE).getText();
    }

    public AuthPage(WebDriver driver) {
        this.driver = driver;
    }
}
