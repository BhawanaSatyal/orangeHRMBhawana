package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DeleteEmployee extends Utils{
    By _txt_PIM = By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
    By _empList = By.id("menu_pim_viewEmployeeList");
    By _search_EmpName = By.id("empsearch_employee_name_empName");
    By _click_Search = By.id("searchBtn");
    By _text_Delete_Id = By.id("ohrmList_chkSelectAll");
    By _btn_Delete = By.id("btnDelete");
    By _confirm_Delete = By.id("dialogDeleteBtn");

    By _actualDeleteSuccessMsg = By.xpath("//td[@colspan='8']");


    Actions actions = new Actions(driver);

    public void hoverOnPim1() {
        actions.moveToElement(driver.findElement(_txt_PIM)).moveToElement(driver.findElement(_empList)).click().build().perform();
    }
   //public void searchEmployeeID(){typeText(_search_EmpID, loadProp.getProperty("EmployeeId"));}
    public void searchEmployeeName(){
        typeText(_search_EmpName, loadProp.getProperty("firstname") + " " + loadProp.getProperty("lastname"));

        //Press enter
        actions.sendKeys(Keys.ENTER).build().perform();



    }
    public void clickOnSearch1()
    {
        clickOnElement(_click_Search);
    }

   public void tickOnDelete(){
        clickOnElement(_text_Delete_Id);
   }
   public void clickOnDelete(){
        clickOnElement(_btn_Delete);
   }
   public void confirmDeleteRecords(){
        clickOnElement(_confirm_Delete);

   }
   public void verifyEmployeeDeletedSuccessfully(){
       Assert.assertEquals(getTextFromElement( _actualDeleteSuccessMsg), loadProp.getProperty("deleteEmpSuccessMsg"), "Error: More than ZERO records");
   }
}

