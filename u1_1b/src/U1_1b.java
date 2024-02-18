
public class U1_1b {
	/*
	 * double ist ein float mit doppelter Genauigkeit, float 6-Ziffern, double
	 * 15-Ziffern 1.23456 , 123.346 entspricht 1.23456e2 (1.23456 x 10^2),
	 * 1.23456789012345
	 */

	// 3 Double Werte als Klassenvariablen deklarieren
	static double a;
	static double b;
	static double c;

	// 3 Double Ausgabe-Werte als Klassenvariablen deklarieren
	static double a1;
	static double b1;
	static double c1;

	public static void main(String[] args) {
		
		// 3 Double-Werte von der Tastatur einlesen
		werteEinlesen();

		// Werte a, b, c kopieren
		a1 = a;
		b1 = b;
		c1 = c;

		// Obige Werte sortieren
		werteSortieren();

		// Resultat auf die Konsole ausgeben
		ausgabe(a, b, c, "");
		ausgabe(a1, b1, c1, "1");
	}

	private static void werteSortieren() {
		double h;

		if (a1 > b1) {
			h = a1;
			a1 = b1;
			b1 = h; // a1 < b1, c1 ?

			f1(a1, b1, c1);
		} else {
			// a1 <= b1, c1 ? a1, b1
			f1(a1, b1, c1);
		}
	}

	static void werteEinlesen() {

		System.out.print("Double Wert a eingeben: ");
		a = Terminal.readDouble();

		System.out.print("Double Wert b eingeben: ");
		b = Terminal.readDouble();

		System.out.print("Double Wert c eingeben: ");
		c = Terminal.readDouble();

	}

	static void ausgabe(double aa, double b, double c, String x) {
		System.out.print("a" + x + " = " + aa);
		System.out.print(", b" + x + " = " + b);
		System.out.println(", c" + x + " = " + c);
	}

	static void f1(double x, double y, double z) {

		double h;

		if (z <= x) {
			// z <= x < y
			h = z;
			z = y;
			y = x;
			x = h;
		} else {
			// z > x, y ? z
			if (y > z) {
				// z > x, y > z
				h = y;
				y = z;
				z = h;
			}
		}

		a1 = x;
		b1 = y;
		c1 = z;

	}

}
