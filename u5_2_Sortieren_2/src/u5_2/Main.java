package u5_2;

public class Main {

	public static void main(String[] args) {
		
		int n = 10; // Anzahl ganze Zahlen im Array
		
		int [] array = fillArray(n); 
		
		int [] b = array;
		
		int x = 4;
		int y = x;
		
		System.out.println(x);
		System.out.println(y);
		
		x = 22;
		
		System.out.println(x);
		System.out.println(y);
		

		
		// int [] newArray = array.clone(); // array nach new Array kopieren
		
	
		String s;
		
		s = arrayToString(array);		
		System.out.println("Array: " + s);
		System.out.println();
		
		// sortArray2(array);
		
		b[0] = 22;
		
		s = arrayToString(array);		
		System.out.println("Array: " + s);
		System.out.println();
		
		s = arrayToString(b);		
		System.out.println("b: " + s);
		System.out.println();
		
		
		
		/*
				

		s = arrayToString(newArray);		
		System.out.println("New Array: " + s);
		
		
		for(int i = 0; i < n - 1; i++) {
			sortArray(newArray, i);
		}
		
		s = arrayToString(array);		
		System.out.println("Old Array: " + s);
		*/
		
		

				
	}
	
	static void sortArray2(int[] a) {
		
		int aLaenge = a.length;
		
		a[2] = 99999;
		
		/*
		for (i = 0; i < n; ++i){
			   for (j = i + 1; j < n; ++j){
			      if (num[i] > num[j]){
			         a = num[i];
			         num[i] = num[j];
			         num[j] = a;
			      }
			   }
			}
			*/
		
	}
	
	
	static void sortArray(int [] a, int i1) {
		
		int e1 = a[i1];
		
		int i2 = 0;
		int e2 = e1;
		
		boolean found = false;
		
		// Kleinstes Element suchen
		for(int i = i1 + 1; i < a.length; i++) {
			if(a[i] < e2) {
				found = true;
				i2 = i;
				e2 = a[i];
			}
		}
		
		// vertauschen wenn ein kleineres Element im Array gefunden wurde
		if (found) {
			
			System.out.println("Es werden die Elemente " + i1 + " und " + i2 + " vertauscht.\n");
			
			a[i1] = e2;
			a[i2] = e1;
			
			System.out.println("New Array: " + arrayToString(a));
		}
				
		
	}
	
	
	static int [] fillArray(int n) {
		
		int [] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			// Math.random erzeugt eine double Zahl zwischen 0 und kleiner 1
			// Math.random erzeugt eine double Zahlen zwischen 0 und kleiner 1000;
			// a[i] = (int) Math.floor(Math.random() * 1000);
			
			// Würfeln zwischen 1 und 6
			a[i] = (int) Math.floor(Math.random() * 100) ;
			
		}
	
		return a;
	}
	
	static int geradeImArray(int [] a) {
		
		int anzahl = 0;
		
		// for Loop
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				anzahl++;
			}
		}
		
		// foreach loop
		/*
		for(int x : a) {
			if(x % 2 == 0) {
				anzahl++;
			}
			// System.out.println(x);
		}
		*/
		
		return anzahl;
	}

	static int negativeImArray(int [] a) {
		
		int anzahl = 0;
		
		// for Loop
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				anzahl++;
			}
		}
		
		// foreach loop
		/*
		for(int x : a) {
			if(x < 0) {
				anzahl++;
			}
			// System.out.println(x);
		}
		*/
		
		return anzahl;
	}
	

	static int summeArray(int [] a) {
		
		int summe = 0;
		
		for(int i = 0; i < a.length; i++) {
			summe += a[i];
		}
		
		return summe;
	}
	
	
	static String arrayToString(int [] a) {
		
		String s = "";
		
		for(int i = 0; i < a.length; i++) {
			s += a[i] + " "; 
		}
		
		s = s.substring(0, s.length() - 1);
		
		return s;
		
	}
	
	static String arrayToStringVarianten(int [] a) {
		
		String s = "";
		
		// s = "[";  // Variante 1
		
		for(int i = 0; i < a.length; i++) {
			// s += a[i] + ", "; // Variante 1
			s += a[i] + " ";  // Variante 2
		}
		
//		s = s.substring(0, s.length() - 2); // Variante 1
		s = s.substring(0, s.length() - 1); // Variante 2
		
		// s += "]"; // Variante 1
		
		return s;
		
	}
	
	
	

}
