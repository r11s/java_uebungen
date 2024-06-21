
public class Stack<T> {

  private Object[] stack;
  private int nextFree;

  private int size;

  public Stack() {
    this.size = 8;
    init();
  }

  public Stack(int size) {
    this.size = size;
    init();
  }

  @SuppressWarnings("unchecked")
  private void init() {
    stack = (T[]) new Object[size];
    nextFree = 0;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public boolean isFull() {
    return this.size == stack.length;
  }

  public void push(T element) {

    if (isFull()) {
      new RuntimeException("PUSH nicht möglich, da Stack voll");
    }
    stack[nextFree] = element;
    nextFree++;
  }

  @SuppressWarnings("unchecked")
  public T pop() {

    if (isEmpty()) {
      new RuntimeException("POP nicht möglich, da Stack leer");
    }

    nextFree--;
    return (T) stack[nextFree];
  }

  @Override
  public String toString() {

    String s = "";

    for (int i = 0; i < nextFree; i++) {
      s += String.format("%d %s %n", i, stack[i]);
    }

    return s;
  }
}
