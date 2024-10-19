package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v127.preload.model.RuleSetErrorType;
import testCase.T04_Wishlist;

public class P04_Wishlist {

    public WebElement getImgItem2Loc() {
        return T04_Wishlist.driver.findElement(By.cssSelector("img[alt=\"Breathe-Easy Tank\"]"));
    }

    public WebElement getWishLoc() {
        return T04_Wishlist.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//div//a[2]//parent::div//a[1]"));
    }

    public WebElement getAssertErrorLoc() {
        return T04_Wishlist.driver.findElement(By.cssSelector("div[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]"));
    }

    public WebElement getSignLoc() {
        return T04_Wishlist.driver.findElement(By.cssSelector("a[href=\"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/\"]"));
    }

    public WebElement getEmailLoc() {
        return T04_Wishlist.driver.findElement(By.id("email"));
    }

    public WebElement getPassLoc() {
        return T04_Wishlist.driver.findElement(By.id("pass"));
    }

    public WebElement getSignButtLoc() {
        return T04_Wishlist.driver.findElement(By.id("send2"));
    }


    public WebElement getAssertWishAddedLoc() {
        return T04_Wishlist.driver.findElement(By.cssSelector("div[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]"));
    }

    public WebElement getAssertWishPriceLoc() {
        return T04_Wishlist.driver.findElement(By.className("price"));
    }

}
