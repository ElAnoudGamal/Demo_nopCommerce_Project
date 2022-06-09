package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P03_homePage;

import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage();
    ArrayList<String> tabs;

    @When("user clicks on facebook link")
    public void click_facebookLink()
    {
       homePage.facebookLink().click();
    }

    @Then("facebook is opened successfully in new tab")
    public void facebook_opened_newTab() throws InterruptedException {
       Thread.sleep(5000);
       tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
       Hooks.driver.switchTo().window(tabs.get(1));

       System.out.println(Hooks.driver.getCurrentUrl());
       Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");

       Hooks.driver.close();
       Hooks.driver.switchTo().window(tabs.get(0));
       System.out.println(Hooks.driver.getCurrentUrl());
    }

    @When("user clicks on twitter link")
    public void click_twitterLink()
    {
       homePage.twitterLink().click();
    }

    @Then("twitter is opened successfully in new tab")
    public void twitter_opened_newTab() throws InterruptedException {
       Thread.sleep(10000);
       tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
       Hooks.driver.switchTo().window(tabs.get(1));

       System.out.println(Hooks.driver.getCurrentUrl());
       Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce");

       Hooks.driver.close();
       Hooks.driver.switchTo().window(tabs.get(0));
       System.out.println(Hooks.driver.getCurrentUrl());
    }

    @When("user clicks on rss link")
    public void click_rssLink()
    {
       homePage.rssLink().click();
    }

    @Then("rss is opened successfully in new tab")
    public void rss_opened_newTab() throws InterruptedException {
       Thread.sleep(3000);
       tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
       Hooks.driver.switchTo().window(tabs.get(1));

       System.out.println(Hooks.driver.getCurrentUrl());
       Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");

       Hooks.driver.close();
       Hooks.driver.switchTo().window(tabs.get(0));
       System.out.println(Hooks.driver.getCurrentUrl());
    }

    @When("user clicks on youtube link")
    public void click_youtubeLink()
    {
       homePage.youtubeLink().click();
    }

    @Then("youtube is opened successfully in new tab")
    public void youtube_opened_newTab() throws InterruptedException {
       Thread.sleep(3000);
       tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
       Hooks.driver.switchTo().window(tabs.get(1));

       System.out.println(Hooks.driver.getCurrentUrl());
       Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");

       Hooks.driver.close();
       Hooks.driver.switchTo().window(tabs.get(0));
       System.out.println(Hooks.driver.getCurrentUrl());
    }
}
