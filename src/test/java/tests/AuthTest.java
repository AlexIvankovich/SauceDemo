package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AuthTest extends BaseTest {

    private static String passFieldIsEmptyMessage = "Epic sadface: Password is required";
    
    private static String userNameFieldIsEmptyMessage = "Epic sadface: Username is required";

    @Test
    public void UserShouldBeAutoriseWithValidUserNameAndPassword() {

        authPage.open();
        authPage.inputLoginAnDPassword("standard_user","secret_sauce");
        authPage.clickLoginButton();

        assertTrue(inventoryPage.inventoryPageIsOpen (), "Product label is not displayed");
    }


    @Test
    public void UserShouldNotBeAutoriseIfPasswordFieldIsEmpty() {

        authPage.open();
        authPage.inputLoginAnDPassword("standard_user","");
        authPage.clickLoginButton();
        String errorMessage = authPage.getErrorMessage();

        assertEquals(errorMessage,passFieldIsEmptyMessage, "Сообщение об ошибке не совпадает с эталоном");
      
    }
    @Test
    public void UserShouldNotBeAutoriseIfPasswordAndUserNameFieldsIsEmpty() {

        authPage.open();
        authPage.inputLoginAnDPassword("","");
        authPage.clickLoginButton();
        String errorMessage = authPage.getErrorMessage();

        assertEquals(errorMessage,userNameFieldIsEmptyMessage, "Сообщение об ошибке не совпадает с эталоном");
      
    }
}  
