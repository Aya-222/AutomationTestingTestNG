package testCase;

import Pages.P02_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class T02_Login {
    P02_Login Llocs = new P02_Login();

    public static ChromeDriver driver ;

    @Given("user open browser URL website")
    public void user_open_browser_URL_website()
    {
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @And("user clicks sign button")
    public void user_clicks_sign_button()
    {
        Llocs.getSigninButLoc().click();
    }

    @When("user enters valid Email")
    public void user_enters_valid_Email()
    {
        Llocs.getEmailLoc().sendKeys("ebacf3e@drmail.in");
    }

    @And("user enter valid password")
    public void user_enter_valid_password()
    {
        Llocs.getPassLoc().sendKeys("123456789Aa/");
    }

    @And("user clicks login button")
    public void user_clicks_login_button()
    {
        Llocs.getLogButtLoc().click();
    }


    @Then("user can login successfully URL")
    public void user_can_login_successfully_URL()
    {
        boolean x = driver.getCurrentUrl().contains("https://magento.softwaretestingboard.com/");
        Assert.assertTrue(x);
    }

    @And("user can shows Welcome first name and last name")
    public void user_can_shows_Welcome_first_name_and_last_name()
    {
        boolean y = Llocs.getAssertSuccLoc().getText().contains("Welcome, Aya Hesham");
        Assert.assertTrue(y);
    }
        @And("user wait six seconds")
    public void user_wait_six_seconds() throws InterruptedException {
        Thread.sleep(2000);
    }
    @And("Close browser")
    public void Close_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
