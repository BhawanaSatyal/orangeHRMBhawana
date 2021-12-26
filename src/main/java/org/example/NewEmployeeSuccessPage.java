package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewEmployeeSuccessPage extends Utils{

    By _newEmployee = By.xpath(" //*[@id=\"pdMainContainer\"]/div[1]/h1");

    public void verifyEmployeeIsAddedSuccessfully(){
      //  Assert.assertTrue(driver.findElement((_newEmployee)).isEnabled());
        Assert.assertTrue(driver.findElement((_newEmployee)).isDisplayed());
    }
}
