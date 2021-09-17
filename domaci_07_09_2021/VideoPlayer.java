package zadatak3;

/*Kreirati klasu Video Player koja ima:
 duzinu videa
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa (144, 240, 360, 480, 720, 1080)
 
 getere, setere i konstruktore
 
 metodu stampaj koja stampa podatke u formatu:
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa
*/
public class VideoPlayer {

	private int duzinaVidea;
	private int trenutnoVreme;
	private int jacinaZvuka;
	private int kvalitetVidea;
	
	public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVreme = trenutnoVreme;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}

	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	
	public void stampanje( ) {
		System.out.println("Trenutno vreme: " + this.trenutnoVreme);
		System.out.println("Jacina zvuka: " + this.jacinaZvuka);
		System.out.println("Kvalitet videa: " + this.kvalitetVidea);
	}
}
