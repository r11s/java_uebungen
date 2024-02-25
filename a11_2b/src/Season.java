
public enum Season {
  FRUEHLING, SOMMER, HERBST, WINTER;

  static Season value(int ord) {
    switch (ord) {
      case 0:
        return FRUEHLING;
      case 1:
        return SOMMER;
      case 2:
        return HERBST;
      case 3:
        return WINTER;

      default:
        throw new IllegalArgumentException("Diese Jahreszeit gibt es nicht.");
    }
  }
}
