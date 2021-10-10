package domaci_20_09_2021;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HappyPath extends TestBase{
	
	private String username;
	private String password;


	public HappyPath(String username, String password) {
		super();
		this.username = "tomsmith";
		this.password = "SupersecretPassword!";
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	@Override
	public String toString() {
		return this.username + ", " + this.password;
	}
	
	
}
