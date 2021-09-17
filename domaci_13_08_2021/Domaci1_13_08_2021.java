package domaci;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		/* Napisati program gde preko skenera unesete broj, 
		 * ako je broj manji od 10 onda ga pomnoziti sa 100, 
		 * ako je broj veci od 100 onda ga podeliti sa 10. 
		 * Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.
		 */

		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Upišite broj manji od 10 ili veći od 100: ");

		double broj = s.nextDouble(); 
		
			if (broj<10) {
				System.out.println("Izabrani broj pomnožen sa 100 je: " + broj*100);
			} else if (broj>100) {
				System.out.println("Izabrani broj podeljen sa 10 je: " + broj/10);
			} else {
				System.out.println("Pogrešan unos");
			}
		
			//Za proveru korišćeni sledeći brojevi: 10, 50, 5, 200, 100.5, 2.5
		
	}

}
