
public class U1_1a {

	public static void main(String[] args) {

		/*
		 * double ist ein float mit doppelter Genauigkeit, float 6-Ziffern, double
		 * 15-Ziffern 1.23456 , 123.346 entspricht 1.23456e2 (1.23456 x 10^2),
		 * 1.23456789012345
		 */
		
		// 3 Double Werte deklarieren

		double a;
		double b;
		double c;

		// 3 Double-Werte von der Tastatur einlesen

		System.out.print("Double Wert a eingeben: ");
		a = Terminal.readDouble();

		System.out.print("Double Wert b eingeben: ");
		b = Terminal.readDouble();

		System.out.print("Double Wert c eingeben: ");
		c = Terminal.readDouble();

		// Obige Werte sortieren

		double a1 = a;
		double b1 = b;
		double c1 = c;

		double h;

		if (a1 > b1) {

			h = a1;
			a1 = b1;
			b1 = h; // a1 < b1, c1 ?

			double[] liste = f1(a1,b1,c1);
			a1 = liste[0];
			b1 = liste[1];
			c1 = liste[2];

		} else {
			// a1 <= b1, c1 ? a1, b1
			double[] liste = f1(a1,b1,c1);
			a1 = liste[0];
			b1 = liste[1];
			c1 = liste[2];
		}

		// Resultat auf die Konsole ausgeben

		ausgabe(a,b,c);
		ausgabe(a1,b1,c1);
	}

	
	static void ausgabe(double a, double b, double c) {
		System.out.print("a = " + a);
		System.out.print(", b = " + b);
		System.out.println(", c = " + c);
	}

	public static double[] f1(double a, double b, double c) {
		
		double h;
		
		if (c <= a) {
			// c <= a < b
			h = c;
			c = b;
			b = a;
			a = h;
		} else {
			// c > a, b ? c
			if (b > c) {
				// c > a, b > c
				h = b;
				b = c;
				c = h;
			}
		}
		
		double[] retVal = {a, b, c};
		return retVal;
		
	}

}
