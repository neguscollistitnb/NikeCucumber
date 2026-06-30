package automation.nike.pages;

import automation.nike.utils.DriverManager;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsDetailPage {

    public void clickOnProduct(String productTitle, String subTitle){
        String xpathExpression = String.format(
                "//*[contains(text(),'%s')]/ancestor::*[contains(.,\"%s\") and contains(.,\"%s\")]",
                productTitle, productTitle, subTitle);

        WebElement product = DriverManager.getDriver().findElement(By.xpath(xpathExpression));
        product.click();

    }
    public void clickOnProduct2(String productTitle, String subTitle, int productNumber){
        By productTitleBy = By.xpath("//*[contains(text(),'"+ productTitle +"')]//following-sibling::div");
        List<WebElement> titles = DriverManager.getDriver().findElements(productTitleBy);

        By imageOverlayBy = By.xpath("(//a[@data-testid='product-card__link-overlay'])["+ productNumber +"]");
        WebElement imageOverlay = DriverManager.getDriver().findElement(imageOverlayBy);
        for(WebElement title : titles){
            if(title.getText().equals(subTitle)){
                imageOverlay.click();
            }
        }

    }
}
