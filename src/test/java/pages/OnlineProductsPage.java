package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class OnlineProductsPage extends BrowserDriver {

    private final WebDriver driver;

    private final By formalshoes_dropdown_class = By.className("formalshoedropdown");

//    private final By formalshoes_webtable = "/html/body/div[2]/table";

    private final By formalshoes_webtable_tr = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]");

    // Constructor to pass WebDriver
    public OnlineProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement click_formalshoesdropdpown() throws InterruptedException {
        return driver.findElement(formalshoes_dropdown_class);
    }

    public WebElement getText_formalshoes_firstvalue() {
        return driver.findElement(formalshoes_webtable_tr);

    }

}
