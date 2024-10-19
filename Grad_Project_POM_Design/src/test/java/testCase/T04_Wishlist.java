package testCase;

import Pages.P04_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.jq.INavigatorPanel;

import java.time.Duration;

public class T04_Wishlist{
    By hoverImgloc = By.xpath("//span[.=\"Add to Cart\"]");
    P04_Wishlist Wishlistlocs = new P04_Wishlist();
    public static ChromeDriver driver;

    @BeforeMethod
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    void TC_Y() throws InterruptedException {
        Thread.sleep(3000);

        WebElement hotSellerSection = driver.findElement(By.className("widget-product-grid"));
        new Actions(driver).scrollToElement(hotSellerSection).perform();

        Actions act =new Actions(driver);
        act.moveToElement(Wishlistlocs.getImgItem2Loc()).perform();
        WebDriverWait Expwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Expwait.until(ExpectedConditions.presenceOfElementLocated(hoverImgloc));

        Wishlistlocs.getWishLoc().click();

        Thread.sleep(2000);
        boolean y = Wishlistlocs.getAssertErrorLoc().getText().contains("must login");
        Assert.assertTrue(y);
    }

    @Test
    void TC_Z() throws InterruptedException {
        Wishlistlocs.getSignLoc().click();

        Wishlistlocs.getEmailLoc().sendKeys("731caee@drmail.in");
        Wishlistlocs.getPassLoc().sendKeys("123456789Aa/");
        Wishlistlocs.getSignButtLoc().click();

        Thread.sleep(3000);

        WebElement hotSellerSection = driver.findElement(By.className("widget-product-grid"));
        new Actions(driver).scrollToElement(hotSellerSection).perform();

        Actions act =new Actions(driver);
        act.moveToElement(Wishlistlocs.getImgItem2Loc()).perform();
        WebDriverWait Expwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Expwait.until(ExpectedConditions.presenceOfElementLocated(hoverImgloc));

        Wishlistlocs.getWishLoc().click();

        Thread.sleep(2000);
        boolean y = Wishlistlocs.getAssertWishAddedLoc().getText().contains("added");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(y);

        boolean z = Wishlistlocs.getAssertWishPriceLoc().getText().contains("$34.00");
        soft.assertTrue(z);
        soft.assertAll();
    }

    @AfterMethod
    void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
