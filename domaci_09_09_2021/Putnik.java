package domaci;

//Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
//Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.

public class Putnik extends Covek {

	private int novac;

	public Putnik(String imePrezime, int novac) {
		super(imePrezime);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}
	
	public void setNovac(int novac) {
		this.novac = novac;
	}

	public void dodajNovac(int kolicina) {

		this.novac = this.novac + kolicina;
	}
	
	public void oduzmiNovac(int kolicina) {
	
		this.novac = this.novac - kolicina;
	}
	
	@Override
	public String toString() {
		return "Putnik/-ica " + super.getImePrezime() + " poseduje " + this.novac + " din.";
	}
}
