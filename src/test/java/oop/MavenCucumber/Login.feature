Feature: User Login
  Registered User should be able to login to access account details

  Background: 
    Given User navigates to Login page

  Scenario Outline: Login with valid credentials
    When User enters email address <email>
    And Enter valid password <password>
    And Clicks on Login button
    Then User should login successfully

    Examples: 
      | <email>                |  | <password> |
      | amotooricap9@gmail.com |  |      12345 |
      | amotooricap3@gmail.com |  |      12345 |
      | amotooricap7@gmail.com |  |      12345 |

  Scenario: Login with invalid credentials
    When user enters invalid email address "amoo12345@gmail.com"
    And Enter invalid password "14509"
    And Clicks on Login button
    Then user should get a proper warning message

  Scenario: Login with valid email address and invalid password
    When User enters valid email address "amotooricap9@gmail.com"
    And clicks on Login button
    Then user should get a proper warning message

  Scenario: Login with invalid email address and valid password
    When user enters invalid email address "amoo12345@gmail.com"
    And Enters Valid password "12345"
    And Clicks on Login button
    Then user should get a proper warning message

  Scenario: Login without providing any credentials
    When user does not enter any credentials
    And clicks on Login button
    Then user should get a proper warning message
