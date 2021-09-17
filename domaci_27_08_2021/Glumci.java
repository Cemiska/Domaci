package domaci;

import java.util.ArrayList;

public class Glumci {

	/*
	 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
	 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
	 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
	 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
	 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
	 * da se doda "Mr." ili "Mrs." ako su zenskog pola. 
	 * Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
	 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
	 * ocenjenog filma od tih pet (preko getera i setera).
	 */

	public String ime;
	public String prezime;
	public int godinaRodjenja;
	public String pol;
	private boolean bracniStatus;
	private long prosekZaradePoFilmu;
	private int brojFilmova;
	
	public long ukupnaZarada;

	public Glumci(String ime, String prezime, int godinaRodjenja, String pol) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
	}

	public void stampanje() {
		System.out.println("Glumac/ica: " + titula() + " " + ime + " " + prezime + "\nGodina rodjenja: " + godinaRodjenja + "\nPol: "
				+ pol + "\nOzenjen/udata: " + getbracniStatus() + "\nProsecna zarada po filmu: " + getprosekZaradePoFilmu() 
				+ "\nBroj snimljenih filmova: " + getbrojFilmova() + "\nUkupna zarada u svim filmovima: " 
				+ getukupnaZarada() + "\n2022. godine napunice " + godine2022() + " godina.");

	}

	public void setbracniStatus(boolean b) {

		this.bracniStatus = b;
	}

	public boolean getbracniStatus() {

		return bracniStatus;
	}

	public void setprosekZaradePoFilmu(long prosekZarade) {
	
		this.prosekZaradePoFilmu = prosekZarade;
	}
	
	public long getprosekZaradePoFilmu() {
		
		 return prosekZaradePoFilmu;
	}
	
	public void setbrojFilmova(int b) {
		this.brojFilmova = b;
	}
	
	public int getbrojFilmova() {
		return brojFilmova;
	} 
	
	public void setukupnaZarada(long ukupnaZarada) {
		
		this.ukupnaZarada = ukupnaZarada;
	}
	
	public long getukupnaZarada() {
		
		return ukupnaZarada = prosekZaradePoFilmu * brojFilmova;
	}
	
	public int godine2022() {
		
		return 2022 - godinaRodjenja;
	}
	
	public String titula() {
		
		
		if(this.pol.equals("muski")) {
			return "Mr";
		} else if (this.prezime.equals("Mirren")) {
			return "Dame";
		}
		else {
			return "Mrs";
		}	
		
		
	}
	
}
