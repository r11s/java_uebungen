package u4_1;

public class Main {
	
	static long zaehler = 0;

	public static void main(String[] args) {
		
		// Fibonacci-Zahl wir gesucht für
		
		System.out.println("n          fib(n)        Aufrufe");
		
		for( int j = 0; j < 46; j++) {
			
			zaehler = 0;
			
			System.out.print(j);
			System.out.print("    ");
			System.out.print(fibonacci(j));
			System.out.print("    ");
			System.out.println(zaehler);
			
		}
		
		/*
		long n = 4;
		long fibN = fibonacci(n);
		
		
		System.out.println("Fibonacci Zahl von " + n + " ist " + fibN);
		*/

	}

	// Rekursive Funktion
	
	static long fibonacci(long i) {
		
		zaehler++;
				
		// Verankerung, Abbruchkriterium
		// fib(0) = 0 sowie fib(1) = 1
		if( i == 0) {
			return 0;
		}
		
		if( i == 1) {
			return 1;
		}
		
		// Rekursion
		// fib(n) = fib(n–1) + fib(n–2)
		
		return fibonacci(i-1) + fibonacci(i-2);
		
	}
	/*
	 
	 fib(5) 	                                                                  + fib(4)
	 
	 								                                            fib(3) + fib(2)
	 								                                            
	 								                                            ...
	               
	                                          fib(3)               + fib(2)
	                                          
	                                          fib(2) + fib(1) = 1
	                                          
	                                          fib(1) = 1
	 
	 fib(4)                        + fib(3)
	 
	 								 fib(2) + fib(1) = 1
	 								 
	 								 fib(1) = 1
	 
	 
	 fib(2)                + fib(1) = 1
	 
	 fib(1) = 1
	 
	                       
	 
	 */
	
	

}
