import aufgabe_8_8.Vector;

public class Main {
    public static void main(String[] args) throws Exception {

        Vector<String> v = new Vector<>();

        System.out.println(v);

        v.pushBack("Hallo");
        System.out.println(v);

        v.pushBack("Welt");
        System.out.println(v);

        for (int i = 0; i < 25; i++) {
            v.pushBack(String.valueOf(i + 3));
        }
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());

        // v.getElement(-20);

        // v.setElement(125, "ungültig");

        for (int i = 0; i < 15; i++) {
            v.popFront();
        }
        System.out.println("v: " + v);

        Vector<String> w = new Vector<>(v);
        System.out.println("w: " + w);

        System.out.println("v: " + v);

        for (int i = 0; i < 12; i++) {
            v.popFront();
        }
        System.out.println("v: " + v);
        System.out.println("w: " + w);

        Vector<Double> zahlen = new Vector<>();

        for (int i = 0; i < 5; i++) {
            zahlen.pushBack(Math.random());
        }

        System.out.println(zahlen);

        Vector<Integer> ganzZahlen = new Vector<>();

        for (int i = 0; i < 15; i++) {
            ganzZahlen.pushBack((int) (Math.random() * 6) + 1);
        }

        System.out.println(ganzZahlen);

    }
}
