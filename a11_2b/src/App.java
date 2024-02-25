
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aufgabe 2a");

        System.out.println("Ordinal Test <-------------------");
        showAllYouWant("Ordinal von Winter: " + Season.WINTER.ordinal());
        showAllYouWant("Ordinal von Sommer: " + Season.SOMMER.ordinal());

        System.out.println("Enum Season Test <-------------------");
        showAllYouWant(Season.values());

        System.out.println("Value Test <-------------------");
        for (Season jz : Season.values()) {
            System.out.println(Season.value(jz.ordinal()));
        }

        System.out.println(Season.value(-1));

    }

    private static void showAllYouWant(Object... o) {
        for (Object e : o) {
            System.out.println(e);
        }
    }
}
