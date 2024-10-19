package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testCase.T03_LandingPage;

public class P03_LandingPageLoc {
    public WebElement getSectionLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//h2[.=\"Hot Sellers\"]"));
    }

    public WebElement getPrice1Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Radiant Tee\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getPrice2Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getPrice3Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Argus All-Weather Tank\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getPrice4Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Hero Hoodie\"]//parent::strong//parent::div//span[2]//span"));
    }

    public WebElement getPrice5Loc() {
        return T03_LandingPage.driver.findElement(By.cssSelector("span[data-price-amount=\"59\"]"));
    }

    public WebElement getPrice6Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//span[.=\"$45.00\"]"));
    }

    public WebElement getCart1Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Radiant Tee\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getCart2Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getCart3Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Argus All-Weather Tank\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getCart4Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Hero Hoodie\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getCart5Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Fusion Backpack\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getCart6Loc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Push It Messenger Bag\"]//parent::strong//parent::div//parent::div//div//button//span"));
    }

    public WebElement getImageItem2() {
        return  T03_LandingPage.driver.findElement(By.cssSelector("img[alt=\"Breathe-Easy Tank\"]"));
    }

    public WebElement getSizeLoc() {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//div//div//div//div[3]"));
    }

    public WebElement getColorLoc() {
        return T03_LandingPage.driver.findElement(By.cssSelector("div[option-label=\"White\"]"));
    }

    public WebElement getAsserNumCart() {
        return T03_LandingPage.driver.findElement(By.className("counter"));
    }

    public WebElement getAssertShowCart() {
        return T03_LandingPage.driver.findElement(By.className("showcart"));
    }

    public WebElement getAssertDetailCart() {
        return T03_LandingPage.driver.findElement(By.className("product-item-name"));
    }




}
