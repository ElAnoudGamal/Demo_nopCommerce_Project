package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_login {

    public WebElement loginPOM()
    {
      return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement loginEmail()
    {
       return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement loginPassword()
    {
       return Hooks.driver.findElement(By.id("Password"));
    }

    public void loginSteps(String email, String password)
    {
       loginEmail().clear();
       loginEmail().sendKeys(email);
       loginPassword().sendKeys(password);
    }

    public WebElement successLoginPOM()
    {
       return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));
    }

    public By MyAccount()
    {
       return By.cssSelector("a[class=\"ico-account\"]");
    }
}
