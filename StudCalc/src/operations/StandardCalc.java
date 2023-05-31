package operations;

import java.util.Scanner;

public class StandardCalc {
	private int decimals;
	private float brueche;
	private String funktionen;

	public StandardCalc(int decimals, int decimal) {
		operation(decimals, decimal);
	}

	public StandardCalc(String funktionen) {

	}

	private void operation(int decimals, int decimal) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("0 = Addieren");
		System.out.println("1 = Multiplizieren");
		System.out.println("2 = Subtrahieren");
		System.out.println("3 = Dividieren");
		System.out.println("_________________________________________________________________________________");
		System.out.print("Bitte Operation waehlen: ");
		int operation = scanner.nextInt();
		switch (operation) {
		case 0:
			System.out.println("Ergebnis der Addition: " + (decimals + decimal));
		case 1:
			System.out.println("Ergebnis der Multiplikation: " + (decimals * decimal));
		case 2:
			System.out.println("Ergebnis der Subtraktion: " + (decimals - decimal));
		case 3:
			System.out.println("Ergebnis der Division: " + (decimals / decimal));

		}

	}
}
