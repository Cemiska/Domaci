package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.IMDB;
import pages.IMDBSignIn;
import pages.IMDBWatchlist;


public class BaseIMDB {

	public WebDriver driver;
	public IMDB imdb;
	public IMDBSignIn signin;
	public IMDBWatchlist watchlist;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		imdb = new IMDB(driver);
		signin = new IMDBSignIn(driver);
		watchlist = new IMDBWatchlist(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
