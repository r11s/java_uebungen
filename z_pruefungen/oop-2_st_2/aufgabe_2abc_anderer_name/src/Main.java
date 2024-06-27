
public class Main {
    public static void main(String[] args) throws Exception {

        EineAndererName<String> queue = new EineAndererName<>();

        queue.input("Eier");
        queue.input("Zucker");
        queue.input("Mehl");
        queue.input("Milch");
        queue.input("Rosinen");

        while (!queue.hasNoElement()) {
            System.out.println(queue.output());
        }
        queue.input("Quark");
        queue.input("Rum");

        while (!queue.hasNoElement()) {
            System.out.println(queue.output());
        }

    }
}
