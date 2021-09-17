package domaci;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza (znaci da korisnik unosi tri broja) i taj program treba da pozove i
		 * ispise (u mainu) najmanji od ta tri unesena broja.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite tri broja: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int x = najmanjiBroj(a, b, c);

		System.out.println("Najmanji broj je: " + x);

	}

	public static int najmanjiBroj(int a, int b, int c) {

		if (a < b && a < c) {
			int min = a;
			return a;
		} else if (b < c) {
			int min = b;
			return b;
		} else
			return c;

	}

}
