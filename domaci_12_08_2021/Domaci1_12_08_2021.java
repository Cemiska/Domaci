package domaci;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Napisati program gde deklarisete vase ime, prezime kao string, pol kao char 
		 * i odstampajte adekvatno sva tri unosa.
		 * Nakon toga preko skenera treba da unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama
		 * i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama, 
		 * na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja. 
		 */
		
		
		String ime = "Milica";
		String prezime = "Pantic";
		char pol = 'ž';
				
				System.out.println("Moje ime je: " + ime);
				System.out.println("Moje prezime je: " + prezime);
				System.out.println("Pol: " + pol);
				
				Scanner s = new Scanner(System.in);
				
				

						System.out.print("Ukupan broj medalja koje je Srbija osvojila na OI je: ");
						int ukupanBrojMedalja = s.nextInt() ;

						System.out.print("Ukupan broj zlatnih medalja koje je Srbija osvojila na OI je: ");
						int brojZlatnihMedalja = s.nextInt();

						double procenat = ((double)(brojZlatnihMedalja*100)/ukupanBrojMedalja); 
						System.out.print("Procenat zlatnih medalja u odnosu na ukupan broj je: " + procenat);
		
		
		s.close();
		
		

	}

}
