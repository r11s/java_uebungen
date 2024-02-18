package u3_4;

/*

Aufgabe 3.4

Schreiben Sie ein Programm, bei dem man den Typ der Figur und ihre Grösse angeben
kann, und das anschliessend eine der folgenden Figuren zeichnet:

   *****       *          *****                *
   *****       **          *****              ***
   *****       ***          *****            *****
   *****       ****          *****          *******
   *****       *****          *****        *********

Die vier Funktionen zum Zeichnen der Figuren sollen als vier eigene Java-Funktionen
unter folgenden Namen definiert werden: square(), halfTriangle(), parallelogram(),
triangle().

Welche Parameter und welchen Rückgabetyp müssen die vier Funktionen aufweisen?

Tip: Lösen Sie zuerst die einfachen, dann die schwierigeren Funktionen:
	• am einfachsten: square()
	• relativ einfach: halfTriangle()
	• etwas schwieriger: parallelogram()
	• am schwierigsten: triangle()
	
Zusatzaufgabe:

Bei den beiden Dreiecks-Funktionen soll durch einen zusätzlichen boolean-Parameter
angegeben werden können, ob die Figur so gezeichnet wird wie oben gezeigt oder
ob sie auf dem Kopf steht.

       *****          *****        *********
       ****          *****          *******
       ***          *****            *****
       **          *****              ***
       *          *****                *

*/

public class Figuren {

	public static void main(String[] args) {

		int n = 5;

		square(n);
		parallelogram(n);
		triangle(n);
		halfTriangle(n, false);
		halfTriangle(n, true);

	}

	private static void triangle(int n) {

		// Kopfzeile (Spalten)

		int n2 = 2 * n - 1;

		System.out.print(" " + " ");

		for (int j = 0; j < n2; j++) {
			System.out.print(j);
		}

		System.out.println();

		// 5 Zeilen ausgeben
		for (int i = 0; i < n; i++) {

			System.out.print(i + " ");

			// Abstand
			for (int k = 0; k < n - i; k++) {
				System.out.print(' ');
			}

			// n2 Spalten ausgeben
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print('*');
			}

			// nächste Zeile
			System.out.println();
		}

	}

	private static void parallelogram(int n) {

		// Kopfzeile (Spalten)

		System.out.print(" " + " ");

		for (int j = 0; j < n; j++) {
			System.out.print(j);
		}

		System.out.println();

		// 5 Zeilen ausgeben
		for (int i = 0; i < n; i++) {

			System.out.print(i + " ");

			// Abstand
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}

			// 5 Spalten ausgeben
			for (int j = 0; j < n; j++) {
				System.out.print('*');
			}

			// nächste Zeile
			System.out.println();
		}

	}

	public static void square(int n) {

		// Kopfzeile (Spalten)

		System.out.print(" " + " ");

		for (int j = 0; j < n; j++) {
			System.out.print(j);
		}

		System.out.println();

		// 5 Zeilen ausgeben
		for (int i = 0; i < n; i++) {

			System.out.print(i + " ");

			// 5 Spalten ausgeben
			for (int j = 0; j < n; j++) {
				System.out.print('*');
			}

			// nächste Zeile
			System.out.println();
		}

	}

	public static void halfTriangle(int n, boolean aufDemKopf) {

		// Kopfzeile (Spalten)

		System.out.print(" " + " ");

		for (int j = 0; j < n; j++) {
			System.out.print(j);
		}

		System.out.println();

		// 5 Zeilen ausgeben
		int a, c;

		if (aufDemKopf) {
			a = n;
			c = -1;
		} else {
			a = 0;
			c = 1;
		}

		for (int i = a; ; i = i + c) {
			// Abruchbedingung
			if (aufDemKopf) {
				if (!(i >= 0)) {
					break;
				}
			} else {
				if (!(i < n)) {
					break;
				}
			}
			

			System.out.print(i + " ");

			// 5 Spalten ausgeben
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}

			// nächste Zeile
			System.out.println();
		}

	}

}
