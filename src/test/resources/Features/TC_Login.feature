Feature: User Login
  Scenario: User login with valid credentials
    Given User is able to login page
    And User enter username and password
    When User click login button
    Then User login successfully and redirected to inventory page