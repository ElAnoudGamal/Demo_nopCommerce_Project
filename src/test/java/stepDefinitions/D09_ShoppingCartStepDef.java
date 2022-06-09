package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P05_shoppingCart;

public class D09_ShoppingCartStepDef {

    P05_shoppingCart shoppingCart = new P05_shoppingCart();
    int num;

    @When("user adds product to the shopping cart")
    public void product_added_to_shoppingCart() throws InterruptedException {
      shoppingCart.shoppingCartBtns().get(2).click();
      Thread.sleep(3000);
    }

    @Then("shopping cart success message is displayed")
    public void shoppingCart_successMsg()
    {
       String expectedResult = "The product has been added to your shopping cart";
       String actualResult = shoppingCart.shoppingSuccessMsg().getText();
       System.out.println("Shopping cart success Msg:"+ actualResult);
       Assert.assertEquals(actualResult, expectedResult);
    }

    @And("user gets the number of shopping cart items after adding product")
    public void shoppingCartItems()
    {
       shoppingCart.closeSuccessMsg().click();
       String text = shoppingCart.shoppingCartText().getText();
       System.out.println(text);
       text = text.replaceAll("[^0-9]", "");
       num = Integer.parseInt(text);
       System.out.println(num);
    }

    @Then("number of shopping cart products is increased")
    public void products_increased()
    {
       Assert.assertTrue(num>0);
    }
}
