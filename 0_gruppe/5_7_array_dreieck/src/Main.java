import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Zufallszahl
		Random R = new Random();

		// Dreiecksmatrix

		int m = 5; // Anzahl Zeilen
		/*
		 * 
		 * [ [0,0] ]
		 * 
		 * [ [1,0], [1, 1] ]
		 * 
		 * [ [2,0], [2, 1], [2, 2] ]
		 * 
		 * [ [3,0], [3, 1], [3, 2], [3, 3] ]
		 * 
		 * [ [4,0], [4, 1], [4, 2], [4, 3], [4, 4] ]
		 * 
		 */

		// irregulaeres Array
		int[][] a = new int[m][]; // Zeilen

		for (int i = 0; i < m; i++) { // Zeilen

			// Spalten
			a[i] = new int[i + 1];

			for (int j = 0; j <= i; j++) { // Spalten

				System.out.printf(" %d,%d ", i, j);

				a[i][j] = R.nextInt(99);
			}

			System.out.println();
		}

		// irregulaeres Array ausgeben
		for (int i = 0; i < a.length; i++) { // Zeilen

			// Spalten
			for (int j = 0; j < a[i].length; j++) { // Spalten

				System.out.printf("[%d,%d] = %d ", i, j, a[i][j]);

			}

			System.out.println();
		}

		// irregulaeres Array ausgeben
		for (int i = 0; i < a.length; i++) { // Zeilen

			// Spalten
			for (int j = 0; j < a[i].length; j++) { // Spalten

				System.out.printf("%d ", a[i][j]);

			}

			System.out.println();
		}

	}

}
