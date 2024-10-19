package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testCase.T01_Register;

public class P01_Register {
    public WebElement getCreateLoc() {
    return T01_Register.driver.findElement(By.cssSelector("a[href=\"https://magento.softwaretestingboard.com/customer/account/create/\"]"));
    }

    public WebElement getFirstNmaeLoc() {
        return T01_Register.driver.findElement(By.id("firstname"));
    }

    public WebElement getLastNmaeLoc() {
        return T01_Register.driver.findElement(By.id("lastname"));
    }

    public WebElement getEmailLoc() {
        return T01_Register.driver.findElement(By.cssSelector("input[autocomplete=\"email\"]"));
    }

    public WebElement getPassLoc() {
        return T01_Register.driver.findElement(By.id("password"));
    }

    public WebElement getCreateButLoc() {
        return T01_Register.driver.findElement(By.cssSelector("button[title=\"Create an Account\"]"));
    }

    public WebElement getRequLoc() {
        return T01_Register.driver.findElement(By.cssSelector("div[for=\"password-confirmation\"]"));
    }

    public WebElement getConfirmPassLoc() {
        return T01_Register.driver.findElement(By.xpath("//span[.=\"Confirm Password\"]//parent::label//parent::div//input"));
    }

    public WebElement getMessConfirmError() {
        return T01_Register.driver.findElement(By.id("password-confirmation-error"));
    }

    public WebElement getAssertFNameLoc() {
        return T01_Register.driver.findElement(By.xpath("//span[.=\"Contact Information\"]//parent::strong//parent::div//p"));
    }

    public WebElement getAssertLNameLoc() {
        return T01_Register.driver.findElement(By.xpath("//span[.=\"Contact Information\"]//parent::strong//parent::div//p"));
    }

    public WebElement getAssertEmailLoc() {
        return T01_Register.driver.findElement(By.xpath("//span[.=\"Contact Information\"]//parent::strong//parent::div//p"));
    }
}

