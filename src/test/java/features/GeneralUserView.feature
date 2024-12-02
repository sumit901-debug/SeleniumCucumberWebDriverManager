Feature: General View

  Scenario: Validate general user is able to view products without logging in
    Given User navigates to the online product page
    When User clicks on formal Shoes drop down
    Then User should be able to view the products