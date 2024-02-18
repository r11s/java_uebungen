package u5_3;

import u55.A;

public class Main {

	public static void main(String[] args) {

		int n = 5; // Anzahl ganze Zahlen im Array

		int[] a = fillArray(n);
		

		printArray(a);

		sortArray(a);
		
		printArray(a);
		
		
		A.a();

	}
	
	public static void printArray(int[] x) {
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
	}
	

	static void sortArray(int[] a) {

		int n = a.length;

		for (int i = 0; i < n; ++i) {

			for (int j = i + 1; j < n; ++j){
//				System.out.println(i + " " + a[i] + " " + a[j]);
				
				if( a[i] > a[j]) { // a[i] und a[j] vertauschen
					int h = a[i];
					a[i] = a[j];
					a[j] = h;
				}
			}
//			String s = arrayToString(a);
//			System.out.println("a: " + s);
//			System.out.println();
		}

	}


	static int[] fillArray(int n) {
		
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {

			// Math.random erzeugt eine double Zahl zwischen 0 und kleiner 1
			// Math.random erzeugt eine double Zahlen zwischen 0 und kleiner 1000;
			// a[i] = (int) Math.floor(Math.random() * 1000);

			// Würfeln zwischen 1 und 6
			a[i] = (int) Math.floor(Math.random() * 100);

		}

		return a;
	}

	static int geradeImArray(int[] a) {

		int anzahl = 0;

		// for Loop
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				anzahl++;
			}
		}

		// foreach loop
		/*
		 * for(int x : a) { if(x % 2 == 0) { anzahl++; } // System.out.println(x); }
		 */

		return anzahl;
	}

	static int negativeImArray(int[] a) {

		int anzahl = 0;

		// for Loop
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				anzahl++;
			}
		}

		// foreach loop
		/*
		 * for(int x : a) { if(x < 0) { anzahl++; } // System.out.println(x); }
		 */

		return anzahl;
	}

	static int summeArray(int[] a) {

		int summe = 0;

		for (int i = 0; i < a.length; i++) {
			summe += a[i];
		}

		return summe;
	}

	static String arrayToString(int[] a) {

		String s = "";

		for (int i = 0; i < a.length; i++) {
			s += a[i] + " ";
		}

		s = s.substring(0, s.length() - 1);

		return s;

	}

	static String arrayToStringVarianten(int[] a) {

		String s = "";

		// s = "["; // Variante 1

		for (int i = 0; i < a.length; i++) {
			// s += a[i] + ", "; // Variante 1
			s += a[i] + " "; // Variante 2
		}

//		s = s.substring(0, s.length() - 2); // Variante 1
		s = s.substring(0, s.length() - 1); // Variante 2

		// s += "]"; // Variante 1

		return s;

	}

}


