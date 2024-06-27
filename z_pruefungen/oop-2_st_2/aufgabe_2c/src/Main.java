
public class Main {
    public static void main(String[] args) throws Exception {

        Queue<String> queue = new Queue<>();

        queue.input("Eier");
        queue.input("Zucker");
        queue.input("Mehl");
        queue.input("Milch");
        queue.input("Rosinen");
        queue.input("Quark");
        queue.input("Rum");

        while (!queue.hasNoElement()) {
            System.out.println(queue.output());
        }

        while (!queue.hasNoElement()) {
            System.out.println(queue.output());
        }

    }
}
