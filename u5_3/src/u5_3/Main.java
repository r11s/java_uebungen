package u5_3;

public class Main {

	public static void main(String[] args) {

		// Simulation der Eingabe einer Zahl
		// Zahl wischen 2 und 10 erzeugen
		int n = (int) Math.floor(Math.random() * 10) + 2;

		System.out.println(n);
		
		// Es soll ein Array mit 16 Elementen erstellt werden

		double[] a = new double[n];

		// Simulation der Array Elementerfassung
		for (int i = 0; i < n; i++) {
			a[i] = Math.random();
		}
		
		printArray(a);

	}

	public static void printArray(double[] x) {

		for (int i = 0; i < x.length; i++) {
			if( i % 5 == 0) {
				System.out.println();
			}
			System.out.print(x[i] + " ");
			
		}

		System.out.println();
	}
}
