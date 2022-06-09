package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P03_homePage;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("user selects “Euro” from currency dropdown list")
    public void euroCurrencySelected()
    {
        homePage.euroCurrency().click();
    }

    @Then("Euro currency is displayed")
    public void euroCurrencyDisplayed()
    {
        Assert.assertTrue(homePage.euroCurrency().isDisplayed());
    }
}
