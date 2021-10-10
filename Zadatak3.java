package cas_21_09_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//https://demoqa.com/
//Otici na sajt demoqa, kliknuti na Elements, kliknuti na Text Box, popuniti podatke i kliknuti na Submit. 
//Sa leve strane kliknuti na Checkbox. Cekirati samo "Desktop" i utvrditi da je samo taj checkbox cekira. 
//Kliknuti na Radio Button sa leve strane, kliknuti na "Yes" pa na "Impressive" i utvrditi da se radio button promenio.

//Dodatak, proveriti da li je uneta adresa u Current address i Permanent address ista i ispisati u konzoli. 
//Dobro pogledajte lokatore za ovo ODAKLE ih uzimate i testirajte da li program tu dobro radi.

public class Zadatak3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://demoqa.com");
		driver.manage().window().maximize();
		
//		kliknuti na Elements
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		Thread.sleep(2000);
		elements.click();
		Thread.sleep(2000);
		
//		kliknuti na Text Box
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
		Thread.sleep(2000);
		textBox.click();
		Thread.sleep(2000);
		
//		popuniti podatke
		WebElement username = driver.findElement(By.id("userName"));
		Thread.sleep(2000);
		username.click();
		Thread.sleep(2000);
		username.sendKeys("Milica");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("userEmail"));
		Thread.sleep(2000);
		email.click();
		Thread.sleep(2000);
		email.sendKeys("cemi@gmail.com");
		Thread.sleep(2000);
		
//		unos sa istim adresama
		WebElement address1 = driver.findElement(By.id("currentAddress"));
		Thread.sleep(2000);
		address1.click();
		Thread.sleep(2000);
		address1.sendKeys("Dusanova 32");
		
		
		WebElement ispisanaAdresa1 = driver.findElement(By.id("currentAddress"));	// polje ispod dugmeta submit, gde su ispisani podaci o trenutnoj adresi
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ispisanaAdresa1);
		String a1 = ispisanaAdresa1.getText();
		
		WebElement address2 = driver.findElement(By.id("permanentAddress"));
		Thread.sleep(2000);
		address2.click();
		Thread.sleep(2000);
		address2.sendKeys("Dusanova 32");
		Thread.sleep(2000);
		
		WebElement ispisanaAdresa2 = driver.findElement(By.id("permanentAddress"));	// polje ispod dugmeta submit, gde su ispisani podaci o trajnoj adresi
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ispisanaAdresa2);
		String a2 = ispisanaAdresa2.getText();

		
//		kliknuti na Submit
		WebElement submit = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        Thread.sleep(2000);
        submit.click();
        
    	if(a1.equals(a2)) {
			System.out.println("Adrese su iste.");
		} else {
			System.out.println("Adrese su razlicite.");
		}
        
//        unos sa razlicitim adresama
        WebElement ispravkaAdrese1 = driver.findElement(By.id("currentAddress"));
        Thread.sleep(2000);
		ispravkaAdrese1.clear();
		Thread.sleep(2000);
		ispravkaAdrese1.click();
		Thread.sleep(2000);
		ispravkaAdrese1.sendKeys("Vodovodska 32");
		Thread.sleep(2000);
		
		
		WebElement submitAgain = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitAgain);
        Thread.sleep(2000);
        submitAgain.click();
        submitAgain.click();
        
        if(ispravkaAdrese1.equals(a2)) {
			System.out.println("Adrese su iste.");
		} else {
			System.out.println("Adrese su razlicite.");
		}
		
        
       
		WebElement podaci = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
		Thread.sleep(2000);
		
		if(podaci.isDisplayed()) {
			System.out.println("Podaci su podneti.");
		} else {
			System.out.println("Podaci nisu podneti");
		}
		
//		sa leve strane kliknuti na Checkbox
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
		Thread.sleep(2000);
		checkBox.click();
		Thread.sleep(2000);
		
		WebElement colapseButton = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		Thread.sleep(2000);
		colapseButton.click();
		Thread.sleep(2000);
		
//		cekirati samo "Desktop"
		WebElement desktop = driver.findElement(By.cssSelector(".rct-icon.rct-icon-parent-close"));
		Thread.sleep(2000);
		desktop.click();
		Thread.sleep(2000);
		
//		utvrditi da je samo taj checkbox cekiran
		WebElement success = driver.findElement(By.id("result"));
		Thread.sleep(2000);
		
		String rezultat = success.getText();
		
		if(rezultat.contains("You have selected :")) {
			System.out.println("Desktop je odabran.");
		} else {
			System.out.println("Desktop nije odabran.");
		}
		
		
//		Kliknuti na Radio Button sa leve strane 
		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
		Thread.sleep(2000);
		radioButton.click();
		Thread.sleep(2000);
		
//		kliknuti na "Yes"
		WebElement yes = driver.findElement(By.className("custom-control-label"));
		Thread.sleep(2000);
		yes.click();
		Thread.sleep(2000);
		
		WebElement da = driver.findElement(By.className("text-success"));
		Thread.sleep(2000);
		
		if(da.isDisplayed()) {
			System.out.println("Odabrano je yes.");
		} else {
			System.out.println("Nije odabrano yes");
		}
		
//		kliknuti na "Impressive"
		WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]"));
		Thread.sleep(2000);
		impressive.click();
		Thread.sleep(2000);
		
//		utvrditi da se radio button promenio
		WebElement impresivno = driver.findElement(By.className("text-success"));
		Thread.sleep(2000);
		
		if(impresivno.isDisplayed()) {
			System.out.println("Odabrano je impressive.");
		} else {
			System.out.println("Nije odabrano impressive");
		}
		
		driver.close();
		
	}

}
