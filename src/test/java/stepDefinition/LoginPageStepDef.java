package stepDefinition;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utility.BrowserDriver;

import java.time.Duration;

public class LoginPageStepDef {

    private WebDriver driver;
    private LoginPage loginPage;

    @When("User successfully  enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {

            driver = BrowserDriver.initializeDriver(); // Use the same driver instance
            loginPage = new LoginPage(driver);
            loginPage.sendkeys_username().sendKeys("Scott.gale@gmail.com");
            loginPage.sendkeys_password().sendKeys("P@sword!");
            loginPage.click_login_btn().click();


    }

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() {
        driver = BrowserDriver.initializeDriver(); // Use the same driver instance
        loginPage = new LoginPage(driver);
        loginPage.click_NewRegister_btn().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

}
