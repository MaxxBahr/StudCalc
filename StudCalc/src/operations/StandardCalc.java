package operations;

import java.util.Scanner;

public class StandardCalc {
	private float brueche;
	private String funktionen;
	private double ergebnisexpo;

	public StandardCalc(int decimals, int decimal) {
		stdoperation(decimals, decimal);
	}

	public StandardCalc(String funktionen) {

	}

	public StandardCalc() {
	}

	public void stdoperation(int decimals, int decimal) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("0 = Addieren");
		System.out.println("1 = Multiplizieren");
		System.out.println("2 = Subtrahieren");
		System.out.println("3 = Dividieren");
		System.out.println("_________________________________________________________________________________");
		System.out.print("Bitte Operation waehlen: ");
		int operation = scanner.nextInt();
		scanner.close();
		switch (operation) {
		case 0:
			System.out.println("Ergebnis der Addition: " + (decimals + decimal));
			break;
		case 1:
			System.out.println("Ergebnis der Multiplikation: " + (decimals * decimal));
			break;
		case 2:
			System.out.println("Ergebnis der Subtraktion: " + (decimals - decimal));
			break;
		case 3:
			System.out.println("Ergebnis der Division: " + Float.valueOf(decimals / decimal));
			break;
		default:
			System.out.println("Operation nicht verfuegbar!");
			break;

		}
	}
	public void bruchtodec(String bruch) {
		Bruch bru = new Bruch(bruch);
		System.out.println("Bruch als Dezimalzahl: " + (bru.getZaehler() / bru.getNenner()));
	}
	
	public void setBrueche(String bruch) {
		Bruch bru = new Bruch(bruch);
		this.brueche = bru.getZaehler() / bru.getNenner();
	}
	
	public void setErgebnisexpo(float basis, float exponent) {
		this.ergebnisexpo = Math.pow(basis, exponent);
	}
	
	public double getErgebnisexpo() {
		return ergebnisexpo;
	}

	public float getBrueche() {
		return brueche;
	}

	public void setBrueche(float brueche) {
		this.brueche = brueche;
	}
}
