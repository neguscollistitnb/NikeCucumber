package automation.nike.pages;

import automation.nike.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class SearchProductsPage {

    public String getTitle(){
        return  DriverManager.getDriver().getTitle();
    }

    public void searchFieldInput(String product){
        By searchFieldBy = By.xpath("//input[@type='search']");
        WebElement searchField = DriverManager.getDriver().findElement(searchFieldBy);

        searchField.sendKeys(product);
    }

    public void clickTheSearchButton(){
        By searchFieldBy = By.xpath("//input[@type='search']");
        WebElement searchField = DriverManager.getDriver().findElement(searchFieldBy);

        searchField.sendKeys(Keys.ENTER);
    }

    public List<String> getSearchResults(){
        By searchResultsBy = By.xpath("//div[@class='product-card__subtitle']");
        List<WebElement> searchResults = DriverManager.getDriver().findElements(searchResultsBy);

        List<String> results = new LinkedList<>();

        for(WebElement result : searchResults){
            results.add(result.getText());
        }

        return results;
    }

    public List<WebElement> isImageDisplayed(){
        By imageBy = By.xpath("//img");
        List<WebElement> images = DriverManager.getDriver().findElements(imageBy);

        return images;
    }

    public List<WebElement> isTitleDisplayed(){
        By titleBy = By.xpath("//div[@class='product-card__title']");
        List<WebElement> titles = DriverManager.getDriver().findElements(titleBy);

        return titles;
    }

    public List<WebElement> isSubTitleDisplayed(){
        By subTitleBy = By.xpath("//div[@class='product-card__subtitle']");
        List<WebElement> subTitles = DriverManager.getDriver().findElements(subTitleBy);

        return subTitles;
    }

    public List<WebElement> isColorWayDisplayed(){
        By colorWayBy = By.xpath("//div[@class='product-card__count-item']");
        List<WebElement> colorWay = DriverManager.getDriver().findElements(colorWayBy);

        return colorWay;
    }

    public List<WebElement> isPriceDisplayed(){
        By priceBy = By.xpath("//div[@class='product-card__price']");
        List<WebElement> price = DriverManager.getDriver().findElements(priceBy);

        return price;
    }

}
