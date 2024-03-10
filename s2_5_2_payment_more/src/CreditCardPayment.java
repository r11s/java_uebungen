public class CreditCardPayment extends Payment {

  CreditCardPayment(int timeStamp, float amount) {
    super(timeStamp, amount);

  }

  @Override
  public String toString() {
    return super.toString() + " <-- Credit card payment";
  }
}
