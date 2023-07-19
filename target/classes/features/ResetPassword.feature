@smoke
Feature:ResetPassword |  User could reset password successfully

  Scenario: user could reset password with valid account
    Given user go to forget password page
    When user reenter email
    Then user clicks recover button