Feature: User able to login

  @smoke
  Scenario: Login with Valid Credentials
    Given User navigates to website
    When user enters valid Username
    Then user enters valid Password
    And user select "English (Australian)"
    Then user click Login Button
    And User verifies Home Page Title as "OpenEMR"

  @smoke
    Scenario:Login with invalid userName case
      Given User navigates to website
      When user enters invalid Username
      Then user enters valid Password
      And user select "English (Australian)"
      Then user click Login Button
      And user gets error message as "Invalid username or password"

    @smoke
    Scenario: Login with invalid password case
      Given User navigates to website
      When user enters valid Username
      Then user enters invalid Password
      And user select "English (Australian)"
      Then user click Login Button
      And user gets error message as "Invalid username or password"

      @smoke
      Scenario: Login with invalid userName and invalid password
        Given User navigates to website
        When user enters invalid Username
        Then user enters invalid Password
        And user select "English (Australian)"
        Then user click Login Button
        And user gets error message as "Invalid username or password"
