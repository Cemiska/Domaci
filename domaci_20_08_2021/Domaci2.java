package domaci;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid), 
		//a program stampa gradove sve dok ne dodje do "Prag"-a.
		
		String[] gradovi = {"Lisabon", "London", "Helsinki", "Prag", "Madrid"};
		
		for (String grad : gradovi) {
			
			if (grad.equals("Prag")) {
			
				break;
			
		}
			System.out.println(grad);
		}	
		
	}
	
}

