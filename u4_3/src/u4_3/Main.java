package u4_3;

public class Main {

	public static void main(String[] args) {
		
		
		double x = 2.57;
		
		// Zahl runden
		int r = runde(x);
		System.out.println(x + ", " + r);

		x = 2.37;
		
		// Zahl runden
		r = runde(x);
		System.out.println(x + ", " + r);
		
		
		// Zahl auf n Dezimalen runden
		x = 2.37456;
		int n = 3;
		
		// Lösung
		// 2.37456 * 1000 = 2.37456 * 10^3 = 2374.56
		// runde -> 2375
		// 2375 / 10^3
		// Resultat 2.375
		
		double s = rundeN(x, n);
		System.out.println(x + ", " + s);
		
		
		/*
		        auf 5er runden
		        
		        45.27 -> 45.25
		        
		        0.05 = 5 / 100 = 1 / 20
		        
		        y = runde(45.27 * 20)
		        
		        y / 20
		 */
		
		

	}

	private static double rundeN(double x, int n) {
		
		double faktor = Math.pow(10, n);
		
		double y = runde(x * faktor);
		
		
		return y / faktor;
	}

	private static int runde(double x) {
		
		double y = x + 0.5;
		
		y = Math.floor(y);
		
		return (int) y;
	}

}
