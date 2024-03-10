public class Main {
    public static void main(String[] args) throws Exception {

        Payment payment = new Payment(20240228, 1250.05f);

        System.out.println(payment.getAmount());
        System.out.println(payment.getTimeRegistered());
        System.out.println(payment);

        payment.pay(20240309);

        System.out.println(payment);
        System.out.println("--------------------");

        // ----
        Payment p2 = new CreditCardPayment(20240302, 120.0f);

        System.out.println(p2.getAmount());
        System.out.println(p2.getTimeRegistered());
        System.out.println(p2);

        p2.pay(20240307);

        System.out.println(p2);
        System.out.println("--------------------");

        // ----
        Payment p3 = new CashPayment(20240119, 45.0f);

        System.out.println(p3.getAmount());
        System.out.println(p3.getTimeRegistered());
        System.out.println(p3);

        p3.pay(20240127);

        System.out.println(p3);
        System.out.println("--------------------");
    }
}
