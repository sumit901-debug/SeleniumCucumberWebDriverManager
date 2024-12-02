Feature: New User Registration view

  Scenario: Validate new user is able to view after clicking on new registration
    Given User navigates to the Login page
    When User clicks on new Registration button
    Then User should be able to view the Registration page