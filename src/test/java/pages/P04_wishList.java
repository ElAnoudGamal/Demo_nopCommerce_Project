package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class P04_wishList {

    public List<WebElement> wishlistBtns()
    {
       return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishlistSuccessMsg()
    {
       return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement SuccessMsgClose()
    {
       return Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

    public WebElement wishlistText()
    {
       return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }

}
