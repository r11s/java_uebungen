
public class Album {

  private String albumTitel;
  private Band band;
  private Stueck[] stuecke;
  private boolean isLive;
  private Typ typ;
  private int jahr;

  public Album(String albumTitel, Band band, Stueck[] stuecke, boolean isLive, Typ typ, int jahr) {
    this.albumTitel = albumTitel;
    this.band = band;
    this.stuecke = stuecke;
    this.isLive = isLive;
    this.typ = typ;
    this.jahr = jahr;
  }

  public String getAlbumTitel() {
    return albumTitel;
  }

  public Band getBand() {
    return band;
  }

  public Stueck[] getStuecke() {
    return stuecke;
  }

  public boolean isLive() {
    return isLive;
  }

  public Typ getTyp() {
    return typ;
  }

  public int getJahr() {
    return jahr;
  }

}
