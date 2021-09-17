package domaci;

import java.util.Scanner;

public class Domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji oponasa kviz za pogadjanje glavnog grada. - Program
		 * treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
		 * 1. Francuska 2. Italija 3. Srbija 4. Izlaz - Nakon odabira drzave, potrebno
		 * je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako korisnik
		 * odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik odgovori
		 * netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja odgovora
		 * (bilo da je tacan ili netacan), ponovo treba da se postave sve pocetne opcije
		 * i ponudi korisniku da odabere neku od njih. - Program se zavrsava kad korisni
		 * odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem dosad naucenog +
		 * do-while petlje
		 */

		Scanner s = new Scanner(System.in);

		String glGradFranc = "Pariz";
		String glGradItal = "Rim";
		String glGradSrb = "Beograd";

		do {
			System.out.println("Izaberite opcije: \n 1 za Francusku \n 2 za Srbiju \n 3 za Italiju \n 4 za izlaz iz kviza.");
			int opcija = s.nextInt();

			if (opcija == 4) {
				System.out.println("Kviz je završen.");
				break;
			} else if (opcija == 1) {
				System.out.println("Koji je glavni grad Francuske?");
				glGradFranc = s.next();

				if (glGradFranc.equals(glGradFranc)) {
					System.out.println("Odgovor je tačan.");
				} else {
					System.out.println("Odgovor je netačan.");
				}
			} else if (opcija == 2) {
				System.out.println("Koji je glavni grad Italije?");
				glGradItal = s.next();

				if (glGradItal.equals(glGradItal)) {
					System.out.println("Odgovor je tačan.");
				} else {
					System.out.println("Odgovor je netačan.");
				}
			} else if (opcija == 3) {
				System.out.println("Koji je glavni grad Srbije?");
				glGradSrb = s.next();
				if (glGradSrb.equals(glGradSrb)) {
					System.out.println("Odgovor je tačan.");
				} else {
					System.out.println("Odgovor je netačan.");
				}
			}

		}

		while (true);
	}
}
