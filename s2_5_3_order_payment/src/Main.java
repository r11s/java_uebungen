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
        Payment p2 = new CreditCardPayment("1234-5678-9012-3456", 5);

        System.out.println(p2.getAmount());
        System.out.println(p2.getTimeRegistered());
        System.out.println(p2);

        CreditCardPayment temp = (CreditCardPayment) p2;

        System.out.println("Security-Code=" + temp.getSecurityCode());

        temp.setSecurityCode(123);
        temp.setEndDate(20271010);

        System.out.println(p2);

        System.out.println("Security-Code=" + temp.getSecurityCode());

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

        // ----
        Payment p4 = new CashPayment("1234", 20240212, 100.0f);

        System.out.println(p4.getAmount());
        System.out.println(p4.getTimeRegistered());
        System.out.println(p4);

        p4.pay(20240308);

        System.out.println(p4);
        System.out.println("--------------------");

        // ----

        Payment payments[] = new Payment[4];

        payments[0] = payment;
        payments[1] = p2;
        payments[2] = p3;
        payments[3] = p4;

        for (Payment p : payments) {
            System.out.println(p.toString());
        }

    }
}
