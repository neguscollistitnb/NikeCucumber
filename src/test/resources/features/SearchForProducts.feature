Feature: Search functionality in the Nike website
  As a Nike website user I want to be able to search for products
  So that I can quickly find what I'm looking for

  Background:
    Given the user is on the home page

  Scenario: Basic search with results
    When the user enters "running shoes" in the search field
    And the user clicks on the search button
    Then the website should display search results for "Running Shoes"
    And the search results should include products images
    And the search results should include products title
    And the search results should include products sub-title
    And the search results should include products colors
    And the search results should include products price

  Scenario: Search with no results
    When the user enters "fuhyhbfghgf23423" in the search field
    And the user clicks the search button
    Then the website should display a "We could not find anything for" message
    And the website should suggest alternative search terms

  Scenario Outline: Product category search with sorting
    When the user enters '<category>' in the search field
    And the user taps the search button
    And the user sorts results by '<sort_option>'
    Then the search results should be sorted by '<sort_option>'

    Examples:
      | category | sort_option |
      | Jordans  | Low-High    |
      | Sneakers | High-Low    |
      | Jackets  | Newest      |
      | socks    | Featured    |


