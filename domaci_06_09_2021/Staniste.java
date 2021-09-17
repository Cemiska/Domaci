package domaci;

import java.util.ArrayList;

// Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
// Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

public class Staniste {

	private String naziv;
	private ArrayList<Zivotinje> zivotinje;
	
	
	public Staniste(String naziv, ArrayList<Zivotinje> zivotinje) {
		this.naziv = naziv;
		this.zivotinje = zivotinje;
	}

	
	public String getNaziv() {
		return naziv;
	}

	public ArrayList<Zivotinje> getZivotinje() {
		return zivotinje;
	}

	public void setZivotinje(ArrayList<Zivotinje> zivotinje) {
		this.zivotinje = zivotinje;
	}


	@Override
	public String toString() {
		
		return "U stanistu " + this.naziv + " zive sledece zivotinje: " + this.zivotinje;
	}


	
	
	
}
