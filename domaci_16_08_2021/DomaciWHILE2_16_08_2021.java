package domaci;

import java.util.Scanner;

public class DomaciWHILE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
		 * onoliko puta koliko je korisnik zadao preko konzole. Primer: ako korisnik
		 * unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite neki broj: ");
		int n = s.nextInt();
		int i = 0;

		while (i < n) {
			System.out.println("Laku noc!");
			i++;
		}

	}
}