
public class Main {

	public static void main(String[] args) {

		MyString s1 = new MyString("Hallo");
		MyString s2 = new MyString("Hallo123");

		System.out.print(s1);

		switch (s1.compareTo(s2)) {
			case 1:
				System.out.print(" ist groesser als ");
				break;
			case 0:
				System.out.print(" ist gleich ");
				break;
			case -1:
				System.out.print(" ist kleiner als ");
				break;

		}

		System.out.println(s2);

	}

}
