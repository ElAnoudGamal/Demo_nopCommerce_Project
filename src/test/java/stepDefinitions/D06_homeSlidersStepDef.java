package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P03_homePage;

public class D06_homeSlidersStepDef {

    P03_homePage home = new P03_homePage();

    @When("user clicks on the first slider")
    public void first_Slider()
    {
       home.slider("1").click();
    }

    @Then("relative product for the first slider is displayed")
    public void firstSlider_IsDisplayed() throws InterruptedException {
       Thread.sleep(3000);
       Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user clicks on the second slider")
    public void second_Slider()
    {
       home.slider("2").click();
    }

    @Then("relative product for the second slider is displayed")
    public void secondSlider_IsDisplayed() throws InterruptedException {
       Thread.sleep(3000);
       Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone_s6");
    }
}
