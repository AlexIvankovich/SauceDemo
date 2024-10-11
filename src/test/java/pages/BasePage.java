package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage  {
    WebDriver driver;

    public static final String URL = "https://www.saucedemo.com/v1/";
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
