Feature: Shopping Cart
  Scenario: User search product and add to shopping cart
    Given User is able to login
    And User is able to inventory page
    And User search product based from low price
    And User select product and redirected to product page
    When User click add to cart button
    Then User success add the product selected to shopping cart