
public class MyStringBuilderSimulator {

	public static void main(String[] args) {
		
		
		MyString mb = new MyString();
		
		print("mb", "\"" + mb + "\"", " capacity:", mb.capacity(), ", length:", mb.length());
		
		
		MyString mb2 = new MyString("Hallo Welt!");
		
		print("mb2", "\""+ mb2 + "\"", " capacity:", mb2.capacity(), ", length:", mb2.length());
		
		MyString mb3 = new MyString(mb2);
		
		print("mb3", "\""+ mb3 + "\"", " capacity:", mb3.capacity(), ", length:", mb3.length());
		
		mb2.append('Q');
		
		print("mb2", "\""+ mb2 + "\"", " capacity:", mb2.capacity(), ", length:", mb2.length());
		print("mb3", "\""+ mb3 + "\"", " capacity:", mb3.capacity(), ", length:", mb3.length());
		
		MyString mb4 = new MyString('y', 42);
		
		print("mb4", "\""+ mb4 + "\"", " capacity:", mb4.capacity(), ", length:", mb4.length());
		
		mb4.append(" zzz");
		print("mb4", "\""+ mb4 + "\"", " capacity:", mb4.capacity(), ", length:", mb4.length());

	}
		
	static void print(Object...o) {
		
		for(Object e : o) {
			System.out.print(e + " ");
		}
		
		System.out.println();
		
	}

}
