import java.util.LinkedList;
import java.util.List;

public class Queue<E> implements Comparable<Queue<E>> {

  private List<E> list = new LinkedList<>();

  public void input(E e) {

    list.add(e);
    list.sort(null);
  }

  public E output() {
    return list.removeFirst();
  }

  public boolean hasNoElement() {
    return list.isEmpty();
  }

  @Override
  public int compareTo(Queue<E> o) {
    return this.compareTo(o);
  }

}
