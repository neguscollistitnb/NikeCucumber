Feature: Product Details  Page
  when the user is on the product details page, the user should be able to see the price of the product

  Background:
    Given the user is on the home page


  Scenario: Products Price
    When the user enters "Air Jordan 11 Retro Low \"Bred\"" in the search field
    And the user clicks on the search button
    And click on each product cat
      | Big Kids' Shoes    |
      | Little Kids' Shoes |
      | Baby/Toddler Shoes |
    Then verify each price per size cat and verify each price
      | Big Kids' Shoes    | $150  |
      | Little Kids' Shoes | $80   |
      | Baby/Toddler Shoes | $60   |