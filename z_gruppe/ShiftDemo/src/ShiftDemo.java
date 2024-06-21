
public class ShiftDemo {

	public static void main(String[] args) {
		
		int a = 5;
		int c = 60;
		int b = c - (a << 3);
		int b1 = c - a << 3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b1);

		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));

	}

}
