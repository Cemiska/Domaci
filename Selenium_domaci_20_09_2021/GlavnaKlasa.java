package domaci_20_09_2021;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlavnaKlasa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		HappyPath h = new HappyPath("tomsmith", "SuperSecretPassword!");
		h.getPassword();
		h.getUsername();
		
		System.out.println(h);
		
		
		SadPath s = new SadPath("nekiUsername", "nekaSifra");
		
		System.out.println(s);
		
		
		
		
		
	}

}
