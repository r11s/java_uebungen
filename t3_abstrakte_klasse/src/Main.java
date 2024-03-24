
public class Main {
    public static void main(String[] args) throws Exception {

        Figur[] figuren = new Figur[3];

        Position kPos = new Position(100, 50);
        int radius = 40;

        Position rPos = new Position(100, 50);
        int breite = 120;
        int hoehe = 60;

        figuren[0] = new Kreis(kPos, radius); // Kreis

        figuren[1] = new Rechteck(rPos, breite, hoehe); // Rechteck

        Position p1 = new Position(230, 45);
        Position p2 = new Position(170, 34);

        figuren[2] = new Linie(p1, p2);

        System.out.println("\n- - - - - - - - - - -\n");

        for (Figur f : figuren) {
            f.zeichne();

            // if (f.flaeche() != null) {
            System.out.printf("%nFlaeche: %f%n", f.flaeche());
            // }

            System.out.println("\n- - - - - - - - - - -\n");
        }

    }
}
