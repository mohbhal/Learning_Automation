Feature: Free Demo Project

  Scenario: Application Login Page
    Given User is on login page of the application
    When User login with following username and password
      | usernameone   | passwordone   |
      | usernameotwo  | passwordtwo   |
      | usernamethree | passwordthree |
      | usernamefour  | passwordfour  |
    Then User is able to login successfully