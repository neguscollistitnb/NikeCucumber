package automation.nike.stepdefs;

import automation.nike.pages.SearchProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchProductsSteps {

    SearchProductsPage searchProductsPage = new SearchProductsPage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Assert.assertEquals(searchProductsPage.getTitle(), "Nike. Just Do It. Nike.com");
    }
    @When("the user enters {string} in the search field")
    public void the_user_enters_in_the_search_field(String product) {
        searchProductsPage.searchFieldInput(product);
    }
    @And("the user clicks on the search button")
    public void the_user_clicks_on_the_search_button() {
        searchProductsPage.clickTheSearchButton();
    }
    @Then("the website should display search results for {string}")
    public void the_website_should_display_search_results_for(String product) {
        int productNumber = 1;

        for(String results : searchProductsPage.getSearchResults()){
            Assert.assertTrue(results.contains(product) || results.contains("Shoes") ,
                    "Product: " + productNumber + " does not contain key word");
            productNumber++;
        }
    }
    @And("the search results should include products images")
    public void the_search_results_should_include_products_images() {
        int productCount = 0;
        for(WebElement image : searchProductsPage.isImageDisplayed()){
            if(image.isDisplayed()){
                productCount++;
            }
        }

        Assert.assertTrue(productCount >= 25, "Did not get the correct product count for the Image");
    }
    @And("the search results should include products title")
    public void the_search_results_should_include_products_title() {
        int productCount = 0;
        for(WebElement title : searchProductsPage.isTitleDisplayed()){
            if(title.isDisplayed()){
                productCount++;
            }
        }

        Assert.assertTrue(productCount >= 24, "Did not get the correct product count for the Title");
    }
    @And("the search results should include products sub-title")
    public void the_search_results_should_include_products_sub_title() {
        int productCount = 0;
        for(WebElement subTitle : searchProductsPage.isSubTitleDisplayed()){
            if(subTitle.isDisplayed()){
                productCount++;
            }
        }
    }
    @And("the search results should include products colors")
    public void the_search_results_should_include_products_colors() {
        int productCount = 0;
        for(WebElement colors : searchProductsPage.isColorWayDisplayed()){
            if(colors.isDisplayed()){
                productCount++;
            }
        }
    }
    @And("the search results should include products price")
    public void the_search_results_should_include_products_price() {
        int productCount = 0;
        for(WebElement price : searchProductsPage.isPriceDisplayed()){
            if(price.isDisplayed()){
                productCount++;
            }
        }
    }
}
