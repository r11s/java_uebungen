import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Zufallszahl
		Random R = new Random();

		// Dreiecksmatrix

		int m = 5; // Anzahl Zeilen

		// irregulaeres Array
		int[][] a = new int[m][]; // Zeilen

		for (int i = 0; i < m; i++) { // Zeilen

			// Spalten
			a[i] = new int[m - i]; // 5, 4, 3, 2, 1

			for (int j = 0; j < a[i].length; j++) { // Spalten

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


		// irregulaeres Array ausgeben
		for (int i = 0; i < a.length; i++) { // Zeilen
			
			//System.out.printf("%d: ", i);
			for(int k = 0; k < i; k++) {
				System.out.printf(" 0 ");
			}

			// Spalten
			for (int j = 0; j < a[i].length; j++) { // Spalten

				System.out.printf("%2d ", a[i][j]);

			}

			System.out.println();
		}

	}

}
