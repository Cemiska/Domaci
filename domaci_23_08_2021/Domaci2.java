package domaci;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj
		 * program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite 3 cela broja: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int p = proizvod(a, b, c);

		System.out.println("Proizvod je: " + p);

	}

	public static int proizvod(int a, int b, int c) {

		return a * b * c;
	}

}
