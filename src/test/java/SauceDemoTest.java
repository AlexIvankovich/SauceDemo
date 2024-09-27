import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest {


    @Test
    public void testAddToCart() {
        driver.get(URL);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.cssSelector(".btn_inventory")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        WebElement productNameElement = driver.findElement(By.cssSelector(".inventory_item_name"));
        String actualProductName = productNameElement.getText();


        WebElement productPriceElement = driver.findElement(By.cssSelector(".inventory_item_price"));
        String actualProductPrice = productPriceElement.getText();

        Assert.assertEquals("Sauce Labs Backpack", actualProductName);
        Assert.assertEquals("29.99", actualProductPrice);
    }

}
