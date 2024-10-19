package testCase;

import Pages.P04_Wishlist;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class T04_Wishlist {
    By hoverImgloc = By.xpath("//span[.=\"Add to Cart\"]");
    P04_Wishlist Wishlistlocs = new P04_Wishlist();
    public static ChromeDriver driver ;

    @Given("open URL magento Chrome Browser")
    public void open_URL_magento_Chrome_Browser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @And("Scroll down to Hot Sellers last Section")
    public void Scroll_down_to_Hot_Sellers_last_Section()
    {
        WebElement hotSellerSection = driver.findElement(By.className("widget-product-grid"));
        new Actions(driver).scrollToElement(hotSellerSection).perform();

    }

    @When("user Hover on Radiant Tee card")
    public void user_Hover_on_Radiant_Tee_card()
    {
        Actions act =new Actions(driver);
        act.moveToElement(Wishlistlocs.getImgItem2Loc()).perform();
        WebDriverWait Expwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Expwait.until(ExpectedConditions.presenceOfElementLocated(hoverImgloc));
    }

    @And("user click on Add to Wishlist button Radiant Tee")
    public void user_click_on_Add_to_Wishlist_button_Radiant_Tee()
    {
        Wishlistlocs.getWishLoc().click();
    }

    @And("user can wait six seconds")
    public void user_can_wait_six_seconds() throws InterruptedException {
        Thread.sleep(6000);
    }

    @Then("User should be navigated to login page")
    public void User_should_be_navigated_to_login_page()
    {
        boolean y = Wishlistlocs.getAssertErrorLoc().getText().contains("must login");
        Assert.assertTrue(y);
    }

    @And("user clicks sign button home page")
    public void user_clicks_sign_button_home_page()
    {
        Wishlistlocs.getSignLoc().click();
    }

    @And("user input valid Email")
    public void user_input_valid_Email()
    {
        Wishlistlocs.getEmailLoc().sendKeys("ebacf3e@drmail.in");
    }

    @And("user input valid password")
    public void user_input_valid_password()
    {
        Wishlistlocs.getPassLoc().sendKeys("123456789Aa/");
    }

    @And("user clicks on sign in button")
    public void user_clicks_on_sign_in_button()
    {
        Wishlistlocs.getSignButtLoc().click();
    }

    @Then("Item added to wishlist successfully")
    public void Item_added_to_wishlist_successfully()
    {
        boolean y = Wishlistlocs.getAssertWishAddedLoc().getText().contains("added");
        Assert.assertTrue(y);
    }

    @And("Radiant Tee added to wishlist successfully")
    public void Radiant_Tee_added_to_wishlist_successfully()
    {
        boolean z = Wishlistlocs.getAssertWishPriceLoc().getText().contains("$34.00");
        Assert.assertTrue(z);
    }

    @And("user exits from browser")
    public void user_exits_from_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
