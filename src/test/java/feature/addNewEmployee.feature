Feature: Add new employee
  @regression

  Scenario: As a admin user, I should be able to add new employee


    Given I am already logged in as admin user
    And I click on PIM
    When I click on Add
    And I Fill up First Name
    And I fill up Last Name
    And I type in Employee Id
    And I click on Create Login Details checkbox
    Then I create Username
    And I create Password
    And I confirm Password
    And I select Enabled Dropdown
    And I click on Save button
    Then new employee should be added successfully
    And logout as admin user
    When I Log in as employee
    Then I should be logged in successfully







