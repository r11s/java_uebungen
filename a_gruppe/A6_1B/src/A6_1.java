
public class A6_1 {

	public static void main(String[] args) {

		double y = Math.pow(2, 3); // 2 hoch 3 ist 8
		System.out.println(y);

		int[][] tabelle = new int[10][10];

		tabelleFuellen(tabelle);

		printTabelle(tabelle);

	}

	private static void tabelleFuellen(int[][] tabelle) {

		int zeilen = tabelle.length;
		int spalten = tabelle[0].length;

		// Tabelle
		for (int i = 0; i < zeilen; i++) {

			for (int j = 0; j < spalten; j++) {
				tabelle[i][j] = (i + 1) * (j + 1);
			}
		}

	}

	private static void printTabelle(int[][] tabelle) {

		int zeilen = tabelle.length;
		int spalten = tabelle[0].length;

		// System.out.println(zeilen);
		// System.out.println(spalten);

		// Kopfzeilen
		System.out.printf("%8s", "* |");
		for (int j = 1; j <= spalten; j++) {
			System.out.printf("%8d", j);
		}
		System.out.println();

		for (int j = 0; j <= spalten; j++) {
			System.out.printf("%8s", "-----");
		}
		System.out.println();

		// Tabelle
		String s = "";
		
		for (int i = 0; i < zeilen; i++) {
			s += String.format("%8d", (i + 1));

			
			for (int j = 0; j < spalten; j++) {
				s += String.format("%8d", tabelle[i][j]);
				//s += String.format("%n");
			}
			s += String.format("%n");
		}
		s += String.format("%n");
		
		System.out.print(s);
		System.out.println("**********************************");
		System.out.print(s);

	}

}
