 Feature: Search For Products

   Scenario: The user will search for a product and get the relevant products
     When The user types in a product in the search bar
     And clicks on the submit button
     Then search results should display relevant products
     And product cards should show images, names, category, number of colors, and prices
