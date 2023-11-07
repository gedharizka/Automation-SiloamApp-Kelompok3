Feature: Login feature
  Scenario: Quick login
    Given User on login page
    When user input valid credential
    Then user redirect to home page
