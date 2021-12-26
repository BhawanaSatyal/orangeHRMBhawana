package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage{

    LoadProp loadProp = new LoadProp();

    String browserName = "Chrome";

    public void openBrowser(){   // openBrowser method

        if (browserName.equalsIgnoreCase("chrome")) // applied if else conditions
        {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe" );
            driver = new ChromeDriver();

        }
        else if ( browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else {
            System.out.println("Incorrect Browser");
        }

        driver.manage().window().maximize();// maximise screen
        driver.get(loadProp.getProperty("url"));// load url
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// wait applied
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS );
    }

         public void closeBrowser(){
         driver.close();// close browser

         }


}
