package domaci;

import java.util.Scanner;

public class DomaciWHILE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen
		 * negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako
		 * korisnik unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner s = new Scanner(System.in);

		double broj = 0;
		double zbir = 0;
		double negBroj = 0;

		do { 
			
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			
			
			if (broj>0) {
				zbir = zbir + broj;
				System.out.println("Zbir je: " + zbir);
			} else if (broj<0) {
				
				System.out.println("Zbir je: " + (zbir - negBroj));
				System.out.println("Kraj programa");
				break;
			} 
		} while (true); 
			
		
		}
}
