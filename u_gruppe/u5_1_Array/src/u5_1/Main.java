package u5_1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		int [] array = { 2, 3, 5, -29, -7, 11, 13, 17, 19, -23, 42}; 
		
		
		String s;
		
		// Array ausgeben
		s = Arrays.toString(array);
		
		System.out.println(s);
		
		
		s = arrayToString(array);
		
		System.out.println(s);
		
		
		// Array summieren
		
		int summe = summeArray(array);
		
		System.out.println("Summe " + s + " = " + summe);

		System.out.println("Summe " + s + " = " + Arrays.stream(array).sum());	
		
		
		// negative Zahlen im Array
		
		System.out.println("Es hat " + negativeImArray(array) + " negative Zahlen im Array " + s);
		
		// gerade Zahlen im Array
		
		System.out.println("Es hat " + geradeImArray(array) + " gerade Zahlen im Array " + s);
		
	}
	
	static int geradeImArray(int [] a) {
		
		int anzahl = 0;
		
		// for Loop
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				anzahl++;
			}
		}
		
		// foreach loop
		/*
		for(int x : a) {
			if(x % 2 == 0) {
				anzahl++;
			}
			// System.out.println(x);
		}
		*/
		
		return anzahl;
	}

	static int negativeImArray(int [] a) {
		
		int anzahl = 0;
		
		// for Loop
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				anzahl++;
			}
		}
		
		// foreach loop
		/*
		for(int x : a) {
			if(x < 0) {
				anzahl++;
			}
			// System.out.println(x);
		}
		*/
		
		return anzahl;
	}
	

	static int summeArray(int [] a) {
		
		int summe = 0;
		
		for(int i = 0; i < a.length; i++) {
			summe += a[i];
		}
		
		return summe;
	}
	
	
	static String arrayToString(int [] a) {
		
		String s = "";
		
		// s = "[";  // Variante 1
		
		for(int i = 0; i < a.length; i++) {
			// s += a[i] + ", "; // Variante 1
			s += a[i] + " ";  // Variante 2
		}
		
//		s = s.substring(0, s.length() - 2); // Variante 1
		s = s.substring(0, s.length() - 1); // Variante 2
		
		// s += "]"; // Variante 1
		
		return s;
		
	}
	
	
	

}
