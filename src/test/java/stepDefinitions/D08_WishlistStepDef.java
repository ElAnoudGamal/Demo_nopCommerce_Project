package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P04_wishList;

public class D08_WishlistStepDef {

    P04_wishList wishlist = new P04_wishList();
    int number;

    @When("user adds product to the wishlist")
    public void product_added_to_wishlist() throws InterruptedException {
       wishlist.wishlistBtns().get(2).click();
       Thread.sleep(3000);
    }

    @Then("wishlist success message is displayed")
    public void wishlist_successMsg()
    {
       Assert.assertTrue(wishlist.wishlistSuccessMsg().isDisplayed());
    }

    @And("user gets the number of wishlist items after adding product")
    public void wishlist_items()
    {
       wishlist.SuccessMsgClose().click();
       String text = wishlist.wishlistText().getText();
       text = text.replaceAll("[^0-9]", "");
       number = Integer.parseInt(text);
    }

    @Then("number of wishlist items is increased")
    public void items_increased()
    {
       Assert.assertTrue(number>0);
    }

}
