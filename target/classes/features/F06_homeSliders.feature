@smoke
Feature: guest user should be able to open sliders in home page

  Scenario: first slider is clickable on home page
    When user clicks on the first slider
    Then relative product for the first slider is displayed

  Scenario: second slider is clickable on home page
    When user clicks on the second slider
    Then relative product for the second slider is displayed