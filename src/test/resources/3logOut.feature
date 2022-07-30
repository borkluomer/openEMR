Feature: Logout

  Background:Login with Valid Credentials
    Given User navigates to website
    When user enters valid Username
    Then user enters valid Password
    And user select "English (Australian)"
    Then user click Login Button
    And User verifies Home Page Title as "OpenEMR"


@test
    Scenario: User successfully can logOut
      Given User logOut when navigates to HomePage
      When user navigates to login page with the title "OpenEMR Login"

