public class Ente implements TierEigenschaften {

    @Override
    public void geraeusch() {
        System.out.println("Quack");
    }

    @Override
    public void bewegen() {
        System.out.println("Fliegt oder watschelt");
    }

}
