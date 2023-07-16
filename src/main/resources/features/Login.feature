@smoke
Feature: Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
  Given user go to login page
  When user enters email
    And user enter password
    Then user click the login button
    And user login to the system successfully


#  Scenario: user could login with invalid email and password
#  Step 1 user go to login page
#  Step 2 user login with "invalid" "test@example.com" and "P@ssw0rd"
#  Step 3 user press on login button
#  Step 4 user could not login to the system