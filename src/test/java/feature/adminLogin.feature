Feature: Successful admin Log in

  Scenario: Admin User should be logged in with valid credentials

    Given User is on log in page
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should be logged in successfully

