import java.util.Arrays;
import java.util.Scanner;

public class U1_1e {

	static final Scanner eingabe = new Scanner(System.in);

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void println(Object o) {
		System.out.println(o);
	}

	public static void println() {
		System.out.println();
	}

	public static void main(String[] args) {

		int n = anzahlEinlesen();

		println("Anzahl ist " + n);

		// 3 Double-Werte von der Tastatur einlesen
		double[] zahlenListe = werteEinlesen(n);
		printArray(zahlenListe);

		// Sortieren
		double[] sortierteListe = zahlenListe.clone();
		Arrays.sort(sortierteListe);
		printArray(sortierteListe);
		
		
		int[] intListe;
		
		intListe = doubleArrayToInt(sortierteListe);
		printArray(intListe);

	}

	static int[] doubleArrayToInt(double[] sortierteListe) {
		
		int[] a = new int[sortierteListe.length];
		
		for (int i = 0; i < sortierteListe.length; i++) {
			a[i] = (int) sortierteListe[i]; // cast to int (Datentyp umwandeln = cast)
		}
		
		return a;
	}

	static double[] werteEinlesen(int n) {

		double[] zahlenliste = new double[n];

		for (int i = 0; i < zahlenliste.length; i++) {
			print("Bitte den Wert[" + i + "] eingebn: ");
			zahlenliste[i] = eingabe.nextDouble();
		}

		return zahlenliste;
	}

	static void printArray(double[] a) {

		println(Arrays.toString(a));
				
		/* Lange Form von println(Arrays.toString(a));
		print("[");
		for (int i = 0; i < a.length; i++) {
			if( i > 0) {
				print(",");
			}
			print(a[i]);
		}
		print("]");
		println();
		*/
	}


	/**
	 * Ueberschreiben von printArray(double[] a)
	 * @param a
	 */
	static void printArray(int[] a) {
		println(Arrays.toString(a));
	}

	static int anzahlEinlesen() {
		int i;

		print("Wieviele Zahlen: ");
		i = eingabe.nextInt();

		return i;
	}

}

