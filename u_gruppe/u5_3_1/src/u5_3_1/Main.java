package u5_3_1;

public class Main {

	public static void main(String[] args) {

		int[] a = null;

		int n = 100;

		// Simulation der Array Elementerfassung
		// Es sollen nur ca. 20% der Zahlen erfasst werden.
		for (int i = 0; i < n; i++) {

			// Zahl zwischen 0 und 1000 erzeugen anstelle Terminal.eingabe()
			int z = (int) Math.floor(Math.random() * 1000);

			// nur ca. 33% werden erfasst
			if (Math.random() < 0.333) { // Math.random() gibt eine Zahle zwischen 0 und 0.999 zurück
				
				int[] b = arrayVergroessern(a); // Array um 1 vergroessern

				// [1, 2, 3, ...] Array
				// 0 1 2 ... Indices

				a = arrayCopy(a, b); // a nach b kopieren und in a schreiben; a erhält neue Referenz
				
				a[a.length - 1] = z; // generierte Zahl z an der letzten Position a (neues a) einfuegen.

			}
		}
		
		if(a == null) {
			System.out.println("array mit Laenge 0");
			return;
		}

		System.out.println("Es wurden " + a.length + " Zahlen generiert.");
		printArray(a);
		
		System.out.println("\nGroesste Zahl an erster Stelle.");
		groessteZuerst(a);
		printArray(a);
		

	}
	
	static void groessteZuerst(int [] x) {
		
		int max = x[0]; // angenommene groesste Zahl an Position 0
		int position = 0; // position im Array
				
		// groesste Zahl suchen
		for (int i = 1; i < x.length; i++) {
			if ( max < x[i]) {
				position = i;
				max = x[position];
			}
		}
		
		// groesste Zahl an erste Position schreiben
		if( position != 0) {
			int t = x[0]; // erste Position zwischenspeichern
			x[0] = max;
			x[position] = t;
		}
	}
	

	static int[] arrayCopy(int[] x, int[] y) {

		if (x != null) {
			for (int i = 0; i < x.length; i++) {
				y[i] = x[i];
			}
		}

		return y;
	}

	static int[] arrayVergroessern(int[] x) {

		if (x == null) { // Array existiert noch nicht

			System.out.println("null");
			x = new int[1];

		} else { // array wird um 1 verlängert
			x = new int[x.length + 1];
		}

		return x;
	}

	public static void printArray(int[] x) {

		for (int i = 0; i < x.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(x[i] + " ");

		}

		System.out.println();
	}

	public static void printArray(double[] x) {

		for (int i = 0; i < x.length; i++) {
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.print(x[i] + " ");

		}

		System.out.println();
	}
}
