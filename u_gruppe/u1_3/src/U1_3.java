
public class U1_3 {

	public static void main(String[] args) {
		
		
		// Fragencode erstellen
		String[] fragen = {
				"Java is a sequence-dependent programming language",
				"Java is a code dependent programming language",
				"Java is a platform-dependent programming language",
				"Java is a platform-independent programming language"
		};
		
		// Antworten zu den Fragen
		boolean[] antworten = {
				false,
				false,
				false,
				true
		};
		
		// Challenge (Aufgabe)

		// Zaehlervariablen (Hilfsvariablen)
		int zaehler = 0;
		int n = 0;
		
		// Zaehler wird bei true hochgezaehlt (Hilfsidee)
		
		// Fragen stellen
		while(n < fragen.length) {
			n = n + 1;
			
			System.out.println("Frage " + n + ": " + fragen[n - 1]);
			
			System.out.print("Antwort " + n + ": ");
			
			// gestellte Frage auswerten
			
			// TODO: Antwort speichern
			// ....
			
			if (Terminal.readBool() == antworten[n-1]) {
				zaehler++;
			};
			
		}
		
		// Resultat anzeigen
		System.out.println(fragen.length + " Punkte sind 100%");
		System.out.println("Punkte: " + zaehler);
		// TODO: Resultat zu Fragen anzeigen
		

	}

}
