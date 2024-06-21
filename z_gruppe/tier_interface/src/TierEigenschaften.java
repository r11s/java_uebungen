public interface TierEigenschaften {

    void geraeusch();

    void bewegen();

    default void hallo() {
        System.out.println("Hallo");
    }

}
