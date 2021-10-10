package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//metode za Sign In preko IMDB naloga

public class IMDBSignIn {

	WebDriver driver;
	
	
	public IMDBSignIn(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("ap_email"));
	}
	
	public void clickEmail() {
		this.getEmail().click();
	}
	
	public void insertEmail(String email) {
		this.getEmail().sendKeys(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.id("ap_password"));
	}
	
	public void clickPassword() {
		this.getPassword().click();
	}
	
	public void insertPassword(String password) {
		this.getPassword().sendKeys(password);
	}
	
	public WebElement getButton() {
		return driver.findElement(By.id("signInSubmit"));
	}
	
	public void clickButton() {
		this.getButton().click();
	}
}	
