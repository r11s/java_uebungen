package u4_1;

public class Main {
	
	static long zaehler = 0;

	public static void main(String[] args) {
		
		// Summe 1 bis n
		
		System.out.println("n          summe");
		
		//for( int j = 0; j < 31; j++) {
		int j = 5;
			
			System.out.print(j);
			System.out.print("    ");
			System.out.println(summe(j));
			
		//}
			
			zaehlen(7);
		
		

	}

	// Rekursive Funktion
	
	static long summe(long i) {
				
		// Verankerung, Abbruchkriterium
		// summe 1
		
		if( i == 1) {
			return 1;
		}
		
		// Rekursion
		// summe(n) = i + summe(n-1)
		// 1 2 3 4 5 6 7
		
		
		
		return i + summe(i - 1);
		
	}
	
/*
 		5 + summe(4)
 		5 + ( 4 + summe(3) )
 		5 + ( 4 + ( 3 + summe(2))
 		5 + ( 4 + ( 3 + ( 2 + summe(1)) = 5 + 4 + 3 + 2 + 1
 		
 */

	static long zaehlen(long i) {
		
		System.out.print(i + " ");
		
		// Verankerung, Abbruchkriterium
		if( i == 1) {
			System.out.println();
			return 1;
		}
		
		// Rekursion
		return zaehlen(i - 1);
		
	}


}

