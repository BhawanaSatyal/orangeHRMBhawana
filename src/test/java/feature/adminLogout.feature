Feature: Successful admin logout

  Scenario: User should be logged once logged in successfully

    Given User is logged in successfully
    When user clicks welcome dropdown
    And  User clicks logout button
    Then User should be logged out successfully