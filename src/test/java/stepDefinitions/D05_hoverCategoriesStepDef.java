package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D05_hoverCategoriesStepDef {

    P03_homePage home = new P03_homePage();
    String subCategoryName;
    String subCategoryText;

    @When("user covers category and select subcategory")
    public void user_hover_category() throws InterruptedException {
       Actions action = new Actions(Hooks.driver);
       action.moveToElement(home.computers()).perform();    //hover on computers
       Thread.sleep(2000);

       subCategoryName = home.desktops().getText().toLowerCase().trim();  // change Desktops to desktops
       System.out.println("SubCategoryName:" + subCategoryName);
       home.desktops().click();
    }

    @Then("user clicks on subcategory")
    public void user_click_subcategory()
    {
       SoftAssert soft = new SoftAssert();
       subCategoryText = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText().toLowerCase().trim();
       System.out.println("SubCategoryText:" + subCategoryText);
       //First Assertion
       soft.assertEquals(subCategoryText, subCategoryName);
       //Second Assertion
       soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/desktops"), "true");
       soft.assertAll();
    }
}
