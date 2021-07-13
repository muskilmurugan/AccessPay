package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_In {
	public WebDriver driver;

    By signin = By.xpath("//a[contains(text(), \"Sign in\")]");
    By email = By.xpath ("//input[@id='email']");
    By password = By.cssSelector("[type='password']");
	By login = By.cssSelector("[type='submit']");
	

	public Sign_In(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getSignin() {
		return driver.findElement(signin);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
