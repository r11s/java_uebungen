public class Main {
    public static void main(String[] args) throws Exception {

        Payment payment = new Payment(20240228, 1250.05f);

        System.out.println(payment.getAmount());
        System.out.println(payment.getTimeRegistered());
        System.out.println(payment);

        payment.pay(20240309);

        System.out.println(payment);
    }
}
