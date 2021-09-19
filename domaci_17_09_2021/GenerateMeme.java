package cas_17_09_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenerateMeme {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://imgflip.com/memegenerator");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	
		WebElement upload = driver.findElement(By.id("mm-show-upload"));
		upload.click();
		Thread.sleep(1000);
		
		WebDriverWait wdwait = new WebDriverWait(driver, 25);
		wdwait.until(ExpectedConditions.elementToBeClickable(By.id("mm-show-upload")));

		
		WebElement dugme = driver.findElement(By.id("mm-upload-file"));
		dugme.sendKeys("C:\\Users\\Slavisa\\Downloads\\dicaprio.jpg");
		Thread.sleep(2000);
		
		WebElement upload2 = driver.findElement(By.id("mm-upload-btn"));
		upload2.click();
		Thread.sleep(1000);
		
		
		WebElement bottomTxt = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[4]/div[2]/div[1]/textarea"));
		bottomTxt.clear();
		bottomTxt.click();
		Thread.sleep(1000);
		bottomTxt.sendKeys("Kurs će trajati 10 nedelja");
		Thread.sleep(2000);
		
		
		WebElement generate = driver.findElement(By.cssSelector(".mm-generate.b.but"));
		generate.click();
		Thread.sleep(2000);
		
		driver.close();
	

	}

}
