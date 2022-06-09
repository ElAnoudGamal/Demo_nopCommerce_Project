@smoke
Feature: guest user should be able to register on the system

  Scenario: guest user registers with valid data successfully
    When user clicks on Register tab
    And user fills “Your Personal Details” fields
    And user fills “Company Details” field
    And user fills Fill “Your Password” fields
    And user Clicks on REGISTER button
    Then user could register with valid data successfully