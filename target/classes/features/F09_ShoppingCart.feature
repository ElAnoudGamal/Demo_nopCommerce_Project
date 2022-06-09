@smoke
Feature: guest user should be able to add products to shopping cart

  Scenario: success message is visible when user adds product to shopping cart
    When user adds product to the shopping cart
    Then shopping cart success message is displayed

  Scenario: number of products in shopping cart is increased
    When user adds product to the shopping cart
    Then shopping cart success message is displayed
    And user gets the number of shopping cart items after adding product
    Then number of shopping cart products is increased