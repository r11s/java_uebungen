public class App {

    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 3;

        System.out.println(add(a, b));

        double x = 1.01;
        double y = 23.3;

        System.out.println(add(x, y));

        System.out.println(sqrt(x + y)); // Wurzel aus double - Zahl

        System.out.println(sqrt(a + b)); // Wurzel aus int - Zahl
    }

    private static double sqrt(double d) {
        return Math.sqrt(d);
    }

    private static int sqrt(int d) {
        return (int) Math.round(Math.sqrt(d));
    }

    private static double add(double x, double y) {
        return x + y;
    }

    private static int add(int a, int b) {
        return a + b;
    }

}
