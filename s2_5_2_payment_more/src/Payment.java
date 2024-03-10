public class Payment {

  private int timeFullfilled;
  private float amount;
  private boolean isFullfilled;
  private int timeRegistered;

  Payment(int timeStamp, float amount) {
    this.isFullfilled = false;
    this.timeRegistered = timeStamp;
    this.amount = amount;
  }

  public void pay(int timeStamp) {
    this.isFullfilled = true;
    this.timeFullfilled = timeStamp;
  }

  public int getTimeRegistered() {
    return timeRegistered;
  }

  public float getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    String fullfilled;

    if (isFullfilled) {
      fullfilled = "done @ " + String.valueOf(timeFullfilled);
    } else {
      fullfilled = "pending";
    }

    String s = String.format(
        "Amount = %.1f / payment %s",
        amount,
        fullfilled);
    return s;
  }

}
