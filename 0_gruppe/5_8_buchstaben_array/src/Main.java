import java.util.Random;

public class Main {
	
	
	static Random R = new Random();

	public static void main(String[] args) {
		
		int n = 100;
		
		char [] buchstaben = new char[n];
		int [] haeufigkeit = new int[26];
		
		for (int i = 0; i < n; i++) {
			char ch = zufallsBuchstabe();
			//System.out.printf("%c ", ch );
			buchstaben[i] = ch;
		}
		
		for (int i = 0; i < n; i++) {
			// System.out.printf("%c ", buchstaben[i] );
		}
		
		// Haeufigkeit rechnen
		for (int i = 0; i < n; i++) {
			haeufigkeit[buchstaben[i] - 'A']++;
		}
		
		System.out.println();
		
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c = %3d %2.2f %% %n", (char)(i + 'A'), haeufigkeit[i], (100.0 * haeufigkeit[i] / n));
		}
		

	}
	
	static char zufallsBuchstabe() {
		
		char ch;
		
		// Beide Zeilen gleichwertig
		ch = (char)(Math.floor((Math.random() * 26)) + (int)'A');
		// ch = (char) ( R.nextInt(26) + 'A');

		return ch;
	}

}
