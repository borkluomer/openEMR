Feature: validate Facilities tab

  Background:Login with Valid Credentials
    Given User navigates to website
    When user enters valid Username
    Then user enters valid Password
    And user select "English (Australian)"
    Then user click Login Button
    And User verifies Home Page Title as "OpenEMR"

@smoke
    Scenario: User navigates to Admin/Clinic/Facilities
      When user navigates to Admin//clinic/Facilities
      And User validates that user can see text as "Facilities"






