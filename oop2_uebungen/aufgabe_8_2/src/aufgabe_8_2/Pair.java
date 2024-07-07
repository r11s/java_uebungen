package aufgabe_8_2;

public class Pair<P1, P2> {

  P1 p1;
  P2 p2;

  public Pair(P1 p1, P2 p2) {

    if (p1 == null || p2 == null) {
      throw new NullPointerException("null als Parameter ist nicht erlaubt.");
    }

    this.p1 = p1;
    this.p2 = p2;

  }

  public P1 first() {
    return p1;
  }

  public P2 second() {
    return p2;
  }

  @Override
  public String toString() {
    return "Pair<" + String.valueOf(p1) + "," + String.valueOf(p2) + ">";
  }

}
