package domaci;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program
		 * koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve
		 * metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih
		 * brojeva.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite 3 cela broja: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int sum = zbir(a, b, c);
		System.out.println("Zbir je: " + sum);

		int max = najvećiBroj(a, b, c);
		System.out.println("Najveći broj je: " + max);

	}

	public static int zbir(int a, int b, int c) {

		return a + b + c;
	}

	public static int najvećiBroj(int a, int b, int c) {

		if (a > b && a > c) {
			int max = a;
			return a;
		} else if (b > c) {
			int max = b;
			return b;
		} else
			return c;

	}
}
