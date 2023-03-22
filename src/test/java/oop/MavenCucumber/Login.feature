Feature: User Login
  Registered User should be able to login to access account details

  Scenario: Login with valid credentials
    Given User navigates to Login page
    When User enters email address "amotooricap9@gmail.com"
    And Enter valid password "12345"
    And Clicks on Login button
    Then User should login successfully

  Scenario: Login with invalid credentials
    Given User navigates to Login page
    When user enters invalid email address "amoo12345@gmail.com"
    And Enter invalid password "14509"
    And Clicks on Login button
    Then user should get a proper warning message

  Scenario: Login with valid email address and invalid password
    Given User navigates to Login page
    When User enters valid email address "amotooricap9@gmail.com"
    And clicks on Login button
    Then user should get a proper warning message

  Scenario: Login with invalid email address and valid password
    Given user navigates to Login page
    When user enters invalid email address "amoo12345@gmail.com"
    And Enters Valid password "12345"
    And Clicks on Login button
    Then user should get a proper warning message

  Scenario: Login without providing any credentials
    Given user navigates to Login page
    When user does not enter any credentials
    And clicks on Login button
    Then user should get a proper warning message
