public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aufgabe 2a");

        showAllYouWant(Season.values());
    }

    private static void showAllYouWant(Object... o) {
        for (Object e : o) {
            System.out.println(e);
        }
    }
}
