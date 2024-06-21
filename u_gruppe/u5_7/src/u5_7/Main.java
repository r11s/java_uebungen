package u5_7;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[][] a; // Matrix i x j
		int[][] b;
		int[][] r;

		int zeilen = 3;
		int spalten = 3;

		a = new int[zeilen][spalten]; // Matrix als 2-dimensionales Array
		b = new int[zeilen][spalten]; // Matrix als 2-dimensionales Array
		r = new int[zeilen][spalten];

		// zufallsmatrix erstellen
		matrixErstellen(a);
		matrixErstellen(b);
		
		addiereMatrix(a, b, r);
		
		
		printMatrix(a);
		
		System.out.println();
		printMatrix(b);
		
		System.out.println();
		printMatrix(r);
		
//		istInvertierbar(a);
//		determinate(a);
//		betrag(a);
//		invertiere(a);
		
		
//		subtrahiere(a, b);
//		multipliziere(a, b);
		

	}

	static void matrixErstellen(int m [][]) {
		
		Random rnd = new Random();
		// z.B.: int z = rnd.nextInt(100);
		
		int zeilen = m.length;
		int spalten = m[0].length;
		
		// Zeilen
		for (int i = 0; i < zeilen; i++) {
			
			// Spalten
			for (int j = 0; j < spalten; j++) {
				
				m[i][j] = rnd.nextInt(100);
				
			}
			
		}
	}

	static void printMatrix(int m [][]) {

		
		int zeilen = m.length;
		int spalten = m[0].length;
		
		// Zeilen
		for (int i = 0; i < zeilen; i++) {
			
			// Spalten
			for (int j = 0; j < spalten; j++) {
				
				System.out.printf("%2d ", m[i][j]);
				
			}
			
			System.out.println();
			
		}
	}


	static void addiereMatrix(int x[][],int y[][], int [][] z) {

		
		int zeilen = x.length;
		int spalten = x[0].length;
		
		// Zeilen
		for (int i = 0; i < zeilen; i++) {
			
			// Spalten
			for (int j = 0; j < spalten; j++) {
				
				z[i][j] = x[i][j] + y[i][j];
				
			}
			
		}
	}

}
