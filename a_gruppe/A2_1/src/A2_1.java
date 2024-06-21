


/*
Aufgabe 2.1

Schreiben Sie ein Programm, welches zwei Zahlen a und b (über die Tastatur) annimmt, 
anschliessend diese beiden Zahlen miteinander multipliziert und schliesslich das Produkt
ausgibt.

Die Multiplikation soll nicht wie in Aufgabe 1.1 mit dem Multiplikations-Operator * 
ausgeführt werden, son- dern durch fortgesetzte Addition. 

Es gilt bekanntlich: a*b = a+a+a+a ... +a (insgesamt b Additionen). 

Verwenden Sie für die fortgesetzte Addition eine while-Schleife.

Anmerkung: Diese Lösung funktioniert nur für nicht-negative Zahlen.
*/

public class A2_1 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		System.out.print("a = ");
		a = Terminal.readInt();
		
		System.out.print("b = ");
		b = Terminal.readInt();
		
		int produkt = 0;
				
		// a*b = a+a+a+a ... +a (insgesamt b Additionen)
		int b1 = b;
		while( b1 > 0) {
			produkt = produkt + a;
			b1 = b1 - 1;
		}
		
		System.out.println(a + "*" + b + "=" + produkt);
		

	}

}
