
public class Rechteck extends Figur {

    private int breite;
    private int hoehe;

    public Rechteck(Position rPos, int breite, int hoehe) {
        super(rPos);
        this.breite = breite;
        this.hoehe = hoehe;

    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public void zeichne() {
        System.out.println("Gehe zu Position");

        System.out.println("Zeichen linie nacht rechts mit Laenge breite");
        System.out.println("Zeichen linie nacht unten mit Laenge hoehe");
        System.out.println("Zeichen linie nacht links mit Laenge breite");
        System.out.println("Zeichen linie nacht oben mit Laenge hohe");
    }

    @Override
    public Double flaeche() {
        return (double) breite * hoehe;
    }

}
