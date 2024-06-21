
public class Kreis extends Figur {

    private int radius;

    public Kreis(Position position, int radius) {
        super(position);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void zeichne() {
        System.out.println("Gehe zu Mittelpunkt Kreis ( Position + (radius / 2, radius /2)");

        System.out.println("Zeichen Kreis mit Radius radius");
    }

    @Override
    public Double flaeche() {
        return 3.141 * radius;
    }

}
