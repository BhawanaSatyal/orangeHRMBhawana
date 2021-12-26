package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginSuccessPage extends Utils{
    By _logInSuccess = By.xpath("//h1");
    By _empLoginSuccess = By.id("welcome");

    LoadProp loadProp = new LoadProp();


    public void userIsLoggedInSuccessfully() {

        Assert.assertTrue(driver.findElement((_logInSuccess)).isDisplayed());
    }

        public void empUserIsLoggedInSuccessfully(){
       Assert.assertTrue(getTextFromElement(_empLoginSuccess).contains(loadProp.getProperty("firstname")));


    }

}
