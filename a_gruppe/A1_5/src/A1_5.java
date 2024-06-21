
/*
Aufgabe 1.5

Ein Steuerbeamter muss aus den jährlichen Einkommen aller Bürger die fälligen Steuern berechnen.

Zurzeit gelten folgende Steuersätze:

• Einkommen kleiner als 15000: keine Steuerpflicht.
• Einkommen grösser oder gleich 15000, aber kleiner als 40000: 3% Steuern
• Einkommen grösser oder gleich 40000, aber kleiner als 100000: 7% Steuern
• Einkommen grösser oder gleich 100000: 13% Steuern

Die Ausgabe soll wie folgt aussehen (am Beispiel eines Einkommens von 65000):

Einkommen: 65000 Steuersatz: 7% fällige Steuern: 4550

Hinweise:
• Da Sie bisher nur ganze Zahlen kennen, ergibt die Rechnung nur ein ganzzahliges Resultat, ist 
  also etwas ungenau.
• Negative Einkommen sollen mit einer Fehlermeldung quittiert werden 
  ("Negative Einkommen nicht erlaubt").
• Versuchen Sie auch bei dieser Aufgabe, möglichst wenige if-Anweisungen zu benutzen. Zusatzaufgabe:
• Spielt es eine Rolle, in welcher Reihenfolge Sie die drei für die Prozentrechnung nötigen 
  Zahlen (Einkommen, Steuersatz, 100) miteinander verrechnen? Begründen Sie Ihre Antwort.

 */
public class A1_5 {

	public static void main(String[] args) {

		int einkommen = 15000;

		if (einkommen < 0) {
			System.out.println("Negative Einkommen nicht erlaubt.");
			return; // return verlässt die Methode sofort, anstelle des else
		} // else {

		int steuersatz; // in Prozent

		if (einkommen < 15000) {
			steuersatz = 0;
		} else if (einkommen < 40000) {
			steuersatz = 3;
		} else if (einkommen < 100000) {
			steuersatz = 7;
		} else {
			steuersatz = 13;
		}
		
		
		System.out.print("Einkommen: " + einkommen + " Steuersatz: " 
		+ steuersatz + "% fällige Steuern: " + (einkommen * steuersatz / 100) );

		// }

	}

}
