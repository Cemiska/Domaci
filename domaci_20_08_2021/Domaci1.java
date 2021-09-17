package domaci;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve osim prvog i poslednjeg unosa.
		
		String[] gradovi = {"Atina", "Larisa", "Solun", "Patra", "Janjina"};
	
		for (int i = 1; i < gradovi.length -1; i++) {
			
			System.out.println(gradovi[i]);
		}
		
	}

}
