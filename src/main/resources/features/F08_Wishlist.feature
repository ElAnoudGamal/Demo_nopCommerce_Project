@smoke
Feature: guest user should be able to add products to the wishlist

  Scenario: success message is visible when user adds product to the wishlist
    When user adds product to the wishlist
    Then wishlist success message is displayed

  Scenario: number of wishlist items in home page is increased
    When user adds product to the wishlist
    Then wishlist success message is displayed
    And user gets the number of wishlist items after adding product
    Then number of wishlist items is increased