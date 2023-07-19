@smoke
Feature: filter products by their color

  Scenario:user could filter with color
    Given user  is logged
    When user chooses product
    Then user select the color
