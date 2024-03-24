public class Main {
    public static void main(String[] args) throws Exception {

        orderTest1();

    }

    private static void orderTest1() {

        // neue Bestellung mit maximal 8 Zahlungen:
        Order ord = new Order(8);

        // füge einige Zahlungen hinzu:
        ord.addPayment(new CashPayment("12345678-A", 20121120, 1000f));
        ord.addPayment(new CreditCardPayment("5555566666222211111L", 2000));
        ord.addPayment(new Payment(20121201, 1450f));

        ord.listPayments();

        ord.getPayment(0).pay(20121124);

        CreditCardPayment cardPay = (CreditCardPayment) ord.getPayment(1);
        cardPay.setSecurityCode(671);
        cardPay.setEndDate(1611);

        ord.listPayments();

    }

}
