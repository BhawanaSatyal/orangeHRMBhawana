package org.example;

import org.testng.Assert;

public class HomePage extends Utils {

    public void checkUserISOnHomePage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("orangehrmlive"));


    }
}