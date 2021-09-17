package domaci;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan
		 * broj prikaze mu se suma svih prethodno unetih brojeva i na kraju
		 * zakomentarisati koje ste brojeve sve unosili po testu na primer: //test 1 x,
		 * y, z //test 2 x, y, z //test 3 x, y, z (Koristiti do while petlju)
		 */
		Scanner s = new Scanner(System.in);

		int broj = 0;
		int zbir = 0;

		do {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();

			if (broj < 0) {
			
				System.out.println("Zbir je: " + zbir);
			}
			zbir = zbir + broj;
		} while (broj > 0);
		
		System.out.println("Kraj programa");

		// test 1: 2, 4, 6, -2; zbir: 12
		// test 2: 2 3, 6, 8, 11, -10; zbir: 30
		// test 3: -10; zbir: 0
	}

}
