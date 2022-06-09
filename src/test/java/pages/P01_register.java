package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P01_register {

    public WebElement registerPOM()
    {
      return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement gender()
    {
       return Hooks.driver.findElement(By.cssSelector("span[class=\"female\"]"));
    }

    public WebElement firstName()
    {
       return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName()
    {
       return Hooks.driver.findElement(By.name("LastName"));
    }

    public WebElement DateOfBirthDay()
    {
       return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]//option[@value=\"15\"]"));
    }

    public WebElement DateOfBirthMonth()
    {
       return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]//option[@value=\"2\"]"));
    }

    public WebElement DateOfBirthYear()
    {
       return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]//option[@value=\"1989\"]"));
    }

    public WebElement emailPOM()
    {
       return Hooks.driver.findElement(By.id("Email"));
    }

    public void personalDetailsPOM()
    {
        gender().click();
        firstName().sendKeys("Shaimaa");
        lastName().sendKeys("Gamal");
        DateOfBirthDay().click();
        DateOfBirthMonth().click();
        DateOfBirthYear().click();
        emailPOM().sendKeys("test@example.com");
    }

    public WebElement companyPOM()
    {
       return Hooks.driver.findElement(By.name("Company"));
    }

    public WebElement password()
    {
       return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
       return Hooks.driver.findElement(By.name("ConfirmPassword"));
    }

    public void passwordDetailsPOM()
    {
       password().sendKeys("P@ssw0rd");
       confirmPassword().sendKeys("P@ssw0rd");
    }

    public By resultPOM()
    {
       return By.cssSelector("div[class=\"result\"]");
    }
}
