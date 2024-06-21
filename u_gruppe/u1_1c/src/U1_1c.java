import java.util.Scanner;

public class U1_1c {
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
	
	private static Scanner eingabe = new Scanner(System.in);

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

		while (true) {
			try {
				System.out.print("Double Wert a eingeben: ");
				String s = eingabe.nextLine();
				a = Double.parseDouble(s);

			} catch (Exception e) {
				a = 0;
				System.err.println("Fehler: Eingabe war kein Double.");
				continue; // mit while fortfahren
			}
			break; // while verlassen
		}
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println((i + 1) + ". Versuch");
			System.out.print("Double Wert b eingeben: ");
			String s = eingabe.nextLine();
			
			try {
				b = Double.parseDouble(s);
				i = 23;
				// oder break;
			} catch (Exception e) {
				b = 0;
				System.err.println("Fehler: Eingabe war kein Double.");
			}
			if(i == 9) {
				System.out.println("Dies war der letzte Versuch.");
				System.out.println("Es wird nun gwuerfelt.");
				
				// Zahl zwischen 1 und 6 wuerfeln
				int j = (int) (Math.random() *  6) + 1;
				
				// Double zwischen 0 und kleiner 1 wuerfeln
				System.out.println("Es wurde " + j + " gewuerfelt.");
				
				a = j;
			}
		}

		System.out.print("Double Wert c eingeben: ");
		c = eingabe.nextDouble();

	}

	static void ausgabe(double aa, double bb, double cc, String x) {
		System.out.print("a" + x + " = " + aa);
		System.out.print(", b" + x + " = " + bb);
		System.out.println(", c" + x + " = " + cc);
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
