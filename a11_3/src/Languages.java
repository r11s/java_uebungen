public enum Languages {
  DEUTSCH(0), ENGLISCH(2), FRANZOESISCH(1);

  private int code = 0;

  Languages(int cd) {
    this.code = cd;
  }

  public int code() {
    return this.code;
  }
}
