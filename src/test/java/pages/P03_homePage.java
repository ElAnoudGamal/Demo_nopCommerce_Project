package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class P03_homePage {

    //D03_currenciesStepDef
    public WebElement euroCurrency()
    {
       return Hooks.driver.findElement(By.xpath("//select//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }

    //D04_searchStepDef
    public By namePOM()
    {
       return By.name("q");
    }

    public WebElement searchBtn()
    {
       return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }

    public List<WebElement> searchResult()
    {
       return Hooks.driver.findElements(By.cssSelector("div[class=\"item-box\"]"));
    }

    public By productSKUPOM()
    {
       return By.id("small-searchterms");
    }

    public WebElement skuResult()
    {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }
    //D05_hoverCategoriesStepDef
    public WebElement computers()
    {
       return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }

    public WebElement desktops()
    {
       return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
    }

    //D06_homeSlidersStepDef
    public WebElement slider(String sliderNum)
    {
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }

    //D07_followUsStepDef
    public WebElement facebookLink()
    {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitterLink()
    {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rssLink()
    {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement youtubeLink()
    {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
}
