
public class Main {
	
	public static void main(String[] args) {
		
		int i = 273;

		// Integer ii = new Integer(i); !!! wird nicht mehr verwendet
		// String s = ii.toString(i);

		String s = Integer.toString(i);
		
		
		int maxInt = Integer.MAX_VALUE;
		
		
		System.out.println(Integer.compare(555, 123));
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.toHexString(1_000_000));

		System.out.println(Integer.toHexString(255));
		System.out.println(Integer.toBinaryString(255));

		long minL = Character.MIN_VALUE;
		System.out.println(minL);

		long maxL = Character.MAX_VALUE;
		System.out.println(maxL);

		
		System.out.println(Long.MIN_VALUE);

		System.out.println(Long.MAX_VALUE);
		
		
		
		
		char smiley = (char)14812;
		
		System.out.println(smiley);
		
		char a = 'a';
		System.out.println((int)a);
		
		
		// byte, short, int, long, char sind Zahlen !!
		// char wird bei der Ausgabe als Buchstabe dargestellt
	}
	
	
}
