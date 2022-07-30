Feature: validate Facilities tab

  Background:Login with Valid Credentials
    Given User navigates to website
    When user enters valid Username
    Then user enters valid Password
    And user select "English (Australian)"
    Then user click Login Button
    And User verifies Home Page Title as "OpenEMR"

@smoke1
  Scenario:User add user to facilities
    When user navigates to Admin//clinic/Facilities
    And User validates that user can see text as "Facilities"
    Then user click add facilities
    And User fill the form
    |Name | Renastech|
    |Color|#FF00FF   |







