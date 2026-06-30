package automation.nike.stepdefs;

import automation.nike.pages.ProductsDetailPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Scanner;

public class ProductsDetailsSteps {

    ProductsDetailPage productsDetailPage = new ProductsDetailPage();

    @Then("click on each product cat")
    public void click_on_each_product_cat(DataTable dataSubtitles) {
        List<String> subtitles = dataSubtitles.asList();
        int productNumber = 2;
        for (String subtitle : subtitles){
            productsDetailPage.clickOnProduct("Jordan 11 Retro Low \"Bred\"", subtitle);
            productNumber++;
        }


    }
    @Then("verify each price per size cat and verify each price")
    public void verify_each_price_per_size_cat_and_verify_each_price(DataTable subTitle ,DataTable price) {

    }

}
