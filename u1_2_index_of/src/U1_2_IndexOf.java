
public class U1_2_IndexOf {

	public static void main(String[] args) {

		String r = "a";

		int antwort = "jJtT1".indexOf(r);
		//             01234
		System.out.println(r);
		System.out.println(antwort); // r = "a"
		System.out.println(antwort >= 0);

		r = "j";
		antwort = "jJtTja1".indexOf(r);
		//         01234
		System.out.println(r);
		System.out.println(antwort); // r = "j"
		System.out.println(antwort >= 0);

		r = "J";
		antwort = "jJtTja1".indexOf(r);
		//         01234
		System.out.println(r);
		System.out.println(antwort); // r = 'J'
		boolean b = antwort >= 0;
		System.out.println(b);

		r = "ja";
		antwort = "jJtTja1".indexOf(r);
		//         0123456
		System.out.println(r);
		System.out.println(antwort); // r = "ja"
		System.out.println(antwort >= 0);
		
		
		// Umfrage anders Multiple Choice
		System.out.println("Ist der Himmel blau?");
		
		System.out.println("(1) Ja");
		System.out.println("(2) Vielleicht");
		System.out.println("(3) Nein, rot");
		System.out.println("(4) Nein");
		
		System.out.print("Ihre Anwort: ");
		// int x = Terminal.readInt();
		r = Terminal.readString();
		
		// b = x == 4;
		
		b = r.equals("4"); // String vergleichen: equals vergleicht Inhalt; == vergleicht Objekt
		
		if(b) {
			System.out.println("korrekt");
		} else {
			System.out.println("falsch");
		}
		

	}

}




