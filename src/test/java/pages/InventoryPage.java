package pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

      public static final By PRODUCT_LABEL = By.xpath("//div[text () = 'Products']");

      public InventoryPage(WebDriver driver) {
        super(driver);
    }
      public void open() {
        driver.get(URL+"/inventory.html");
    }

      public boolean inventoryPageIsOpen (){
      return driver.findElement(PRODUCT_LABEL).isDisplayed();
      
    }
    
}
