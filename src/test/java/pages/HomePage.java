package pages;

import com.sun.jna.WString;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    private final WebDriver driver;

    private final By hamburger_menu_xpath = By.xpath( "//*[@id=\"menuToggle\"]/input");
    private final By sign_link_LinkText = By.linkText("Sign In Portal");
    private final By onlineProductsPage_link_LinkText = By.linkText("Online Products");

    // Constructor to pass WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement click_hamburger_manu() throws InterruptedException {

        return driver.findElement(hamburger_menu_xpath);
    }

    public WebElement click_signIn_Link() throws InterruptedException {

        Thread.sleep(2000);

        return driver.findElement(sign_link_LinkText);
    }

    public WebElement click_OnlineProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(onlineProductsPage_link_LinkText);
    }
}
