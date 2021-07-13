package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.Sign_In;
import resources.base;

@RunWith(Cucumber.class)
public class Sign_in extends base {
	Sign_In signIn = new Sign_In(driver);

	@Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
		driver = initializeDriver();
	}
	@Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String siteUrl) throws Throwable 
	{
	    driver.get(siteUrl);
	    driver.manage().window().maximize();
	    //String ActualTitle = driver.getTitle();
	    Assert.assertEquals(driver.getTitle(), "My store");
	}
	
	    @When("^Click on Sign link in home page to land on Secure sign in Page$")
	    public void click_on_sign_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
	    	
	    	signIn.getSignin().click();
	    	Assert.assertEquals(driver.getTitle(), "Login - My Store");
	    	
	       
	    }
	    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and login$")
	     public void user_enters_and_and_login(String username, String password) throws Throwable {
	    	
	    	signIn.getEmail().sendKeys(username);
	    	signIn.getPassword().sendKeys(password);
	    	signIn.getLogin().click();
	    	Assert.assertEquals(driver.getTitle(), "My account - My Store");
	        
	    }

	@Then("^User should sucessfully login into the system$")
	public void user_should_sucessfully_login_into_the_system() throws Throwable {
			String accountName = driver.findElement(By.xpath("//span[contains(text(),'Murugan Ethiraj')]")).getText();
			System.out.println(accountName);
			if (accountName == "Murugan Ethiraj" )
			{
				Assert.assertEquals("Logged user is valid+"+ accountName, 1);
			}
		
		

	}

}
