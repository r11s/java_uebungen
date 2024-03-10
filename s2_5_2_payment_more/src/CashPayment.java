public class CashPayment extends Payment {

  CashPayment(int timeStamp, float amount) {
    super(timeStamp, amount);

  }

  @Override
  public String toString() {
    // return super.toString();
    return "Cash Payment";
  }

}
