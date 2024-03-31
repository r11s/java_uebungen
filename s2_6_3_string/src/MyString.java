
public class MyString implements Comparable<MyString> {

	private char[] text;
	private int length = 0;
	private int capacity = 8;

	public MyString() {

		text = new char[capacity]; // 8 Speicherplaetze erzeugen
		length = 0; // leer; Laenge 0

	}

	public MyString(MyString s) {

		// Variante 1
		/*
		 * MyString ms = new MyString(s.toString()); // neues Objekt
		 * 
		 * this.text = ms.text;
		 * this.length = ms.length;
		 * this.capacity = ms.capacity;
		 */

		// Variante 2
		this.capacity = s.capacity;
		this.length = s.length;
		// this.text = s.text; !!! ominoes

		this.text = new char[capacity];

		for (int i = 0; i < this.text.length; i++) {
			this.text[i] = s.text[i];
		}

	}

	public MyString(String s) {

		length = s.length();

		while (capacity < length) { // Kapazitaet verdoppeln bis > length
			capacity += capacity;
		}

		text = new char[capacity];

		for (int i = 0; i < s.length(); i++) {
			text[i] = s.charAt(i);
		}

	}

	public MyString(char ch, int repeats) {

		this(); // MyString erzeugen

		for (int i = 0; i < repeats; i++) { // char anhaengen
			this.append(ch);
		}
	}

	public int capacity() {
		return capacity;
	}

	public int length() {
		return length;
	}

	public void append(char c) {

		length++;

		if (capacity < length) {
			while (capacity < length) { // Kapazitaet verdoppeln bis > length
				capacity += capacity;
			}

			char[] temp = new char[capacity];
			for (int i = 0; i < length - 1; i++) {
				temp[i] = text[i];
			}
			text = temp;

		}

		text[length - 1] = c; // array 0 bis length - 1

	}

	public void append(String s) {

		int newLength = length + s.length();

		if (newLength < capacity) {
			while (capacity < length) { // Kapazitaet verdoppeln bis > length
				capacity += capacity;
			}

			char[] temp = new char[capacity];

			for (int i = 0; i < length; i++) {
				temp[i] = text[i];
			}

			text = temp;

		}

		for (int i = length; i < newLength; i++) {
			text[i] = s.charAt(i - length);
		}

		length = newLength;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		for (int i = 0; i < length; i++) {
			s.append(text[i]);
		}

		return s.toString();
	}

	@Override
	public int compareTo(MyString other) {

		int x = 0;
		int min = this.text.length < other.text.length ? this.text.length : other.text.length;

		for (int i = 0; i < this.length || i < min; i++) {
			if (this.text[i] < other.text[i]) {
				x = -1;
				break;
			}

			if (this.text[i] > other.text[i]) {
				x = 1;
				break;
			}
		}

		if (x == 0) {
			x = this.text.length < other.text.length ? -1 : 1;
			/*
			 * if (this.text.length < other.text.length){
			 * x = -1;
			 * } else {
			 * x = 1;
			 * }
			 */
		}

		return x;
	}

}
