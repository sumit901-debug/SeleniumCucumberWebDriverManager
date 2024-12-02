package stepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.RegistrationPage;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class RegistrationPageStepDef {

    private WebDriver driver;
    private RegistrationPage registrationPage;

    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        driver = BrowserDriver.initializeDriver(); // Use the same driver instance
        registrationPage = new RegistrationPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualproductcategory_fs = registrationPage.visibility_user_registration_page().getText();
        assertEquals("User Registration Page",actualproductcategory_fs);
    }


}
