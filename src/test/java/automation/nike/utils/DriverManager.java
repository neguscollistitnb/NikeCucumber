package automation.nike.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

static WebDriver driver;

public static void createDriver(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.nike.com/");
    driver.manage().window().maximize();
}

public static WebDriver getDriver(){
    return driver;
}


}
