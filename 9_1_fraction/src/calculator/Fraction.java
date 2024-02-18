package calculator;

public class Fraction {
	
	private static int id = 0;
	
	private int zaehler = 0;
	private int nenner = 1;

	public Fraction() {
		Fraction.id++;
	}

	public Fraction(int zaehler, int nenner) {
		
		this();
		
		this.zaehler = zaehler;
		this.nenner = nenner;

		kuerzen();
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	public Fraction(Fraction f) {
		this();
		this.zaehler = f.zaehler;
		this.nenner = f.nenner;
	}

	private static int ggt(int a, int b) {
		int h;

		if (a == 0)
			return Math.abs(b);
		if (b == 0)
			return Math.abs(a);

		do {
			h = a % b;
			a = b;
			b = h;
		} while (b != 0);

		return Math.abs(a);
	}

	private void kuerzen() {
		// kuerzen heisst Zaehler und Nenner durch deren ggt teilen.
		int teiler = ggt(zaehler, nenner);

		zaehler /= teiler;
		nenner /= teiler;
	}

	public static Fraction add(Fraction a, Fraction b) {
		/*
		 * x z x * w + z * y --- + --- = -------------- y w y * w
		 */
		Fraction c = new Fraction();

		c.zaehler = a.zaehler * b.nenner + b.zaehler * a.nenner;
		c.nenner = a.nenner * b.nenner;
		c.kuerzen();

		return c;
	}

	public static Fraction subtract(Fraction a, Fraction b) {
		/*
		 * x z x * w - z * y --- - --- = -------------- y w y * w
		 */
		Fraction c = new Fraction();

		c.zaehler = a.zaehler * b.nenner - b.zaehler * a.nenner;
		c.nenner = a.nenner * b.nenner;
		c.kuerzen();

		return c;
	}

	public static Fraction multiply(Fraction a, Fraction b) {

		Fraction c = new Fraction();

		c.zaehler = a.zaehler * b.zaehler;
		c.nenner = a.nenner * b.nenner;
		c.kuerzen();

		return c;
	}

	public static Fraction divide(Fraction a, Fraction b) {

		Fraction c = new Fraction();

		c.zaehler = a.zaehler * b.nenner;
		c.nenner = a.nenner * b.zaehler;
		c.kuerzen();

		// System.out.println("Fehler: Division durch 0.");
		if (c.nenner == 0) {
			throw new ArithmeticException("/ by zero");

		}

		return c;
	}

	@Override
	public String toString() {

		return String.format("%d: %d / %d", id, zaehler, nenner);
	}
	
	public String show() {

		return String.format("%d: %d / %d", id, zaehler, nenner);
	}
}
