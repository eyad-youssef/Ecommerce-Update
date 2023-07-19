@smoke
Feature: get tags on the product

  Scenario: user could select different tags
    Given user logged in
    When user get product
    Then user set a tag