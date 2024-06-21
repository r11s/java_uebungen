public class Katze implements TierEigenschaften {

    @Override
    public void geraeusch() {
        System.out.println("Miau");
    }

    @Override
    public void bewegen() {
        System.out.println("Geht auf 4 Pfoten.");
    }

}
