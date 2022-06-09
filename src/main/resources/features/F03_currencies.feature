@smoke
Feature: guest user should be able to switch between currencies [$, €] in home page

  Scenario: guest user could select Euro currency
    When user selects “Euro” from currency dropdown list
    Then Euro currency is displayed