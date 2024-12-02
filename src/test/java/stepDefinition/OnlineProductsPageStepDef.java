package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.OnlineProductsPage;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class OnlineProductsPageStepDef extends BrowserDriver {

    private WebDriver driver;
    private OnlineProductsPage onlineProductsPage;

    @When("User clicks on formal Shoes drop down")
    public void user_clicks_on_formal_shoes_drop_down() throws InterruptedException {
        driver = BrowserDriver.initializeDriver();
        onlineProductsPage = new OnlineProductsPage(driver);
       onlineProductsPage.click_formalshoesdropdpown().click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @Then("User should be able to view the products")
    public void user_should_be_able_to_view_the_products() {

        driver = BrowserDriver.initializeDriver();
        onlineProductsPage = new OnlineProductsPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String formalshoesText = onlineProductsPage.getText_formalshoes_firstvalue().getText();
        assertEquals("   Classic Cheltenham",formalshoesText);
    }

}
