package a11_1_vararg;


public class VarArgDemo {

	static int x = 0;
	static int y = 0;

	public static void main(String[] args) {

		demoZahlen(12); // 1 Argument

		demoZahlen(12, 34, 5, x); // 3 Argumente

		VarArgDemo.demoZahlen(107, 42, x, y); // 2 Argumente

		demoZahlen(); // 0 Argumente

		drucke("Es ist ", 3, " Uhr.");

		print(",", 12, 'Z', 34, "Hallo Welt!");

		print(":", 1, 2, 3);

		showAllYouWant("\nHallo", 7, 'x', 5, "=", 35);

		System.out.println(summe(1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println(produkt(1, 2, 3, 4, 5, 6, 7, 8, 9));
		

		int[] intArray = gibMirArray(1, 11, 23, 98, 5, 3);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		intArray = gibMirArray(1, 2);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	static int[] gibMirArray(int... a) {
		return a;
	}

	static void demoZahlen(int... a) { // Methode mit einer varaiable Anzahl von Argumenten

		System.out.println("Anzahl Argumente: " + a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("-----------------------------");

		x = 3 * 4 + 1;
	}

	static void drucke(Object... o) {

		for (Object e : o) {
			System.out.print(e);
		}

		System.out.println();
	}

	static void print(String sep, Object... o) {

		System.out.print("              >");

		for (Object e : o) {
			System.out.print(e + sep);
		}

	}

	static void showAllYouWant(Object... o) {

		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}

	}

	static int summe(int... i) {

		int h = 0;

		for (int x : i) {
			h += x;
		}

		return h;
	}

	static int produkt(int... i) {

		int h = 1;

		for (int x : i) {
			h *= x;
		}

		return h;
	}
}
