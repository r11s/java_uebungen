
public class A5_2 {

	public static void main(String[] args) {
		
		
		int[] a1 = { 2, 3, 5, 7, 11 };
		
		// int p = 13;
		
		arrayPrint(a1);
		// System.out.println(a1);
		
		a1 = resize(a1, 2);
		
		// a1[a1.length - 1] = p;
		
		arrayPrint(a1);
		// System.out.println(a1);
		

	}
	
	static void arrayPrint(int[] a) {
		
		int laenge = a.length;
		
		for(int i = 0; i < laenge; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
	}
	
	static int[] resize(int[] array, int newSize) {
		
		int[] a = new int[newSize];
		
		int copySize;
		int oldSize = array.length;
		
		// Minimum von neuer und alter Laenge
		/*
		if (newSize < oldSize){
			copySize = newSize;
		} else {
			copySize = oldSize;
		}
		*/
		copySize = Math.min(newSize, oldSize);
		
				
		// System.out.println(copySize);
		
		for(int i = 0; i < copySize; i++) {
			// System.out.println(i);
			a[i] = array[i];
		}		
		
		return a;
	}

}
