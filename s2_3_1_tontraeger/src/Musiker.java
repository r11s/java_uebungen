import java.time.LocalDate;

public class Musiker {

  private String vorname;
  private String nachname;
  private LocalDate geburtdatum;

  public Musiker(String vorname, String nachname, LocalDate geburtdatum) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.geburtdatum = geburtdatum;
  }

  public String getVorname() {
    return vorname;
  }

  public String getNachname() {
    return nachname;
  }

  public LocalDate getGeburtdatum() {
    return geburtdatum;
  }

}
