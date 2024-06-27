import java.util.LinkedList;
import java.util.List;

public class Queue<E> {

  private List<E> list = new LinkedList<>();

  public void input(E e) {
    list.add(e);
  }

  public E output() {
    return list.removeFirst();
  }

  public boolean hasNoElement() {
    return list.isEmpty();
  }

}
