package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P02_login;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @When("user clicks on Log in tab")
    public void user_clickLoginTab()
    {
       login.loginPOM().click();
    }

    @And("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enterValidData(String email, String password)
    {
       login.loginSteps(email, password);
    }

    @And("user clicks on LOG IN button")
    public void user_clickLOGINBtn() throws InterruptedException {
       login.successLoginPOM().click();
       Thread.sleep(3000);
    }

    @Then("user could login successfully")
    public void successLogin()
    {
       SoftAssert softAssert = new SoftAssert();
       //First Assertion
       softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Assert Equal");
       //Second Assertion
       softAssert.assertTrue(Hooks.driver.findElement(login.MyAccount()).isDisplayed(), "Assert True");
       softAssert.assertAll();
    }
}
