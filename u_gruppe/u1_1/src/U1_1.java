
public class U1_1 {

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

			if (c1 <= a1) {
				// c1 <= a1 < b1
				h = c1;
				c1 = b1;
				b1 = a1;
				a1 = h;
			} else {
				// c1 > a1, b1 ? c1
				if (b1 > c1) {
					// c1 > a1, b1 > c1
					h = b1;
					b1 = c1;
					c1 = h;
				}
			}

		} else {
			// a1 <= b1, c1 ? a1, b1
			if (c1 < a1) {
				// a <= b1, c1 < a1
				h = c1;
				c1 = b1;
				b1 = a1;
				a1 = h;
			} else {
				// a1 <= b1, c1 >= a1
				if (c1 < b1) {
					// a1 <= b1, c1 < b1
					h = c1;
					c1 = b1;
					b1 = h;
				}
			}
		}

		// Resultat auf die Konsole ausgeben

		//System.out.printf("Vorgabe: a = %.14g, b = %.14g, c = %e.14g%n", a, b, c);
		//System.out.printf("Sortiert: %.14g, %e, %e%n", a1, b1, c1);
		
		System.out.print("a = " + a);
		System.out.print(", b = " + b);
		System.out.println(", c = " + c);

		System.out.print("a1 = " + a1);
		System.out.print(", b1 = " + b1);
		System.out.println(", c1 = " + c1);
	}

}
