
public class Order {

    private Payment[] payments;
    private int anzahl;
    private int counter;

    public Order(int anzahl) {
        this.anzahl = anzahl;
        this.counter = 0;

        this.payments = new Payment[anzahl];
    }

    public void addPayment(Payment payment) {
        if (counter == anzahl) {
            throw new IndexOutOfBoundsException("maximale Anzahl Zahlungen erreicht");
        }

        this.payments[counter] = payment;
        counter++;
    }

    public void addPayment(CashPayment cashPayment) {
        addPayment((Payment) cashPayment);
    }

    public void addPayment(CreditCardPayment crediCardPayment) {
        addPayment((Payment) crediCardPayment);
    }

    public void listPayments() {

        System.out.println("\n-----------------------------------\n");

        for (int i = 0; i < counter; i++) {
            System.out.println(this.payments[i].toString());
        }

        System.out.println("\n-----------------------------------\n");
    }

    public Payment getPayment(int i) {
        if (i >= counter || i < 0) {
            throw new IndexOutOfBoundsException("Zahlung existiert nicht");
        }
        return this.payments[i];
    }

}
