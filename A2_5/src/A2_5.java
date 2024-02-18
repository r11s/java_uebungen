
public class A2_5 {

	public static void main(String[] args) {

		int a;
		int b;

		System.out.print("a = ");
		a = Terminal.readInt();

		System.out.print("b = ");
		b = Terminal.readInt();

		int g = GreatestCommonDivisor(a, b);

		System.out.println("ggt(" + a + "," + b + ") = " + g);

		System.out.println(g);

		/*
		 * int a1 = a / g; int b1 = b / g; System.out.println(a1);
		 * System.out.println(b1);
		 */

	}

	public static int GreatestCommonDivisor(int a, int b) {

		boolean abrechen = false;

		while (!abrechen) {
			// 1. Berechne den Teilerrest von a und b: r <- a % b.
			int r = a % b;
			System.out.println(r + " = " + a + " % " + b);

			// 2. Falls r=0: b ist der gesuchte ggT. Algorithmus abbrechen,
			// sonst weiter mit Schritt3.
			if (r == 0) {
				abrechen = true;
			} else {

				// 3. Verschiebe die Werte: a <- b, b <- r. Weiter mit Schritt 1.
				a = b;
				b = r;
			}
		}

		return b;

	}

	public static int GreatestCommonDivisorFor(int a, int b) {


		// for( Initialisierung; Abbruchkriterium; Inkrementierung )
		
		// for (; !abrechen; ) identisch while(!abbrechen)

		boolean abrechen = false;
		
		for (; !abrechen; ) {
			// 1. Berechne den Teilerrest von a und b: r <- a % b.
			int r = a % b;
			System.out.println(r + " = " + a + " % " + b);

			// 2. Falls r=0: b ist der gesuchte ggT. Algorithmus abbrechen,
			// sonst weiter mit Schritt3.
			if (r == 0) {
				abrechen = true;
			} else {

				// 3. Verschiebe die Werte: a <- b, b <- r. Weiter mit Schritt 1.
				a = b;
				b = r;
			}
		}

		return b;
		
		/*
		a = b + c++;
		
		ist
		
		a = b + c;
		c++;

		// ------------
		a = b + ++c;
		
		ist 
		
		c++;
		a = b + c;
		
		*/

	}

}
