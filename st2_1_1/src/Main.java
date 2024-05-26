public class Main {
    public static void main(String[] args) throws Exception {

        Stack stack = new Stack(10);

        System.out.println("----");

        stack.push("Der");
        stack.push("Himmel");
        stack.push("ist");
        stack.push("Blau");

        System.out.println(stack);

    }
}
