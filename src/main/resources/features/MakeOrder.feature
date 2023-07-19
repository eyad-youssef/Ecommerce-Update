@smoke
Feature: making an order

  Scenario: user could Create successful Order
    Given user has been logged in
    And user adds product to cart
    And user has a product
    And user checks out product
     # When user get to the cart
    When user add address details
    And  user add shipping details
    And user addes payment details
    Then user confirms operation
