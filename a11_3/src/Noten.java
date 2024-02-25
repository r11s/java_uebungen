public enum Noten {

  SEHR_GUT(6),
  GUT(5),
  GENUEGEND(4),
  UNGENUEGEND(3),
  SCHWACH(2),
  SEHR_SCHWACH(1);

  private final int note;

  Noten(int note) {
    this.note = note;
  }

  public int getNote() {
    return this.note;
  }

}
