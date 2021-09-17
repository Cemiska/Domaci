package domaci;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
		(Koristiti for petlju)
		Na primer N: 5
		 *
		 **
		 ***
		 ****
		 *****
		*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite znak \"*\": ");
			char zvezda = s.next().charAt(0);
			

			for (int i=0; i < 10; i++)  {   
				for (int j = 0; j < i; j++)   {   
					System.out.print("*");   
			}   
					System.out.println();  	// fizicki ga prebacuje u sledeci red  
			}
			}
		
		
		
	}


