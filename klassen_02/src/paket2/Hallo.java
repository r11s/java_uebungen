package paket2;

public class Hallo {
	
	// Properties
	String hallo = "Hallo";
	String name = "";
	
	
	// Constructors
	public Hallo() {
		name = "Welt!";
	}
	
	public Hallo(String derName) {
		name = derName + "!";
	}
	
	
	// Methods
	public void printHallo() {
		System.out.println(hallo + " " + name);
	}
	
}
