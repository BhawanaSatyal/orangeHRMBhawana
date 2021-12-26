Feature: Delete Employee
  @regression

  Scenario: As Admin user I should be able to delete employee

    Given I am logged as admin user
    And I hover around PIM
    When I click on Employee List
    And I type in Employee Name
    And I click on search
    And I click on id I want to delete
    And I click on delete button
    Then employee should be deleted successfully




