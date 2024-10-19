package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testCase.T03_LandingPage;

public class P03_LandinPage {
    public WebElement getItem1PriceLoc(){
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Radiant Tee\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getItem2PriceLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getItem3PriceLoc() {
    return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Argus All-Weather Tank\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getItem4PriceLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Hero Hoodie\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getItem5PriceLoc() {
        return T03_LandingPage.driver.findElement(By.cssSelector("span[data-price-amount=\"59\"]"));
    }

    public WebElement getItemPriceLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//span[.=\"$45.00\"]"));
    }

    public WebElement getItem1CartLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Radiant Tee\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getItem2CartLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Radiant Tee\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getItem3CartLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Argus All-Weather Tank\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getItem4CartLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Hero Hoodie\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getItem5CartLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Fusion Backpack\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getItemCartLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Push It Messenger Bag\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getSizeMLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//div//div//div//div[3]"));
    }

    public WebElement getColorLoc() {
        return T03_LandingPage.driver.findElement(By.cssSelector("div[option-label=\"White\"]"));
    }

    public WebElement getCartButtLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getAssertCartLoc() {
        return T03_LandingPage.driver.findElement(By.className("product-item-name"));
    }

    public WebElement getAssertNumLoc() {
        return T03_LandingPage.driver.findElement(By.className("counter"));
    }

}
