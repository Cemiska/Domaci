package domaci;

import java.util.Scanner;

public class DomaciJoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nadji zbir svih parnih i zbir svih neparnih brojeva izmedju dva proizvoljna uneta broja 

		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int broj1 = s.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		int broj2 = s.nextInt();
		
			 
		if (broj1>broj2) {
			
			int swap = broj1;					
			broj1 = broj2;
			broj2 = swap;			
		}
				
		int i = broj1;							
		int zbir = 0;
		
		while (i<broj2) {						
			
			zbir = zbir + i;
			System.out.println("Iterator: " + i + ", zbir: " + zbir);
			i++;
			
			
			
		
		
		System.out.println("Zbir svih brojeva između dva unosa je: " + zbir);
	
	}
	}
}
