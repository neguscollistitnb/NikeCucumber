package automation.nike.stepdefs;

import automation.nike.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        DriverManager.createDriver();
    }

    @After
    public void cleanUp(){
        DriverManager.getDriver().close();
    }
}
