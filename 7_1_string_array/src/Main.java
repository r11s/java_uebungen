
public class Main {

	public static void main(String[] args) {

		String s = "Hallo Welt! 0123456789 \"*ç%&/";

		s += 'A';

		s += "xyz";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			System.out.printf("%c(%d) ", ch, (int) ch);

		}

		char[] a = s.toCharArray(); // String in Array umwandeln

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		a = "abcdefghijklmnopqrstuvxyz".toCharArray(); // String in Array umwandeln

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println();

		// Strings vergleichen
		String s1 = "123";
		String s2 = "123";
		String s3 = new String("123");

		System.out.println("=="); // Objektvergleich
		System.out.println("------");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println();

		System.out.println("equals"); // Inhaltsvergleich
		System.out.println("------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
