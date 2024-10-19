package testCase;

import Pages.P02_LoginLoc;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNGException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.TestNGException;
import java.sql.Driver;

public class T02_Login {
    P02_LoginLoc Loglocs = new P02_LoginLoc();
   public static ChromeDriver driver ;

    @BeforeMethod
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    void TC_X() throws InterruptedException {

        Loglocs.getLoginLoc().click();

        Loglocs.getEmailLoc().sendKeys("731caee@drmail.in");
        Loglocs.getPassLoc().sendKeys("123456789Aa/");
        Loglocs.getButSignLoc().click();

        Thread.sleep(2000);
        boolean x = driver.getCurrentUrl().contains("https://magento.softwaretestingboard.com/");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(x);

        boolean y = Loglocs.getAsserSignSuccLoc().getText().contains("Welcome, Aya Hesham!");
        soft.assertTrue(y);
        soft.assertAll();
    }

    @AfterMethod
    void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
