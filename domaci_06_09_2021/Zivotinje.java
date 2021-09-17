package domaci;

/* U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu (kicmenjaci, beskicmenjaci), konkretan naziv i cime se hrane.
 * 
 * Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja
Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.

Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti ulogu koju mu je covek dodelio.
*/

public class Zivotinje {
	
	private String vrsta;
	private String naziv;
	private String ishrana;
	
	
	public Zivotinje(String vrsta, String naziv, String ishrana) {
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.ishrana = ishrana;
	}


	public String getVrsta() {
		return vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIshrana() {
		return ishrana;
	}


	@Override
	public String toString() {
		
		return "Zivotinja " + this.naziv + " je po vrsti " + this.vrsta + " i hrana su joj: " + this.ishrana + ".";
	}




}
