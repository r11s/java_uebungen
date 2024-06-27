
class Frucht implements Comparable<Frucht> {

  private String name;
  private String farbe;

  public Frucht(String name, String farbe) {
    this.name = name;
    this.farbe = farbe;
  }

  @Override
  public String toString() {
    return name + ": " + farbe;
  }

  @Override
  public int compareTo(Frucht o) {

    return this.farbe.compareTo(o.farbe);

  }
}
