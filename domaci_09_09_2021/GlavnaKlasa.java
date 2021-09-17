package domaci;

import java.util.ArrayList;

import com.sun.tools.classfile.StackMapTable_attribute.same_frame;

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

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Covek c1 = new Covek("Marko Jovanovic");
		System.out.println(c1);
		

		ArrayList<Putnik>listaPutnika = new ArrayList<Putnik>();
		
		Putnik p1 = new Putnik("Aleksandar Nikolic", 1000);
		p1.dodajNovac(200);
		p1.oduzmiNovac(200);
	
		
		Putnik p2 = new Putnik("Dragan Zivanovic", 2300);
		p2.oduzmiNovac(300);
	
		
		
		listaPutnika.add(p1);
		listaPutnika.add(p2);
	
		for (int i = 0; i < listaPutnika.size(); i++) {
			System.out.println(i+1 + ". putnik je: " + listaPutnika.get(i).getImePrezime());
		}
	
	}

}
