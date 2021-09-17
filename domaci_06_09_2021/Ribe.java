package domaci;

// Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja

public class Ribe extends Kicmenjaci{

	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;
	
	public Ribe(String vrsta, String naziv, String ishrana, String mestoObitavanja, int brojPeraja,
			String vrstaPeraja) {
		super(vrsta, naziv, ishrana);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getMestoObitavanja() {
		return mestoObitavanja;
	}


	public int getBrojPeraja() {
		return brojPeraja;
	}


	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	@Override
	public String toString() {
		
		return super.toString() + " Vrsta vode u kojoj zivi: " + this.mestoObitavanja + "\n" + "Broj peraja: " + this.brojPeraja + ", vrsta peraja: " + this.vrstaPeraja;
	}

	
	
	
	
	
	
}
