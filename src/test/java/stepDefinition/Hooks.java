package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserDriver;

public class Hooks {

    @Before
    public void setUp() {
        // Initialize WebDriver
        BrowserDriver.initializeDriver();
    }

    @After
    public static void tearDown() {
        // Quit WebDriver after test
        BrowserDriver.quitDriver();
    }

}
