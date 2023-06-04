Feature: User Checkout
  Scenario: User checkout the product from cart
    Given User is able to login
    And User have product in the shopping cart
    And User click cart icon
    And User click checkout button
    And User enter some data to form
    And User click continue button
    And User validate the product want to buy
    When User click finish button
    Then User successfully checkout and showing message