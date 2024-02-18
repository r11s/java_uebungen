
public class Garage {
	
	static private int nr = 0;

	private int kapazitaet = -99;
	private int belegung = 0;
	

	// Standardkonstruktor
	public Garage() { // Signatur Garage()
		Garage.nr++;		
		kapazitaet = 0;
		System.out.println("(): " + this);
	}

	// Konstruktor mit Kapazitaet
	// wird beim erzeugen des Objekts ausgefuehrt
	public Garage(int kapazitaet) { // Signatur Garage(int)
		this(); // Standardkostruktor aufrufen
		
		this.kapazitaet = kapazitaet; // this ist eine Refrenz auf das eigene Objekt
		System.out.println(this);
	}

	// Ein weiterer Konstruktor
//	public Garage(int a, int b) { // Signator Garage(int, int)
//
//	}
	
	// Kopierkonstruktor
	// Properties müssen vom existierenden Objekt kopiert werden.
	public Garage(Garage g){
		System.out.println("Kopie");
		kapazitaet = g.kapazitaet;
	}
	
	// Getter Methoden
	public int getKapazitaet() {
		return kapazitaet;
	}

	public int getBelegung() {
		return belegung;
	}
	
	
	public void driveIn() {
		
		if(belegung == kapazitaet) {
			throw new RuntimeException("Operation wegen aktueller Belegung nicht möglich!");
		}
			
		
		belegung++;
		
		System.out.println(this);
	}
	
	public void driveOut() {
		
		if(belegung == 0) {
			throw new RuntimeException("Operation wegen aktueller Belegung nicht möglich!");
		}
		
		belegung--;
		System.out.println(this);

		
	}

	@Override
	public String toString() {
		
		String s;
		
		// s = super.toString() + ": ";
		s = "Garage: " + Garage.nr + ": ";
		s += "Kapazitaet: " + kapazitaet + ", ";
		s += "Belegung: " + belegung + ", ";
		
		return s;
	}
	
	public static int getNumber() {
		return nr;
	}

}
