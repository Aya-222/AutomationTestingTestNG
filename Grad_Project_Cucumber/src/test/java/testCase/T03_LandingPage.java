package testCase;

import Pages.P03_LandinPage;
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


public class T03_LandingPage {
    P03_LandinPage LandLocs = new P03_LandinPage();

    By hoverUser1loc = By.xpath("//span[.=\"Add to Cart\"]");

    public static ChromeDriver driver ;

    @Given("open URL magento in Browser")
    public void open_URL_magento_in_Browser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @When("Scroll down to Hot Sellers Section")
    public void Scroll_down_to_Hot_Sellers_Section()
    {
        WebElement HotSellerSection = driver.findElement(By.className("widget-product-grid"));
        new Actions(driver).scrollToElement(HotSellerSection).perform();
    }

    @And("Observe Radiant Tee card is displayed with price")
    public void Observe_Radiant_Tee_card_is_displayed_with_price()
    {
        boolean y = LandLocs.getItem1PriceLoc().getText().contains("$22.00");
        Assert.assertTrue(y);
    }

    @And("Observe Breathe Tank card is displayed with price")
    public void Observe_Breathe_Tank_card_is_displayed_with_price()
    {
        boolean z = LandLocs.getItem2PriceLoc().getText().contains("$34.00");
        Assert.assertTrue(z);
    }

    @And("Observe Argus Weather Tank card is displayed with price")
    public void Observe_Argus_Weather_Tank_card_is_displayed_with_price()
    {
        boolean A = LandLocs.getItem3PriceLoc().getText().contains("$22.00");
        Assert.assertTrue(A);
    }

    @And("Observe Hero Hoodie card is displayed with price")
    public void Observe_Hero_Hoodie_card_is_displayed_with_price()
    {
        boolean B = LandLocs.getItem4PriceLoc().getText().contains("$54.00");
        Assert.assertTrue(B);
    }

    @And("Observe Fusion Backpack card is displayed with price")
    public void Observe_Fusion_Backpack_card_is_displayed_with_price()
    {
        boolean C = LandLocs.getItem5PriceLoc().getText().contains("$59.00");
        Assert.assertTrue(C);
    }

    @And("Observe Push It Messenger Bag card is displayed with price")
    public void Observe_Push_It_Messenger_Bag_card_is_displayed_with_price()
    {
        boolean D = LandLocs.getItemPriceLoc().getText().contains("$45.00");
        Assert.assertTrue(D);
    }

    @Then("Observe Radiant Tee card contains Add to Cart")
    public void Observe_Radiant_Tee_card_contains_Add_to_Cart()
    {
        boolean O = LandLocs.getItem1CartLoc().isEnabled();
        Assert.assertTrue(O);
    }

    @And("Observe Breathe Tank card contains Add to Cart")
    public void Observe_Breathe_Tank_card_contains_Add_to_Cart()
    {
        boolean V = LandLocs.getItem2CartLoc().isEnabled();
        Assert.assertTrue(V);
    }

    @And("Observe Argus Weather Tank card contains Add to Cart")
    public void Observe_Argus_Weather_Tank_card_contains_Add_to_Cart()
    {
       boolean N = LandLocs.getItem3CartLoc().isEnabled();
        Assert.assertTrue(N);
    }

    @And("Observe Hero Hoodie card contains Add to Cart")
    public void Observe_Hero_Hoodie_card_contains_Add_to_Cart()
    {
        boolean M = LandLocs.getItem4CartLoc().isEnabled();
        Assert.assertTrue(M);
    }

    @And("Observe Fusion Backpack card contains Add to Cart")
    public void Observe_Fusion_Backpack_card_contains_Add_to_Cart()
    {
        boolean K = LandLocs.getItem5CartLoc().isEnabled();
        Assert.assertTrue(K);
    }

    @And("Observe Push It Messenger Bag card contains Add to Cart")
    public void Observe_Push_It_Messenger_Bag_card_contains_Add_to_Cart()
    {
        boolean L = LandLocs.getItemCartLoc().isEnabled();
        Assert.assertTrue(L);
    }

    @When("user hover on card Breathe Easy Tank")
    public void user_hover_on_card_Breathe_Easy_Tank()
    {
        Actions act =new Actions(driver);
        act.moveToElement(driver.findElement(By.cssSelector("img[alt=\"Breathe-Easy Tank\"]"))).perform();
        WebDriverWait Expwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Expwait.until(ExpectedConditions.presenceOfElementLocated(hoverUser1loc));
    }

    @And("Select Size M")
    public void Select_Size_M()
    {
        LandLocs.getSizeMLoc().click();
    }

    @And("Select white Color")
    public void Select_white_Color()
    {
        LandLocs.getColorLoc().click();
    }

    @And("user click on Add to Cart button")
    public void user_click_on_Add_to_Cart_button()
    {
        LandLocs.getCartButtLoc().click();
    }

   @And("user wait six seconds later")
   public void user_wait_six_seconds_later() throws InterruptedException {
       Thread.sleep(6000);
   }

    @Then("Product added to cart successfully")
    public void Product_added_to_cart_successfully()
    {
        driver.findElement(By.className("showcart")).click();
        boolean S = LandLocs.getAssertCartLoc().getText().contains("Breathe-Easy");
        Assert.assertTrue(S);
    }

    @And("Cart icon should display number one")
    public void Cart_icon_should_display_number_one()
    {
        boolean J = LandLocs.getAssertNumLoc().getText().contains("1");
        Assert.assertTrue(J);
    }

    @And("user close the tab of browser")
    public void user_close_the_tab_of_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
