package a11_2_vararg_anders;


public class VarArgAnders {

	public static void main(String[] args) {


		int[] p = {12};
		
		demoZahlen(p); // 1 Argument

		int[] p2 = {2, 34, 5, 6,8};
		
		demoZahlen(p2); // 3 Argumente

		
	}

	static void demoZahlen(int[] a) { // Methode mit einer varaiable Anzahl von Argumenten

		System.out.println("Anzahl Argumente: " + a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("-----------------------------");

		
	}

}
