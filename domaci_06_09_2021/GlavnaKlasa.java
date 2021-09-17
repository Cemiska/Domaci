package domaci;

import java.util.ArrayList;

/*Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti ulogu koju mu je covek dodelio.
*/

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		ArrayList<Zivotinje> zivotinje = new ArrayList<Zivotinje>();
	
		Sisari s1 = new Sisari("kicmenjak", "jaguar", "majmuni, ribe", "zuto-braon-crna", "mesojed", "divlja");
		Sisari s2 = new Sisari("Kicmenjak", "slon", "biljke", "crna", "biljojed", "divlja");
		
		Ribe r1 = new Ribe("kicmanjek", "pirana", "ribe", "slatka", 7, "ledjno, trbusno i repno");
		Ribe r2 = new Ribe("kicmenjak", "ajkula", "ribe i sisari", "slana", 5, "ledjno, trbusno i repno");
		
		s1.setBojaDlake("crna");
		s1.setCovekovaPodela("domaca");
		
		Staniste st1 = new Staniste("Dzungla", zivotinje);
		
		zivotinje.add(s1);
		zivotinje.add(s2);
		zivotinje.add(r1);
		zivotinje.add(r2);
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(r1);
//		System.out.println(r2);
		System.out.println(st1);
}

}