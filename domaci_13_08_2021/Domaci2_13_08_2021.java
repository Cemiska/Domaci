package domaci;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		/* Napisati program gde kroz switch se unosi broj od 1 do 12
		 *  i program ispisuje koji je to mesec u godini. 
		 *  Ako korisnik unese drugi broj treba da se ispise poruka "Potrebno je uneti broj od 1 do 12"
		 */

		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Unesite broj od 1 do 12: ");
		
		int mesec = s.nextInt();
		
		switch (mesec) {
			case 1: 
				System.out.println("Januar");
		break;
			case 2: 
				System.out.println("Februar");
		break;
			case 3: 
				System.out.println("Mart");
		break;
			case 4: 
				System.out.println("April");
		break;
			case 5: 
				System.out.println("Maj");
		break;
			case 6: 
				System.out.println("Jun");			
		break;
			case 7: 
				System.out.println("Jul");
		break;
			case 8: 
				System.out.println("Avgust");
		break;
			case 9: 
				System.out.println("Septembar");
		break;
			case 10: 
				System.out.println("Oktobar");
		break;
			case 11: 
				System.out.println("Novembar");
		break;
			case 12: 
				System.out.println("Decembar");			
		break;
			default:
				System.out.println("Potrebno je uneti broj od 1 do 12.");
		
		}
			
			
			
			
	}
}

