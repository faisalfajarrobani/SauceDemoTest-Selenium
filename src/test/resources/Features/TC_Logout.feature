Feature: User Logout
  Scenario: User logout account after shopping
    Given User is able to login
    And User click burger button
    When User click logout button
    And User successfully logout and redirected to login page