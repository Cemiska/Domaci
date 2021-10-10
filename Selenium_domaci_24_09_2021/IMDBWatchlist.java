package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBWatchlist {

	WebDriver driver;
	
	
	 public IMDBWatchlist(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	 public WebElement getEdit() {
		 return driver.findElement(By.xpath("//*[@id=\"center-1-react\"]/div/div[1]/div/div[1]/a"));
	 }
	 
	 public void clickEdit() {
		 this.getEdit().click();
	 }
	 
	 public WebElement getSearch() {
		 return driver.findElement(By.id("add-to-list-search"));
	 }
	 
	 public void clickSearch() {
		 this.getSearch().click();
	 }
	 
	 public void addMovie(String movie) {
		 this.getSearch().sendKeys(movie);
	 }
	 
	 public WebElement getResult() {
		 return driver.findElement(By.xpath("//*[@id=\"add-to-list-search-results\"]/a[1]"));
	 }
	 
	 public void clickMovie() {
		 this.getResult().click();
	 }
	 
	 public WebElement getDone() {
		 return driver.findElement(By.cssSelector(".btn-raised.btn-raised--primary.list-edit-done"));
	 }
	 
	 public void clickDone() {
		 this.getDone().click();;
	 }
	 
	 public WebElement getList() {
		 return driver.findElement(By.className("lister-item"));
	 }
	 
	
}
