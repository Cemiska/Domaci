package domaci;

import java.util.ArrayList;

//Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
//Naziv i cena karte i zadaju se prilikom kreiranja. 
//Moguce je dodati/ukloniti putnika kao i vozaca.

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> listaPutnika;
	
	public Autobus(String naziv, Vozac vozac, double cenaKarte, ArrayList<Putnik> listaPutnika) {
		
		this.naziv = naziv;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		this.listaPutnika = listaPutnika;
	}

	
	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}


	public ArrayList<Putnik> getListaPutnika() {
		return listaPutnika;
	}


	public void setListaPutnika(ArrayList<Putnik> listaPutnika) {
		this.listaPutnika = listaPutnika;
	}

	
	public double cenaPrevoza(int brojKarata) {
		double placanje;
		if (prisutanVozac()) {
			 placanje = cenaKarte * brojKarata;
			
			return placanje;
		}
		else {
			placanje = 0;
				return placanje;
		}
		
	}
	public boolean prisutanVozac() {
		if (this.vozac == null) {
			return false;
		}
		else
			return true;
	}

}
