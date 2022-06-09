@smoke
Feature: guest user should be able to search for products with different parameters

  Scenario: user could search for products using product name
    When user enters product name "apple"
    And user clicks on search field in home page
    Then relative Apple products are displayed

  Scenario: user could search for products using product SKU
    When user enters product SKU "AP_MBP_13"
    And user clicks on search field
    Then relative product is displayed