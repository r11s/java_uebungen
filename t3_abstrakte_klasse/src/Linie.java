public class Linie extends Figur {

    private Position p2;

    public Position getP2() {
        return p2;
    }

    public void setP2(Position p2) {
        this.p2 = p2;
    }

    Linie(Position p1, Position p2) {
        super(p1);
        this.p2 = p2;
    }

    @Override
    public void zeichne() {
        System.out.println("Zeichne Linie von p1 zu p2");

    }

    @Override
    public Double flaeche() {
        return null;
    }

}
