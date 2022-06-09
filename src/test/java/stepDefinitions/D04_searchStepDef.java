package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D04_searchStepDef {

    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    @When("^user enters product name \"(.*)\"$")
    public void enterProductName(String productName)
    {
       Hooks.driver.findElement(home.namePOM()).sendKeys(productName);
    }

    @And("user clicks on search field in home page")
    public void searchField() throws InterruptedException {
       home.searchBtn().click();
       Thread.sleep(3000);
    }

    @Then("relative Apple products are displayed")
    public void Apple_displayed()
    {
       //First Assertion
       String expectedResult = "https://demo.nopcommerce.com/search?q=apple";
       String actualResult = Hooks.driver.getCurrentUrl();
       soft.assertTrue(actualResult.contains(expectedResult), "First Assertion");
       System.out.println("Actual Result:"+ actualResult);
       //Second Assertion
       int resultSize = home.searchResult().size();
       System.out.println(resultSize);
       soft.assertTrue(resultSize>0, "Second Assertion");
       soft.assertAll();
    }

    @When("^user enters product SKU \"(.*)\"$")
    public void productSKU(String productSKU)
    {
       Hooks.driver.findElement(home.productSKUPOM()).sendKeys(productSKU);
    }

    @And("user clicks on search field")
    public void user_clickEnter() throws InterruptedException {
       Hooks.driver.findElement(home.productSKUPOM()).sendKeys(Keys.ENTER);
       Thread.sleep(3000);
    }

    @Then("relative product is displayed")
    public void SKU_displayed()
    {
       soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "First Assert");
       System.out.println(Hooks.driver.getCurrentUrl());

       soft.assertTrue(home.skuResult().isDisplayed(), "Second Assert");
       soft.assertAll();

    }
}
