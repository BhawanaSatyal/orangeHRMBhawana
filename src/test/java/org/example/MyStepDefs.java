package org.example;

import io.cucumber.java.en.*;

public class MyStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    LoginSuccessPage loginSuccessPage = new LoginSuccessPage();
    LogOutPage logOutPage = new LogOutPage();
    AddNewEmployee addNewEmployee = new AddNewEmployee();
    NewEmployeeSuccessPage newEmployeeSuccessPage = new NewEmployeeSuccessPage();
    DeleteEmployee deleteEmployee = new DeleteEmployee();

    @Given("User is on log in page")
    public void user_is_on_log_in_page() {
        homePage.checkUserISOnHomePage(); // click on HomePage

    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPage.enterUserName(); // enter userName


    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.enterValidPassword();// enter valid password

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.submitClickButton(); // click on Log in

    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        loginSuccessPage.userIsLoggedInSuccessfully();


    }


    @Given("User is logged in successfully")
    public void user_is_logged_in_successfully() {

        i_am_already_logged_in_as_admin_user();// reused method

    }
    @When("user clicks welcome dropdown")
    public void user_clicks_welcome_dropdown() {
     logOutPage.clickOnWelcomeDropdown(); // click on dropdown

    }
    @When("User clicks logout button")
    public void user_clicks_logout_button() {
        logOutPage.clickOnLogout(); // click on logout

    }
    @Then("User should be logged out successfully")
    public void user_should_be_logged_out_successfully() {

    }



    @Given("I am already logged in as admin user")
    public void i_am_already_logged_in_as_admin_user() {
        loginPage.enterUserName();
        loginPage.enterValidPassword();
        loginPage.submitClickButton();
        addNewEmployee.checkUserIsOnLogInSuccessPage1();



    }
    @Given("I click on PIM")
    public void i_click_on_pim() {
        addNewEmployee.hoverOnPim();

    }
    @When("I click on Add")
    public void i_click_on_add() { // click on add

    }
    @When("I Fill up First Name")
    public void i_fill_up_first_name() { // type in First Name
        addNewEmployee.typeFirstName();

    }
    @When("I fill up Last Name")
    public void i_fill_up_last_name() {  //Type in last Name
        addNewEmployee.typeLastName();

    }
    @When("I type in Employee Id")
    public void i_type_in_employee_id() {  // type in employee id
        addNewEmployee.typeEmployeeID();

    }
    @When("I click on Create Login Details checkbox")
    public void i_click_on_create_login_details_checkbox() {
        addNewEmployee.clickOnCreateLoginDetailsCheckbox();  // create new employee

    }
    @Then("I create Username")
    public void i_create_username() {
        addNewEmployee.fillUpUserName(); // enter username

    }
    @Then("I create Password")
    public void i_create_password() {
        addNewEmployee.fillUpPassword(); // enter password

    }
    @Then("I confirm Password")
    public void i_confirm_password() {
        addNewEmployee.confirmPassword(); // confirm password

    }
    @Then("I select Enabled Dropdown")
    public void i_select_enabled_dropdown() {
        addNewEmployee.clickOnEnabled();

    }
    @Then("I click on Save button")
    public void i_click_on_save_button() {
        addNewEmployee.clickOnSaveButton();

    }
    @Then("new employee should be added successfully")
    public void new_employee_should_be_added_successfully() {
        newEmployeeSuccessPage.verifyEmployeeIsAddedSuccessfully();
    }


    @Then("logout as admin user")
    public void logout_as_admin_user() {
        addNewEmployee.clickOnWelcome();
        addNewEmployee.clickOnLogoutBtn1();


    }
    @When("I Log in as employee")
    public void i_log_in_as_employee() {
        addNewEmployee.typeInEmpUserName();
        addNewEmployee.typeInEmpPassword();


    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        addNewEmployee.clickOnEmpLogIn();
        loginSuccessPage.empUserIsLoggedInSuccessfully();


    }


    @Given("I am logged as admin user")
    public void i_am_logged_as_admin_user() {
        i_am_already_logged_in_as_admin_user();


    }
    @Given("I hover around PIM")
    public void i_hover_around_pim() {
        //deleteEmployee.hoverOnPim1();

    }
    @When("I click on Employee List")
    public void i_click_on_employee_list() {
        deleteEmployee.hoverOnPim1();

    }
    @When("I type in Employee Name")
    public void i_type_in_employee_name() {

        deleteEmployee.searchEmployeeName();

    }
    @When("I click on search")
    public void i_click_on_search() {
        deleteEmployee.clickOnSearch1();

    }
    @When("I click on id I want to delete")
    public void i_click_on_id_i_want_to_delete() {
        deleteEmployee.tickOnDelete();

    }
    @When("I click on delete button")
    public void i_click_on_delete_button() {
        deleteEmployee.clickOnDelete();
        deleteEmployee.confirmDeleteRecords();

    }
    @Then("employee should be deleted successfully")
    public void employee_should_be_deleted_successfully() {
        deleteEmployee.verifyEmployeeDeletedSuccessfully();

    }

    }





