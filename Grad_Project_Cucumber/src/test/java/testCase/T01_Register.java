package testCase;

import Pages.P01_Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class T01_Register {
    P01_Register Rlocs = new P01_Register();

    public static ChromeDriver driver;

    @Given("User open browser Website URL")
    public void User_open_browser_Website_URL()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @And("user open signup website")
    public void user_open_signup_website()
    {
        Rlocs.getCreateLoc().click();
    }

    @When("user enters valid first name")
    public void user_enters_valid_first_name()
    {
        Rlocs.getFirstNmaeLoc().sendKeys("Aya");
    }

    @And("user enters last name")
    public void user_enters_last_name()
    {
        Rlocs.getLastNmaeLoc().sendKeys("Hesham");
    }

    @And("user enters email")
    public void user_enters_email()
    {
        Rlocs.getEmailLoc().sendKeys("ebacf3e@drmail.in");
    }

    @And("user enters valid password")
    public void user_enters_valid_password()
    {
        Rlocs.getPassLoc().sendKeys("123456789Aa/");
    }

    @And("user click create button")
    public void user_click_create_button()
    {
        Rlocs.getCreateButLoc().click();
    }

    @Then("user cannot login URL successfully required passward")
    public void user_cannot_login_URL_successfully_required_passward()
    {
        boolean z = driver.getCurrentUrl().contains("create");
        Assert.assertTrue(z);

    }
    @And("message displayed under mendatory fields")
    public void message_displayed_under_mendatory_fields()
    {
        boolean x = Rlocs.getRequLoc().isDisplayed();
        Assert.assertTrue(x);
    }

    @And("user enters confirm passward dosnot match")
    public void user_enters_confirm_passward_dosnot_match()
    {
        Rlocs.getConfirmPassLoc().sendKeys("123");
    }

    @Then("message displayed under confirm password field")
    public void message_displayed_under_confirm_password_field()
    {
        boolean q = Rlocs.getMessConfirmError().isDisplayed();
        Assert.assertTrue(q);
    }

    @And("user enters valid match confirm passward")
    public void user__enters_valid_match_confirm_passward()
    {
        Rlocs.getConfirmPassLoc().sendKeys("123456789Aa/");
    }

    @Then("user can login successfully navigate account page")
    public void user_can_login_successfully_navigate_account_page()
    {
       boolean S = driver.getCurrentUrl().contains("account");
       Assert.assertTrue(S);
    }

    @And ("verify user can show contact information first name")
    public void verify_user_can_show_contact_information_first_name()
    {
        boolean c = Rlocs.getAssertFNameLoc().getText().contains("Aya");
        Assert.assertTrue(c);
    }

    @And ("verify user can show contact information last name")
    public void verify_user_can_show_contact_information_last_name()
    {
        boolean D = Rlocs.getAssertLNameLoc().getText().contains("Hesham");
        Assert.assertTrue(D);
    }

    @And ("verify user can show contact information Email")
    public void verify_user_can_show_contact_information_Email()
    {
        boolean E = Rlocs.getAssertEmailLoc().getText().contains("ebacf3e@drmail.in");
        Assert.assertTrue(E);
    }
    @And("user Close browser")
    public void user_Close_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

