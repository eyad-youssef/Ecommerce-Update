@smoke
  Feature: user changes currency
    Scenario:Logged User could switch between currencies US-Euro
      Given user goes to login page first
      When user logs in

      Then user clicks on the needed currency
      And checks that all currencies successfully changed
