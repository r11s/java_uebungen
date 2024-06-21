

/*
 * Aufgabe 1.2
 * 
 * Schreiben Sie ein Programm, das es Ihnen erlaubt, eine Zahl über die 
 * Tastatur einzulesen. Anschliessend soll es anzeigen, ob die Zahl negativ 
 * ist oder nicht. Es wird also entweder der Text "Die Zahl ist negativ" 
 * oder "Die Zahl ist nicht negativ" erwartet.
 * 
 * Wenn Sie eine verbesserte Ausgabe wünschen, können Sie auch die Zahl in 
 * die Ausgabe einbinden. Wenn Sie also –37 eingeben, erscheint der Text 
 * "Die Zahl –37 ist negativ".
 */

public class A1_2 {

	public static void main(String[] args) {
		
		int zahl;		
		
		System.out.print("Zahl eingeben: ");
		zahl = Terminal.readInt();
		
		
		if (zahl < 0) {
			System.out.print("Die Zahl " + zahl + " ist negativ.");
		} else {
			System.out.print("Die Zahl " + zahl + " ist nicht negativ.");
		}

	}

}
