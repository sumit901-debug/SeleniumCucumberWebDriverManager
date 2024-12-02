package stepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.HomePage.*;
import utility.BrowserDriver;

public class HomePageStepDef extends BrowserDriver{

    private WebDriver driver;
    private HomePage homePage;



    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

            driver = BrowserDriver.initializeDriver();
            driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
            homePage = new HomePage(driver);
            homePage.click_hamburger_manu().click();
            homePage.click_signIn_Link().click();

        }

    @Given("User navigates to the online product page")
    public void user_navigates_to_the_online_product_page() throws InterruptedException {

        driver = BrowserDriver.initializeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        homePage = new HomePage(driver);
        homePage.click_hamburger_manu().click();
        homePage.click_OnlineProducts_link().click();
    }

}

