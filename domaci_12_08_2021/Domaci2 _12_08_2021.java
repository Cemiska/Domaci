package domaci;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Uneti poluprečnik kruga: ");
		
		double r = s.nextDouble();
		double p = r*r*Math.PI;
		double o = 2*r*Math.PI;
		
		if (r <= 0) {
			System.out.println("Poluprečnik nije validan.");
		} else if (r <= 5) { 
			System.out.println("Površina kruga je: " + p);
		} else if (r>5 && r <=10) {
			System.out.println("Obim kruga je: " +  o);
		} else if (r>10) {
			System.out.println("Površina kruga je: " + p + " a, obim kruga je: " + o);
		} else {
			System.out.println("Podaci nisu ispravno uneti.");
		}
		
		s.close();
	}

}
