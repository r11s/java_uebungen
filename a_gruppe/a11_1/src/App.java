
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aufgabe 1");

        showAllYouWant(1, 2, 3, 42, "Hallo", "Welt");
    }

    private static void showAllYouWant(Object... o) {
        for (Object e : o) {
            System.out.println(e);
        }
    }

}
