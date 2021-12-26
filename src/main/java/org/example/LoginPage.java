package org.example;

import org.openqa.selenium.By;


public class LoginPage extends Utils {

    By text_Username = By.id("txtUsername");
    By text_password = By.id("txtPassword");
    By _logInButton = By.xpath("//input[@type = 'submit']");


    LoadProp loadProp = new LoadProp();

    public void enterUserName(){
        typeText(text_Username, loadProp.getProperty("username"));
    }

    public void enterValidPassword()
    {
        typeText(text_password, loadProp.getProperty("password"));
    }

    public void submitClickButton(){
        clickOnElement(_logInButton);
    }

    }



