import abc.Xyz;

public class Main {

  public static void main(String[] args) {
  
    System.out.println("Hallo Welt!");
    
    f(99);
    
    Xyz.g();
    
    Q.g2();
    
    
    // Wurzel aus 5
    
    double y = Math.pow(5, 1.0/2.0); // Power
    System.out.println(y);
    
    y = Math.sqrt(5); // Square Root
    System.out.println(y);
    
  }
  
  
  public static void f(int i) {
	  System.out.println("Funktion f(" + i + ") ");
  }
  
}



