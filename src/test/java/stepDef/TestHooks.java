package stepDef;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {
    private DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        driverManager.openBrowser();
        driverManager.navigateTo("http://automationpractice.com/");
        driverManager.maxBroser();
        driverManager.applyImplicit();
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }

}
