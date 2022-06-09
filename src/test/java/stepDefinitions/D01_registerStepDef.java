package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.P01_register;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @When("user clicks on Register tab")
    public void user_clickRegisterTab()
    {
        register.registerPOM().click();
    }

    @And("user fills “Your Personal Details” fields")
    public void user_fillPersonalDetails()
    {
        register.personalDetailsPOM();
    }

    @And("user fills “Company Details” field")
    public void user_fillCompanyDetails() throws InterruptedException {
        register.companyPOM().sendKeys("Automation Company");
        Thread.sleep(2000);
    }

    @And("user fills Fill “Your Password” fields")
    public void user_fillPassword()
    {
        register.passwordDetailsPOM();
    }

    @And("user Clicks on REGISTER button")
    public void user_clickREGISTERBtn() throws InterruptedException {
        register.confirmPassword().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("user could register with valid data successfully")
    public void successREGISTER()
    {
        String expectedResult = "Your registration completed";
        String actualResult = Hooks.driver.findElement(register.resultPOM()).getText();
        SoftAssert soft = new SoftAssert();
        // First Assertion
        soft.assertTrue(actualResult.contains(expectedResult));
        //Second Assertion
        String expectedSuccessMsgColor = "rgba(76, 177, 124, 1)";
        String actualSuccessMsgColor = Hooks.driver.findElement(register.resultPOM()).getCssValue("color");
        System.out.println("SuccessMsg Color:"+ actualSuccessMsgColor);
        soft.assertTrue(actualSuccessMsgColor.contains(expectedSuccessMsgColor));
        soft.assertAll();
    }
}
