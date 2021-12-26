package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AddNewEmployee extends Utils {
    LoadProp loadProp = new LoadProp();

    By _logInSuccess = By.xpath("//h1");
    By _pimPage = By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
    By _addBtn = By.id("btnAdd");
    By _text_FirstName = By.id("firstName");
    By _text_LastName = By.id("lastName");
    By _text_EmployeeID = By.id("employeeId");
    By _checkBox_CreateLogin = By.id("chkLogin");
    By _text_UserName = By.id("user_name");
    By _text_Password = By.id("user_password");
    By _text_Confirmpassword = By.id("re_password");
    By _btn_Status = By.id("status");
    By _btn_Save = By.id("btnSave");

    By _welcome_Dropdown1 = By.id("welcome");
    By _logOutButton1 = By.xpath("//a[@href='/index.php/auth/logout']");
    By _txt_EmpUsername = By.id("txtUsername");
    By _txt_EmpPassword = By.id("txtPassword");
    By _click_EmpLogin = By.id("btnLogin");

    String usernameEmp = loadProp.getProperty("usernameEmp") + currentTimeStamp();


    Actions actions = new Actions(driver);


    public void checkUserIsOnLogInSuccessPage1() {Assert.assertTrue(driver.findElement((_logInSuccess)).isDisplayed());}

    public void hoverOnPim(){
        actions.moveToElement(driver.findElement(_pimPage)).moveToElement(driver.findElement(By.id("menu_pim_addEmployee"))).click().build().perform();//mouse hover action
    }

    public void typeFirstName(){typeText(_text_FirstName, loadProp.getProperty("firstname"));}  // method created
    public void typeLastName() {typeText(_text_LastName, loadProp.getProperty("lastname"));}
    public void typeEmployeeID(){typeText(_text_EmployeeID, loadProp.getProperty("EmployeeId"));}
    public void clickOnCreateLoginDetailsCheckbox(){clickOnElement(_checkBox_CreateLogin);}
    public void fillUpUserName(){typeText(_text_UserName, usernameEmp) ;}
    public void fillUpPassword(){typeText(_text_Password, loadProp.getProperty("passwordEmp"));}
    public void confirmPassword (){typeText(_text_Confirmpassword, loadProp.getProperty("confirmpassword"));}
    public void clickOnEnabled(){clickOnElement(_btn_Status);}
    public void clickOnSaveButton(){clickOnElement(_btn_Save);}
    public void clickOnWelcome(){clickOnElement(_welcome_Dropdown1);}
    public void clickOnLogoutBtn1(){clickOnElement(_logOutButton1);}
    public void typeInEmpUserName(){typeText(_txt_EmpUsername, usernameEmp);}
    public void typeInEmpPassword(){typeText(_txt_EmpPassword, loadProp.getProperty("passwordEmp"));}
    public void clickOnEmpLogIn(){clickOnElement(_click_EmpLogin);}


}