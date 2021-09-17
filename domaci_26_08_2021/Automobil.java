package zadaci;

public class Automobil {
	
	/* Napraviti klasu automobil i dve main klase 
	 * gde ce se u jednoj stampati podaci preko praznog konstruktora, 
	 * a u drugom preko punog konstruktora. Atributi su marka, model, pogon, broj vrata i godiste.
	 */
	/* Dodati atribute "potrosnjaGoriva" (int) i "kubikaza" (int). 
	 * Ako kubikaza prelazi 1000 cm^3 onda stampati potrosnju da je 10 litara, ako je kubikaza ispod 1000 onda stampati da je potrosnja 8 litara.
	 */
	// Izracunati koliko je ukupno novca potroseno na gorivo, ako je cena jednog litra 120 dinara

	public String marka;		// Automobil1 prima vrednosti iz main klase i stavlja ih u atribute i to postaje objekat Automobil1
	public String model;
	public String pogon;
	public int brojVrata;
	public int godiste;
	private int predjeniKm;
	public int potrosnjaGoriva;
	public int kubikaza;
	public double litar = 120;
	public double novacZaGorivo;
	
	
	public Automobil(String marka, String model, String pogon, int brojVrata, int godiste, int kubikaza) {
		
		this.marka = marka;
		this.model = model;
		this.pogon = pogon;
		this.brojVrata = brojVrata;
		this.godiste = godiste;
		this.kubikaza = kubikaza;
		
	}
	
	public Automobil() {
		
	}
	
	public void stampanjePodataka() {
		System.out.println("Marka automobila je: " + marka + "\nmodel automobila je: " + model + 
							"\npogon je: " + pogon + "\nima: " +  brojVrata + " vrata" + "\ngodina proizvodnje je: " 
							+ godiste + "\nkilometraza je: " + getPredjeniKm() + " km\npotrošnja je: " 
							+ potrosnja() + " litara na 100km"
							+ "\na ukupno potroseno na gorivo je: " + novacZaGorivo() + " din.");
		}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}
	
	public int getPredjeniKm() {
		
		return this.predjeniKm;
	}
	
	public int potrosnja() {
		
		if (this.kubikaza > 1000) {
			return this.potrosnjaGoriva = 10;
		} else {
			return this.potrosnjaGoriva = 8;
		}
	}
	
	public double novacZaGorivo() {
		
			double litar = 120; 
			double novacZaGorivo = (litar*potrosnja()*predjeniKm)/100;
			return novacZaGorivo;
	}
	
	
}
	
	


	
	
	
	

