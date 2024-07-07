package aufgabe_8_8;

public class Vector<E> {

  private int capacity = 16;
  private int actualSize = 0;

  private E[] vectors;

  @SuppressWarnings("unchecked")
  public Vector() {
    vectors = (E[]) new Object[capacity];
  }

  public Vector(Vector<E> otherVector) {
    this();

    System.out.println("o: " + otherVector);

    for (int i = 0; i < otherVector.actualSize; i++) {
      this.pushBack(otherVector.vectors[i]);
    }
  }

  public E getElement(int index) {

    if (index < 0 || index > actualSize) {
      throw new ArrayIndexOutOfBoundsException(index + " ausserhalb der Grenzen 0 und " + actualSize);
    }

    if (index < vectors.length) {
      return vectors[index];
    }

    return null;
  }

  public void setElement(int index, E v) {

    if (index < 0 || index > actualSize) {
      throw new ArrayIndexOutOfBoundsException(index + " ausserhalb der Grenzen 0 und " + actualSize);
    }

    vectors[index] = v;
  }

  public int size() {
    return actualSize;
  }

  public int capacity() {
    return vectors.length;
  }

  public void pushBack(E v) {
    if (actualSize == capacity) {
      capacity += 8;
      @SuppressWarnings("unchecked")
      E[] newVectors = (E[]) new Object[capacity];
      for (int i = 0; i < vectors.length; i++) {
        newVectors[i] = vectors[i];
      }
      vectors = newVectors;
    }

    vectors[actualSize] = v;
    actualSize++;
  }

  public E popFront() {
    actualSize--;
    E v = vectors[0];
    for (int i = 0; i < actualSize; i++) {
      vectors[i] = vectors[i + 1];
    }

    return v;
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder("[");

    for (int i = 0; i < actualSize; i++) {
      if (i > 0) {
        sb.append(String.valueOf(", "));
      }
      sb.append(String.valueOf(vectors[i]));
    }

    sb.append("]");

    return sb.toString();

  }

}
