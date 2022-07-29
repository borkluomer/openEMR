Feature: User able to login

  @smoke
  Scenario: Login with Valid Credentials
    Given User navigates to website
    When user enters valid Username
    Then user enters valid Password
    And user select "English (Australian)"
    Then user click Login Button
    And User verifies Home Page Title as "OpenEMR"