
public class CreditCardPayment extends Payment {

  private String cardNr = "-";
  private int securityCode;
  private int endDate = 0;

  CreditCardPayment(String cardNr, int amount) {
    super(0, amount);
    super.setTimestamp();
    this.cardNr = cardNr;

  }

  public void setSecurityCode(int securityCode) {
    this.securityCode = securityCode;
  }

  public void setEndDate(int endDate) {
    this.endDate = endDate;
  }

  public int getSecurityCode() {
    return securityCode;
  }

  @Override
  public String toString() {
    return super.toString() + " / cardNr=" + this.cardNr + " / expires@" + endDate;
  }
}

// creditcard: Amount=2000.0 / payment pending / cardNr=5555-5666-6622-2211 /
// expires@1611
