package stepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LoggedInPage;
import pages.LoginPage;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class LoggedInPageStepDef extends BrowserDriver {

    private WebDriver driver;
    private LoggedInPage loggedInPage;

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

        driver = BrowserDriver.initializeDriver(); // Use the same driver instance
        loggedInPage = new LoggedInPage(driver);
        Thread.sleep(5000);
        String actualproductcategory_fs  = loggedInPage.visibility_productcategory_formalshoes().getText();
        assertEquals("Formal Shoes",actualproductcategory_fs);

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         String actualproductcategory_ss= loggedInPage.visibility_productcategory_sportsshoes().getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals("Sports",actualproductcategory_ss);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualproductcategory_s = loggedInPage.visibility_productcategory_sneakershoes().getText();
        assertEquals("Sneakers",actualproductcategory_s);
    }

}
