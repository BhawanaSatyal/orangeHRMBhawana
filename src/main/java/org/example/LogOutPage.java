package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogOutPage extends Utils{

    By _welcome_Dropdown = By.id("welcome");
    By _logOutButton = By.xpath("//a[@href='/index.php/auth/logout']");
    By _logInSuccess = By.xpath("//h1");


    public void checkUserIsOnLogInSuccessPage(){
        Assert.assertTrue(driver.findElement((_logInSuccess)).isDisplayed());


    }
  public void clickOnWelcomeDropdown(){
        clickOnElement(_welcome_Dropdown);}


    public void clickOnLogout()
    {
        clickOnElement(_logOutButton);
    }
}



