//This test is to complete the shopping of anyone of the item under Woman section
//Followig funcitionality will be tested as part of this flow
//1. Validate the Woman Menu is visible and able to see the prodcuts under the dropdown 
//2. Validate the user journey for adding one of the woman products to until delivery

package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ShoppingCart;
import pageObjects.Sign_In;
import resources.base;
import org.openqa.selenium.interactions.Actions;

public class ShoppingCartWorkflow extends base {
	
	Sign_In sgn = new Sign_In(driver);
	ShoppingCart sct = new ShoppingCart(driver);
	Actions action = new Actions(driver);
	

	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String siteUrl) throws Throwable {
		driver.get(siteUrl);
		driver.manage().window().maximize();
	}

	@When("^Click on Sign link in home page to land on Secure sign in Page$")
	public void click_on_sign_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		sgn.getSignin().click();

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and login$")
	public void user_enters_and_and_login(String username, String password) throws Throwable {
		sgn.getEmail().sendKeys(username);
		sgn.getPassword().sendKeys(password);
		sgn.getLogin().click();

	}

	@Given("^Click on the woman category menu$")
	public void click_on_the_woman_category_menu() throws Throwable {
		Assert.assertTrue(sct.getWomenBtn().isDisplayed());
		action.moveToElement(sct.getDressesDropDown()).perform();	

	}

	@Then("^All products should be displayed$")
	public void all_products_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Select anyone of the product$")
	public void select_anyone_of_the_product() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Add the product into cart for check$")
	public void add_the_product_into_cart_for_check() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Proceed further action to checkout the item$")
	public void proceed_further_action_to_checkout_the_item() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Product should be checked out and ordered$")
	public void product_should_be_checked_out_and_ordered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^sign out and close the browser$")
	public void sign_out_and_close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
