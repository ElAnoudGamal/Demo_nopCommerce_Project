@smoke
Feature: guest user should be able to login to the System

  Scenario: guest user could Login with valid credentials
    When user clicks on Log in tab
    And user enters "test@example.com" and "P@ssw0rd"
    And user clicks on LOG IN button
    Then user could login successfully