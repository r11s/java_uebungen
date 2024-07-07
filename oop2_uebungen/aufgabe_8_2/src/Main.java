
import aufgabe_8_2.Pair;

public class Main {
    public static void main(String[] args) throws Exception {

        Pair<String, Double> p = new Pair<>("Hallo", 47.0);
        System.out.println(p);

        // Pair<String, Double> q = new Pair<>("Hallo", null);
        // Pair<String, Double> q = new Pair<>(null, 1.23);

        System.out.println(p.first());
        System.out.println(p.second());

    }
}
