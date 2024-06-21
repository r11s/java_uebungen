import calculator.Fraction;

public class FractionSimulator {

	public static void main(String[] args) {

		Fraction a = new Fraction();
		System.out.println("a: " + a);

		int zaehler = 7;
		int nenner = 21;

		Fraction b = new Fraction(zaehler, nenner);
		System.out.println("b: " + b);

		Fraction c = new Fraction(b);
		System.out.println("c: " + c);

		Fraction d = Fraction.add(a, b); // Die Methode add veränder a und b wird nicht verändert

		System.out.println("d: " + d);

		Fraction e = Fraction.add(c, b); 
		System.out.println("e: " + e);

		Fraction f = Fraction.subtract(a, e);
		System.out.println("f: " + f);

		Fraction g = new Fraction(5, 23);
		System.out.println("g: " + g);
		System.out.println("c + g: "+ Fraction.add(c, g));

		System.out.println("c * g: "+ Fraction.multiply(c, g));

		
		try {
			System.out.println("c / g: "+ Fraction.divide(c, g));
			
			System.out.println("c / a: "+ Fraction.divide(c, a));
			
		} catch (Exception ex) {
			System.err.println("Fehler: " + ex.getMessage());
		}
		
		Fraction h = new Fraction();
		
		try {
			
			h = Fraction.divide(c, a);
			System.out.println("h: " + h);
		} catch (Exception ex) {
			System.err.println("Fehler: " + ex.getMessage());
		}
		
		
		a = Fraction.subtract(a, e);
		System.out.println("a: " + a);
		
		h = Fraction.add(a, g);
		System.out.println("h: " + h);
		
	}

}
