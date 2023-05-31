package operations;

public class Bruch {
	private int zaehler;
	private int nenner;

	public Bruch(String Bruch) {
		strtobr(Bruch);
	}

	public void strtobr(String Bruch) {
		int zahl = 0;
		for (int c = 0; c < Bruch.length(); c++) {
			if (Bruch.charAt(c) == '/' && zahl == 0) {
				try {
					this.setZaehler(Integer.valueOf(Bruch.substring(0, c)));
					this.setNenner(Integer.valueOf(Bruch.substring(c + 1)));
					zahl = 1;
				} catch (NumberFormatException e) {
					System.out.println("Uebergebener Bruch enthaelt keine Zahl.");
					e.printStackTrace();
				}
			}
		}
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

}
