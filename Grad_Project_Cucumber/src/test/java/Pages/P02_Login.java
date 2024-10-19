package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testCase.T02_Login;

public class P02_Login {

    public WebElement getSigninButLoc() {
        return T02_Login.driver.findElement(By.cssSelector("a[href=\"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/\"]"));
    }

    public WebElement getEmailLoc() {
        return T02_Login.driver.findElement(By.id("email"));
    }

    public WebElement getPassLoc() {
        return T02_Login.driver.findElement(By.id("pass"));
    }

    public WebElement getLogButtLoc() {
        return T02_Login.driver.findElement(By.id("send2"));
    }

    public WebElement getAssertSuccLoc() {
        return T02_Login.driver.findElement(By.cssSelector("span[data-bind=\"text: new String('Welcome, %1!').replace('%1', customer().fullname)\"]"));
    }
}
