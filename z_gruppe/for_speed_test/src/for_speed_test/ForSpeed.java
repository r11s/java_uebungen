package for_speed_test;

public class ForSpeed {

	public static void main(String[] args) {

		long n = 1_000_000;
		
		int anzahl = 100;

		int summe2 = zeitPlusPLusI(n, anzahl);
		int summe1 = zeitIPlusPLus(n, anzahl);
		
		System.out.println("Summe i++: " + summe1);
		System.out.println("Summe ++i: " + summe2);


	}

	private static int zeitIPlusPLus(long n, int anzahl) {

		long start = System.currentTimeMillis();

		int summe = 0;
		
		long a = 12;

		for (int k = 0; k < anzahl; k++) {

			for (long i = 0; i < n; i++) {
				a = 2 * a;
			}

			long ende = System.currentTimeMillis();

			// System.out.println(start);
			// System.out.println(ende);

			long zeit = ende - start; // benötigte Zeit

			System.out.print("i++: ");
			System.out.println(zeit);

			summe += zeit;

		}

		return summe;
	}

	private static int zeitPlusPLusI(long n, int anzahl) {

		long start = System.currentTimeMillis();

		int summe = 0;
		
		long a = 12;

		for (int k = 0; k < anzahl; k++) {

			for (long i = 0; i < n; ++i) {
				a = 2 * a;
			}

			long ende = System.currentTimeMillis();

			// System.out.println(start);
			// System.out.println(ende);

			long zeit = ende - start; // benötigte Zeit

			System.out.print("++i: ");
			System.out.println(zeit);

			summe += zeit;

		}

		return summe;
	}
	
	/*
		int i = 9;
		int a = 2;
		
		// a = ++i;
		i = i + 1;  // i = 10
		a = i;		// a = 10
		
		
		i = 9;
		a = 2;
		
		// a = i++;
		a = i;		//  a = 9
		i = i + 1;	//  i = 10
		
		
	*/

}







