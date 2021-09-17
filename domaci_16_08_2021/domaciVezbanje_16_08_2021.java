package domaci;

import java.util.Scanner;

public class domaciVezbanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int x;
		int sum = 0;
		x = s.nextInt();
		while (x >= 0) {
			sum += x;
			x = s.nextInt();
		}
		System.out.println("Suma unetih pozitivnih brojeva je: " + sum);
		
		
	}

}
