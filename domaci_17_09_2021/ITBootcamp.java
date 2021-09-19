package domaci_17_09_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.	Pomocu jave i seleniuma
//2.	Otvoriti novi prozor u pretrazivacu i otici na stranicu  IT Bootcamp-a
//3.	Primeniti metode- get URL i Title, navigate - refresh, to, back, forward
//4.	U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )
//5.	Dokazati da li prilikom koriscenja reci “testiranje” u search-u (i trazanja jelte) dobijamo rezultat shodno trazenom tako sto cete napraviti screenshot stranice. nakon pretrage.
//6.	Proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu.
//

public class ITBootcamp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://itbootcamp.rs/";
		driver.get(url);
		
		System.out.println(driver.manage().window().getSize());		//daje dimenzije pocetnog ekrana
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		WebElement search = driver.findElement(By.className("open-search"));
		Thread.sleep(1000);
		search.click();
		
		WebElement searchField = driver.findElement(By.className("form-control"));
		searchField.clear();
		searchField.click();
		Thread.sleep(1000);
		searchField.sendKeys("testiranje");
		Thread.sleep(1000);
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		driver.navigate().back();			// vraca na pocetnu stranu itbootcamp
		driver.navigate().forward();		// prebacuje na stranicu serach result testiranje
	
		Dimension d = new Dimension(1050, 840);
		driver.manage().window().setSize(d);		//vraca dimenzije max ekrana na pocetne 
		
		driver.close();
	
	}

}
