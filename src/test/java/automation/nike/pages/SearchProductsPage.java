package automation.nike.pages;

import automation.nike.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class SearchProductsPage {

    public void searchInput(){
        By searchBarBy = By.xpath("//input[@type='search']");
        WebElement searchBar = DriverManager.getDriver().findElement(searchBarBy);

        searchBar.sendKeys("Dunks");
    }

    public void pushReturnOnSearchBar(){
        By searchBarBy = By.xpath("//input[@type='search']");
        WebElement searchBar = DriverManager.getDriver().findElement(searchBarBy);

        searchBar.sendKeys(Keys.RETURN);
    }

    public List<String> searchResults(){
        By searchResultsBy = By.xpath("//div[@class='product_msg_info']");
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

        org.openqa.selenium.support.ui.WebDriverWait wait =
                new org.openqa.selenium.support.ui.WebDriverWait(
                        DriverManager.getDriver(),
                        5
                );

        wait.until(org.openqa.selenium.support.ui.ExpectedConditions
                .presenceOfElementLocated(
                        org.openqa.selenium.By.xpath("//div[@class='product_msg_info']")
                )
        );


        List<WebElement> elements = DriverManager.getDriver().findElements(searchResultsBy);

        List<String> values = new LinkedList<>();

        for(WebElement results : elements){
            js.executeScript("arguments[0].scrollIntoView(true);", results);
            values.add(results.getText());
        }

        return values;
    }

}
