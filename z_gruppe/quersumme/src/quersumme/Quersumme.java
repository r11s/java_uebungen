package quersumme;

public class Quersumme {
	
	public static void main(String[] args) {
		
		long zahl = 125608L;
		
		long quersumme = 0;
		
		
		// log_10 1 = 0 <=> 10^0 = 1
		// log_10 10 = 1 <=> 10^1 = 10
		// log_10 100 = 2 <=> 10^2 = 100
		// log_10 1000 = 3 <=> 10^3 = 1000
		// usw.
		
		// Länge der Zahl bestimmen
	
		/*
		int laenge =  (int) Math.floor ( Math.log10(zahl) ) + 1;
	
		System.out.println("Variante 1");
		System.out.print("Länge ");
		System.out.print(zahl);
		System.out.print(" ist ");
		System.out.println(laenge);
		*/
		
		
		int laenge = 0;
				
		System.out.println(zahl);
		
		for(long i = zahl ; i > 0; ) {
			long r = i % 10; // Rest
			i = i / 10; // Ganzzahl Division
			System.out.print(i);
			System.out.print(" ");
			System.out.println(r);
			laenge++;
			quersumme += r;
		}
		
		System.out.println("Variante 2");
		System.out.print("Länge ");
		System.out.print(zahl);
		System.out.print(" ist ");
		System.out.println(laenge);
		
		System.out.print("Quersumme: ");
		System.out.println(quersumme);
		
		
		System.out.println("Variante 3");
		
		char[] s = String.valueOf(zahl).toCharArray(); // Zahl -> String -> char Array
		
		long qs2 = 0;
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
			// String c = String.valueOf(s[i]); // char -> String
			// qs2 +=   Long.parseLong(c); // String -> Long
			
			// qs2 += s[i] - '0'; // '0' ist 48, '2' ist 50, usw
			// qs2 += s[i] - 48;
			
			qs2 += s[i] - '0';
		}
		
		
		System.out.print("Quersumme: ");
		System.out.println(qs2);
		
		
		char c = '7';
		System.out.println("Char 7 ist " + c);
		System.out.println("Char 7 als Zahl " + (int)c);
		
		c = 'K';
		System.out.println("Char K ist " + c);
		System.out.println("Char K als Zahl " + (int)c);
		
		
		System.out.println("Zahl 72 ist char " + (char)72);
		System.out.println("Zahl 229 ist char " + (char)229);

		System.out.println("Zahl 72 ist  " + (int)72);
		
		
		System.out.println("Zahl 41229 ist char " + (char)41229);
/*
		
		System.out.print("c = ");
		System.out.print((int)'0');
		System.out.print(", i = ");
		System.out.println('0' - '0');
		
		System.out.print("c = ");
		System.out.print((int)'1');
		System.out.print(", i = ");
		System.out.println('1' - '0');
		
		System.out.print("c = ");
		System.out.print((int)'5');
		System.out.print(", i = ");
		System.out.println('5' - '0');
		*/
		
	}
	

}
