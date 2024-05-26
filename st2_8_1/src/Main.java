public class Main {
    public static void main(String[] args) throws Exception {

        Stack<String> stack = new Stack<>(10);

        System.out.println("----");

        stack.push("Der");
        stack.push("Himmel");
        stack.push("ist");
        stack.push("Blau");

        System.out.println(stack);

        Stack<Double> stack1 = new Stack<>(10);

        System.out.println("----");

        stack1.push(1.0);
        stack1.push(Math.tan(1.0));
        stack1.push(Math.PI);
        stack1.push(Math.sqrt(5.0));

        System.out.println(stack1);

    }
}
