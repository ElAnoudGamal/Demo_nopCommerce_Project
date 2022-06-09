package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class P05_shoppingCart {

    public List<WebElement> shoppingCartBtns()
    {
       return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }

    public WebElement shoppingSuccessMsg()
    {
       return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement closeSuccessMsg()
    {
       return Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

    public WebElement shoppingCartText()
    {
       return Hooks.driver.findElement(By.cssSelector("span[class=\"cart-qty\"]"));
    }
}
