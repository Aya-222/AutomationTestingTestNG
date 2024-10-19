package testCase;

import Pages.P01_Register;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.TestNGException;
import java.sql.Driver;

public class T01_Register{
    P01_Register Rlocs = new P01_Register();
    public static ChromeDriver driver ;

    @BeforeMethod
    void setup()
    {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    void TC_1() throws InterruptedException {
        Rlocs.getCreateLoc().click();

        Rlocs.getFirstnameLoc().sendKeys("Aya");
        Rlocs.getyLastnameLoc().sendKeys("Hesham");
        Rlocs.getEmailLoc().sendKeys("731caee@drmail.in");
        Rlocs.getPasswordLoc().sendKeys("123456789Aa/");
        Rlocs.getSubmitLoc().click();

        boolean x = driver.getCurrentUrl().contains("create");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x);

        boolean y = Rlocs.getRequiredLoc().isDisplayed();
        soft.assertTrue(y);
        soft.assertAll();

        Thread.sleep(2000);
    }

    @Test
    void TC_2()
    {
        Rlocs.getCreateLoc().click();

        Rlocs.getFirstnameLoc().sendKeys("Aya");
        Rlocs.getyLastnameLoc().sendKeys("Hesham");
        Rlocs.getEmailLoc().sendKeys("731caee@drmail.in");
        Rlocs.getPasswordLoc().sendKeys("123456789Aa/");
        Rlocs.getConfirmPassLoc().sendKeys("123456");
        Rlocs.getSubmitLoc().click();

        boolean z = driver.getCurrentUrl().contains("create");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(z);

        boolean A = Rlocs.getSamValueLoc().isDisplayed();
        soft.assertTrue(A);
        soft.assertAll();
    }

    @Test
    void TC_3()
    {
        Rlocs.getCreateLoc().click();

        Rlocs.getFirstnameLoc().sendKeys("Aya");
        Rlocs.getyLastnameLoc().sendKeys("Hesham");
        Rlocs.getEmailLoc().sendKeys("731caee@drmail.in");
        Rlocs.getPasswordLoc().sendKeys("123456789Aa/");
        Rlocs.getConfirmPassLoc().sendKeys("123456789Aa/");
        Rlocs.getSubmitLoc().click();

        boolean x = driver.getCurrentUrl().contains("account");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x);

        boolean w = Rlocs.getAsserSuccAccLoc().getText().contains("Aya Hesham");
        soft.assertTrue(w);

        boolean B = Rlocs.getAsserSuccAccLoc().getText().contains("731caee@drmail.in");
        soft.assertAll();
    }

    @AfterMethod
    void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
