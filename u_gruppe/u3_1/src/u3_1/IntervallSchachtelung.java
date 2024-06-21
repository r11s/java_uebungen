//   3.5^2 
// = (3 + 0.5) * (4 - 0.5) 
// = 3 * 4 - 3 * 0.5 + 4 * 0.5  - 0.5 * 0.5 
// = 3 * 4 + 0.5 * 0.5 // 
// = 12 + 0.25 = 12.25
	
// Beispiele
//
// 3.5^2 = 3 * 4 + 0.25
// 65 * 65 = 60 * 70 + 25 = 4225
// 1.5 * 1.5 = 1 * 2 + 0.25 = 2.25

package u3_1;

import java.util.Scanner;

public class IntervallSchachtelung {
	
	static Scanner eingabe = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Wurzel r berechnen ( r >= 0)");
		System.out.print("r? ");
		
		double r = eingabe.nextDouble();
		
		if(r <= 0) {
			System.out.println("Fehler: Zahl r muss grösser 0 sein.");
			System.exit(0); // Programm beenden
			
		}
		
		double untereGrenze = 0;
		double obereGrenze = r;
		
		double epsilon = 1e-14;
		
		// untereGrenze^2 < r < obereGrenze 
		// Beispiel: r = 7, untereGrenze = 0; obereGrenze = 7
		
		// Mittelert berechnen
		// mittelwert = (untereGrenze + obereGrenze) / 2 
		// Beispiel: (0 + 7) / 2 = 3.5
		
		// wenn mittelwert^2 > r , aber mittelwert < obereGrenze
		// Beispiel: 3.5^2 = 12.25, 7^2 = 49 => 3.5 < 7
		
		// mittelwert wird neue obereGrenze d.h. obereGrenze = 3.5
		
		// wenn mittelwert^2 > r
		// wenn mittelwert^2 < r , aber untereGrenze < mittelwert
				
		// mittelwert wird neue untereGrenze
		
		double mittelwert = 0;
		int n = 1000;
		
		for(int i = 0; i < n; i++) {
			
			mittelwert = (untereGrenze + obereGrenze) / 2;
			
			if(mittelwert * mittelwert > r) {
				obereGrenze = mittelwert;
			} else {
				untereGrenze = mittelwert;
			}
			
			
			if(-epsilon < (r - mittelwert * mittelwert) && (r - mittelwert * mittelwert) < epsilon ) {
				break;
			} else {
				
			}
				
			System.out.printf("%d mittelwert = %.14f , Differenz = %.14f, epsilon = %.15fd%n",
					i,
					mittelwert, (r - mittelwert * mittelwert),
					epsilon);
		}
		
		
		System.out.printf("Die Wurzel von %.12f ist %.14f %n", r, mittelwert);
		

	}

}
