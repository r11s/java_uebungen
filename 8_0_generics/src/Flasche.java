public class Flasche<T> {

  private T inhalt;

  public Flasche() {
    this.inhalt = null;
  }

  public Flasche(T inhalt) {
    this.inhalt = inhalt;
  }

  public T flascheLeeren() {
    this.inhalt = null;

    return this.inhalt;
  }

  public T getInhalt() {

    return this.inhalt;
  }

}
