package tests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseIMDB;

public class TestIMDB extends BaseIMDB {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		
	}
	
	@Test (priority = 10) 
	public void openIMDB() throws InterruptedException {
		
		driver.navigate().to("https://www.imdb.com/");
		Thread.sleep(2000);
		imdb.clickWatchList();
		Thread.sleep(2000);
		imdb.clickSignInIMDB();
		Thread.sleep(2000);
		
		Assert.assertTrue(imdb.getSignInOptions().isDisplayed());
	}
	
	@Test (priority = 20) 
	public void signIn() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String > listaTabova = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(listaTabova.get(1));
		
		driver.navigate().to("https://www.imdb.com/registration/signin?u=https%3A%2F%2Fwww.imdb.com%2Flist%2Fwatchlist%3Fref_%3Dnv_usr_wl_all_0");
		Thread.sleep(2000);
		imdb.clickSignInIMDB();
		Thread.sleep(2000);
		signin.clickEmail();
		Thread.sleep(2000);
		signin.insertEmail("cemi_z89@hotmail.com");
		Thread.sleep(2000);
		signin.clickPassword();
		Thread.sleep(2000);
		signin.insertPassword("novasifrazaimdb123");
		Thread.sleep(2000);
		signin.clickButton();
		
		WebDriverWait wdwait = new WebDriverWait(driver, 20);
		wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center-1-react\"]/div/div[1]/div/div[1]/a")));
		watchlist.clickEdit();
		Thread.sleep(2000);
		watchlist.clickSearch();
		Thread.sleep(2000);
		watchlist.addMovie("Cruella");
		Thread.sleep(2000);
		watchlist.clickMovie();
		Thread.sleep(2000);
		watchlist.clickDone();
		Thread.sleep(2000);
		
		Assert.assertTrue(watchlist.getList().isDisplayed());
	}
	
	
	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
}
