enum Season {
  FRUEHLING(0), SOMMER(1), HERBST(2), WINTER(3);

  private static Languages sprache = Languages.DEUTSCH;

  static public void setSprache(Languages sprache) {
    Season.sprache = sprache;
  }

  static String[][] translations = {
      { "Frühling", "Sommer", "Herbst", "Winter" },
      { "printemps", "été", "automne", "hiver" },
      { "spring", "summer", "autumn", "winter" },
      { "primavera", "estate", "autunno", "inverno" }
  };

  private int season;

  Season(int i) {
    this.season = i;
  }

  @Override
  public String toString() {
    return translations[sprache.code()][this.season];
  }
}