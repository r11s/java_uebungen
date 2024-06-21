
public class A6_1 {

	public static void main(String[] args) {
		
		int[][] tabelle = new int[10][10];
		
		tabelleFuellen(tabelle);
		
		printTabelle(tabelle);

	}

	private static void tabelleFuellen(int[][] tabelle) {
		
		int zeilen = tabelle.length;
		int spalten = tabelle[0].length;
		
		
		// Tabelle
		for(int i = 0; i < zeilen; i++) {
			
			for(int j = 0; j < spalten; j++) {
				tabelle[i][j] = (i + 1) * (j + 1);
			}
			System.out.println();
		}
		System.out.println();

		
		
	}

	private static void printTabelle(int[][] tabelle) {
		
		int zeilen = tabelle.length;
		int spalten = tabelle[0].length;
		
		// System.out.println(zeilen);
		// System.out.println(spalten);
		
		// Kopfzeilen
		System.out.print("*| ");
		for(int j = 1; j <= spalten; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		System.out.print("-  ");
		for(int j = 0; j < spalten; j++) {
			System.out.print("- ");
		}
		System.out.println();
		
		// Tabelle
		for(int i = 0; i < zeilen; i++) {
			System.out.print((i + 1) + "| ");
			
			for(int j = 0; j < spalten; j++) {
				System.out.print(tabelle[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
