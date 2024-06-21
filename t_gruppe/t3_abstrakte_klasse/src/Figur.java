
public abstract class Figur {

    private Position position;

    Figur(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    abstract public void zeichne();

    abstract public Double flaeche();
}
