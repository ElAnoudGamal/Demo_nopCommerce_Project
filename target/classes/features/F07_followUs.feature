@smoke
Feature: guest users could open followUs links

  Scenario: user opens facebook link
    When user clicks on facebook link
    Then facebook is opened successfully in new tab

  Scenario: user opens twitter link
    When user clicks on twitter link
    Then twitter is opened successfully in new tab

  Scenario: user opens rss link
    When user clicks on rss link
    Then rss is opened successfully in new tab

  Scenario: user opens youtube link
    When user clicks on youtube link
    Then youtube is opened successfully in new tab