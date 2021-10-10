package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



//Napraviti program koji ce proveriti da li funkcionise dodavanje filmova u Watchlistu na sajtu IMDB. 
//Podrazumeva se da koristite POM, prvo prodjite manuelno, pogledajte sta sve treba da se radi, 
//razmislite kako da budete sigurni da je film dodat (slicno kao sto smo radili korpu za Amazon zadatak), 
//proverite manuelno da li korisnik mora da se uloguje ili moze da bude izlogovan itd.

public class IMDB {

	WebDriver driver;
	
	public IMDB(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getWatchlist() {
		return driver.findElement(By.cssSelector(".NavWatchlistButton-sc-1b65w5j-0.dAMWXo.imdb-header__watchlist-button"));
	}
	
	public void clickWatchList() {
		this.getWatchlist().click();
	}
	
	public WebElement getSignInOptions() {
		return driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div"));
	}
	
	
	public WebElement getSignInIMDB() {
		return driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]"));
	}
	
	public void clickSignInIMDB() {
		this.getSignInIMDB().click();
	}
	
	
	
	
	
	
	
	public WebElement getCreateAccount() {
		return driver.findElement(By.className("list-group-item create-account "));
	}
}
