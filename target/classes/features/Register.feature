@smoke
Feature: Login | users could register with new accounts

  Scenario: user could register with valid account
    Given user go to register page
    When  user select gender type
    And user enter first name
    And user enter last name
    And user enter date
    And user enter email
    And  user fills Password fields
    Then user clicks on register button
    And success message is displayed

