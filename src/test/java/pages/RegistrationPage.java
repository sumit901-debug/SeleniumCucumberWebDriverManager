package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    private final WebDriver driver;

    private final By userregistration_xpath = By.xpath("/html/body/center/h1");
    // Constructor to pass WebDriver
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement visibility_user_registration_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver.findElement(userregistration_xpath);

    }
}
