
public class DemoStringBuilder {

	public static void main(String[] args) {
		
		int n = 100_000;
		
		long startZeit;
		long benoetigteZeit;
		
		
		startZeit = System.currentTimeMillis(); // Zeit in Millisekunden set dem 1.1.1970
		
		String s = "";
		
		for (int i = 0; i < n; i++) {
			s = s + "x";
		}
		
		benoetigteZeit = System.currentTimeMillis() - startZeit;
		
		System.out.println("Zeit: " + benoetigteZeit + "ms mit String fuer String der Laenge: " + s.length());
		
		
		
		
		
		
		
		startZeit = System.currentTimeMillis(); // Zeit in Millisekunden set dem 1.1.1970
		
		StringBuilder sb = new StringBuilder("");
		
		for (int i = 0; i < n; i++) {
			sb = sb.append("x"); 
		}
		
		benoetigteZeit = System.currentTimeMillis() - startZeit;
		
		System.out.println("Zeit: " + benoetigteZeit + "ms mit StringBuilder fure String der Laenge: " + sb.length());
		
	}
	
	

}
