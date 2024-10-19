package testCase;

import Pages.P03_LandingPageLoc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T03_LandingPage {
    By hoverUser1loc = By.xpath("//span[.=\"Add to Cart\"]");

    P03_LandingPageLoc Sectionlocs = new P03_LandingPageLoc();

    public static ChromeDriver driver;

    @BeforeMethod
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    void TC_A() throws InterruptedException {
        WebElement hotSellerSection = driver.findElement(By.className("widget-product-grid"));
        new Actions(driver).scrollToElement(hotSellerSection).perform();


        boolean y = Sectionlocs.getPrice1Loc().getText().contains("$22.00");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(y);

        boolean z = Sectionlocs.getPrice2Loc().getText().contains("$34.00");
        soft.assertTrue(z);

        boolean B = Sectionlocs.getPrice3Loc().getText().contains("$22.00");
        soft.assertTrue(B);

        boolean Q = Sectionlocs.getPrice4Loc().getText().contains("$54.00");
        soft.assertTrue(Q);

        boolean v = Sectionlocs.getPrice5Loc().getText().contains("$59.00");
        soft.assertTrue(v);

        boolean p = Sectionlocs.getPrice6Loc().getText().contains("$45.00");
        soft.assertTrue(p);
        soft.assertAll();
    }

    @Test
    void TC_B() throws InterruptedException {
        Thread.sleep(3000);

        WebElement hotSellerSection = driver.findElement(By.className("widget-product-grid"));
        new Actions(driver).scrollToElement(hotSellerSection).perform();

        boolean O = Sectionlocs.getCart1Loc().isEnabled();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(O);

        boolean y = Sectionlocs.getCart2Loc().isEnabled();
        soft.assertTrue(y);

        boolean M = Sectionlocs.getCart3Loc().isEnabled();
        soft.assertTrue(M);

        boolean N = Sectionlocs.getCart4Loc().isEnabled();
        soft.assertTrue(N);

        boolean Z = Sectionlocs.getCart5Loc().isEnabled();
        soft.assertTrue(Z);

        boolean C = Sectionlocs.getCart6Loc().isEnabled();
        soft.assertTrue(C);
    }

    @Test
    void TC_C() throws InterruptedException {
        Thread.sleep(3000);

        WebElement hotSellerSection = driver.findElement(By.className("widget-product-grid"));
        new Actions(driver).scrollToElement(hotSellerSection).perform();

        Actions act =new Actions(driver);
        act.moveToElement(Sectionlocs.getImageItem2()).perform();
        WebDriverWait Expwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Expwait.until(ExpectedConditions.presenceOfElementLocated(hoverUser1loc));

        Sectionlocs.getSizeLoc().click();
        Sectionlocs.getColorLoc().click();
        Sectionlocs.getCart2Loc().click();

        Thread.sleep(3000);
       boolean y = Sectionlocs.getAsserNumCart().getText().contains("1");
       SoftAssert soft = new SoftAssert();
       soft.assertTrue(y);

        Sectionlocs.getAssertShowCart().click();
       boolean E = Sectionlocs.getAssertDetailCart().getText().contains("Breathe-Easy");
       soft.assertTrue(E);
       soft.assertAll();
    }

    @AfterMethod
    void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
