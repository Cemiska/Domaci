package domaci;

/*
Otezana verzija za vezbu:

Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.

Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.

Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze.
 Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. 
 Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.
 */

public class Covek {

	private String imePrezime;

	public Covek(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	@Override
	public String toString() {
		return this.imePrezime;
	}
	
}
