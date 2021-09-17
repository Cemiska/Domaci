package domaci;

import java.util.ArrayList;

public class GlavnaKlasaGlumci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Glumci glumac1 = new Glumci("Tom", "Hardy", 1977, "muski");
		glumac1.setbracniStatus(true);
		glumac1.setprosekZaradePoFilmu(4800000);
		glumac1.setbrojFilmova(45);
		glumac1.stampanje();
		
		Glumci glumica1 = new Glumci("Charlize", "Theron", 1975, "zenski");
		glumica1.setbracniStatus(true);
		glumica1.setprosekZaradePoFilmu(10000000);
		glumica1.setbrojFilmova(42);
		glumica1.stampanje();
		
		Glumci glumac2 = new Glumci("Christoph", "Waltz", 1956, "muski");
		glumac2.setbracniStatus(true);
		glumac2.setprosekZaradePoFilmu(1000000);
		glumac2.setbrojFilmova(110);
		glumac2.stampanje();
		
		Glumci glumica2 = new Glumci("Helen", "Mirren", 1945, "zenski");
		glumica2.setbracniStatus(true);
		glumica2.setprosekZaradePoFilmu(2100000);
		glumica2.setbrojFilmova(61);
		glumica2.stampanje();
		
		ArrayList poslednjih5filmova1 = new ArrayList();
		poslednjih5filmova1.add("Capone, ocena 4.7"); // 4.7);
		poslednjih5filmova1.add("Venom, ocena 6.7"); // 6.7);
		poslednjih5filmova1.add("Dunkirk, ocena 7.8"); // 7.8);
		poslednjih5filmova1.add("Revenant, ocena 8.0"); // 8.0);
		poslednjih5filmova1.add("Legend, ocena 6.9"); // 6.9);
		
	
		for(int i = 0; i < poslednjih5filmova1.size(); i++) {
			System.out.println("Poslednjih 5 filmova Toma Hardija su: " + poslednjih5filmova1.get(i));
		}
		
		ArrayList poslednjih5filmova2 = new ArrayList();
		poslednjih5filmova2.add("F9: The Fast Saga, ocena 5.2"); 
		poslednjih5filmova2.add("The Old Guard, ocena 6.7"); 
		poslednjih5filmova2.add("Bombshell, ocena 6.8"); 
		poslednjih5filmova2.add("Long Shot, ocena 6.8"); 
		poslednjih5filmova2.add("Gringo, ocena 6.1");
		
		for(int i = 0; i < poslednjih5filmova2.size(); i++) {
			System.out.println("Poslednjih 5 filmova Sarliz Teron su: " + poslednjih5filmova2.get(i));
		}
		
		ArrayList poslednjih5filmova3 = new ArrayList();
		poslednjih5filmova3.add("The French Dispatch, ocena 7.2"); 
		poslednjih5filmova3.add("Rifkin's Festival, ocena 6.1"); 
		poslednjih5filmova3.add("Georgetown, ocena 6.0"); 
		poslednjih5filmova3.add("Alita: Battle Angel, ocena 7.3"); 
		poslednjih5filmova3.add("Downsizing, ocena 5.7");
		
		for(int i = 0; i < poslednjih5filmova3.size(); i++) {
			System.out.println("Poslednjih 5 filmova Kristofa Valca su: " + poslednjih5filmova3.get(i));
		}
		
		ArrayList poslednjih5filmova4 = new ArrayList();
		poslednjih5filmova4.add("The French Dispatch, ocena 7.2"); 
		poslednjih5filmova4.add("The Duke, ocena 6.5"); 
		poslednjih5filmova4.add("The Good Liar, ocena 6.7"); 
		poslednjih5filmova4.add("Anna: Battle Angel, ocena 6.6"); 
		poslednjih5filmova4.add("Berlin, I love you, ocena 4.6");
		
		for(int i = 0; i < poslednjih5filmova4.size(); i++) {
			System.out.println("Poslednjih 5 filmova Helen Miren su: " + poslednjih5filmova4.get(i));
		}
	}
	
}
