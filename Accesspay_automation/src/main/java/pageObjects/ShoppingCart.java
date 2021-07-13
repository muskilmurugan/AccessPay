package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

	public WebDriver driver;

	By getWomenBtn = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]");
	By getDressesBtn = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]");
	By getTShirtsBtn = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]");
	By getDressesDropDown = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul");	
	By getCasualDressesBtn = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Casual Dresses\")]");
	By getAddToCartBtn = By.xpath("//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]");
	By getAddedToCartModal = By.id("layer_cart");
	By getContinueShopingBtn = By.xpath("//span[@title=\"Continue shopping\"]");
	By getProceedToCheckoutBtn = By.xpath("//span[contains(text(), \"Proceed to checkout\")]");
	By getSuccessfullyAddedMessage = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
	
	public ShoppingCart(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}
	
	public WebElement getWomenBtn() {
		return driver.findElement(getWomenBtn);
	}
	
	public WebElement getDressesBtn() {
		return driver.findElement(getDressesBtn);
	}

	public WebElement getTShirtsBtn() {
		return driver.findElement(getTShirtsBtn);
	}
	public WebElement getDressesDropDown() {
		return driver.findElement(getDressesDropDown);
	}
	public WebElement getCasualDressesBtn() {
		return driver.findElement(getCasualDressesBtn);
	}
	public WebElement getAddToCartBtn() {
		return driver.findElement(getAddToCartBtn);
	}
	public WebElement getAddedToCartModal() {
		return driver.findElement(getAddedToCartModal);
	}
	public WebElement getContinueShopingBtn() {
		return driver.findElement(getContinueShopingBtn);
	}
	public WebElement getProceedToCheckoutBtn() {
		return driver.findElement(getProceedToCheckoutBtn);
	}
	public WebElement getSuccessfullyAddedMessage() {
		return driver.findElement(getSuccessfullyAddedMessage);
	}

}
