
public class DemoRef {

	public static void main(String[] args) {

		int i = 8; // primitiver Datentyp

		String s = "Hallo"; // spezieller Referenz-Datentyp

		String[] monate = new String[12]; // Array Objekt erstellen; Referenz-Datentyp

		monate[0] = "Januar";
		monate[1] = "Februar";
		// usw.
		monate[11] = "Dezember";

		System.out.println(monate);

		System.out.println(i);

		System.out.println(s);

		
		
		int[] lottozahlen = { 12, 45, 3, 7, 5, 38, 41 };

		// lottozahlen[0] = 12;
		// usw.
		
		
		
		int[] lottozahlen2 = lottozahlen;
		
		
		for(int k = 0; k < lottozahlen.length; k++) {
			System.out.print(lottozahlen[k] + " ");
		}
		System.out.println();
		
		for(int k = 0; k < lottozahlen2.length; k++) {
			System.out.print(lottozahlen2[k] + " ");
		}
		System.out.println();
		
		lottozahlen[2] = 999;
		

		for(int k = 0; k < lottozahlen.length; k++) {
			System.out.print(lottozahlen[k] + " ");
		}
		System.out.println();
		
		for(int k = 0; k < lottozahlen2.length; k++) {
			System.out.print(lottozahlen2[k] + " ");
		}
		System.out.println();
		
		
		int[] lottozahlen3 = new int[lottozahlen.length];
		
		for(int k = 0; k < lottozahlen3.length; k++) {
			System.out.print(lottozahlen3[k] + " ");
		}
		System.out.println();
		
		
		for(int k = 0; k < lottozahlen.length; k++) {
			lottozahlen3[k] = lottozahlen[k];
		}
		
		for(int k = 0; k < lottozahlen3.length; k++) {
			System.out.print(lottozahlen3[k] + " ");
		}
		System.out.println();
		
		lottozahlen[2] = 3;
		
		for(int k = 0; k < lottozahlen.length; k++) {
			System.out.print(lottozahlen[k] + " ");
		}
		System.out.println();
		
		for(int k = 0; k < lottozahlen3.length; k++) {
			System.out.print(lottozahlen3[k] + " ");
		}
		System.out.println();
		
		System.out.println(lottozahlen);
		System.out.println(lottozahlen2);
		System.out.println(lottozahlen3);
		
		
		int[] leer = null;
		
		System.out.println(leer);
		
		leer = lottozahlen3;
		
		System.out.println(leer);
		
		lottozahlen3 = lottozahlen;
		
		System.out.println(lottozahlen);
		System.out.println(lottozahlen2);
		System.out.println(lottozahlen3);
		
		
	}

}
