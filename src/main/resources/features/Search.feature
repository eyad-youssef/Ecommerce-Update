@smoke
  Feature: Search | Logged User could search for any product
    Scenario: user could search any product after logining in
      Given user goes to login page
      And user enters email again
      And user enters password
      And user clicks login button
      When user enter any product in search bar
      Then user clicks the search button
      #And prodcuts found appear





  Scenario: user could search any product after logining in
    Given user goes to login page
    And user enters email again
    And user enters password
    And user clicks login button
#   // When user enter any product in search bar
    Then user chooses from the search list