package automation.nike.stepdefs;

import automation.nike.pages.SearchProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchProductsSteps {

    SearchProductsPage searchProductsPage = new SearchProductsPage();

    @When("The user types in a product in the search bar")
    public void the_user_types_in_a_product_in_the_search_bar() {
        searchProductsPage.searchInput();
    }
    @And("clicks on the submit button")
    public void clicks_on_the_submit_button() {
        searchProductsPage.pushReturnOnSearchBar();
    }
    @Then("search results should display relevant products")
    public void search_results_should_display_relevant_products() {
        int productNumber = 1;
        for (String result : searchProductsPage.searchResults()){
            Assert.assertTrue(result.contains("Dunk"), "Product item #" + productNumber + " does not contain the correct keyword - Dunk");
            System.out.println(productNumber);
            productNumber++;
        }
    }
    @And("product cards should show images, names, category, number of colors, and prices")
    public void product_cards_should_show_images_names_category_number_of_colors_and_prices() {
// Testing Jamie
        // Negus Changes
        // steve Changes

    }

}
