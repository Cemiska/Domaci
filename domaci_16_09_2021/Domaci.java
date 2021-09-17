package domaci_16_09_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
//Napisati program koji ucitava https://practicetestautomation.com/ stranicu, 
//klikne na "Practice" i klikne na "Test login page", popunjava username i password (student/Password123), 
//loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.
//Koristite sto manje xpath mozete, pre unosa u polje odradite akciju clear i kreirajte web elemente za svaki element koji trazite.


public class Domaci {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://practicetestautomation.com/practice/");
		Thread.sleep(1000);
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.click();
		Thread.sleep(1000);
		username.sendKeys("student");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.click();
		Thread.sleep(1000);
		password.sendKeys("Password123");
		
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(1000);
		
		WebElement logout = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logout.click();
		
		driver.close();
	
		
		
		
		
				
		
	}

}
