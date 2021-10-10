package domaci_20_09_2021;

// Happy path klasa, Sad path klasa (proizvoljno netacan username/password) i u Mainu pozivate jednu ili drugu klasu.

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	private String url;
	

	public void TestBase(String url) throws InterruptedException {
		
		this.url = "https://the-internet.herokuapp.com/login";
	
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.click();
		Thread.sleep(2000);
		username.sendKeys("tomsmith");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.click();
		Thread.sleep(2000);
		password.sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
		

		WebElement login = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
		login.click();
		Thread.sleep(2000);
		
	}


	public String getUrl() {
		return "https://the-internet.herokuapp.com/login";
	}



	
	
	
	
	
	
}
