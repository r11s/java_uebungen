
public class A1_1 {

	public static void main(String[] args) {
		
		int zahl1;
		int zahl2;
		
		
		System.out.print("Zahl 1 eingeben: ");
		zahl1 = Terminal.readInt();
		
		System.out.print("Zahl 2 eingeben: ");
		zahl2 = Terminal.readInt();
		
		// System.out.println("Zahl 1: " + zahl1);
		// System.out.println("Zahl 2: " + zahl2);
		
		
		System.out.println("Summe     : " + (zahl1 + zahl2));
		System.out.println("Differenz : " + (zahl1 - zahl2));
		System.out.println("Produkt   : " + (zahl1 * zahl2));
		System.out.println("Quotient  : " + (zahl1 / zahl2));
		System.out.println("Rest      : " + (zahl1 % zahl2));
		
		int summe = zahl1 + zahl2;
		int differenz = zahl1 - zahl2;
		int produkt = zahl1 * zahl2;
		int quotient = zahl1 / zahl2;
		int rest = zahl1 % zahl2;
		
		System.out.println("Summe     : " + summe);
		System.out.println("Differenz : " + differenz);
		System.out.println("Produkt   : " + produkt);
		System.out.println("Quotient  : " + quotient);
		System.out.println("Rest      : " + rest);
		
		
	}

}
