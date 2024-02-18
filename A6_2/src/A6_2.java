
public class A6_2 {

	public static void main(String[] args) {

		int[][][] v3dArray = new int[17][5][9];

		tabelleFuellen(v3dArray);

		printTabelle(v3dArray);
		
		int[] p = new int[3];
		
		p = getDimensions(v3dArray);
		
		System.out.println("dimX = " + p[0]);
		System.out.println("dimY = " + p[1]);
		System.out.println("dimZ = " + p[2]);
		
	}

	private static int[] getDimensions(int[][][] v3dArray) {
		
		int[] xyz = new int[3];
		
		xyz[0] = v3dArray.length;
		xyz[1] = v3dArray[0].length;
		xyz[2] = v3dArray[0][0].length;
		
		return xyz;
	}

	private static void tabelleFuellen(int[][][] tabelle) {

		int dimX = tabelle.length;
		int dimY = tabelle[0].length;
		int dimZ = tabelle[0][0].length;

		// Tabelle
		for (int i = 0; i < dimX; i++) {

			for (int j = 0; j < dimY; j++) {
				for (int k = 0; k < dimZ; k++) {
					tabelle[i][j][k] = i * 100 + j * 10 + k;
				}
			}
		}


	}

	private static void printTabelle(int[][][] tabelle) {

		int dimX = tabelle.length;
		int dimY = tabelle[0].length;
		int dimZ = tabelle[0][0].length;

		// Tabelle
		for (int i = 0; i < dimX; i++) {

			for (int j = 0; j < dimY; j++) {
				for (int k = 0; k < dimZ; k++) {
					System.out.print(tabelle[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

	}

}
