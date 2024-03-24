import java.util.UUID;

public class CashPayment extends Payment {

  private String bankNr;

  CashPayment(int timeStamp, float amount) {
    this("", timeStamp, amount);
  }

  CashPayment(String bankNr, int timeStamp, float amount) {
    super(timeStamp, amount); // muss erster Befehl sein

    if (bankNr == "") {
      // Variante 1: Error werfen
      // throw new IllegalArgumentException("Fehler: Banknummer fehlt.");

      // Variante 2: Fehlermeldung und Prograsmm verlassen
      // System.err.println("Banknummer fehlt !!!!");
      // System.exit(1);

      // Variante 3: BankNr generieren, wenn sie fehlt.
      bankNr = UUID.randomUUID().toString().substring(1, 10);
    }
    this.bankNr = bankNr;
  }

  @Override
  public String toString() {

    return super.toString() + " / Bank-Nr. = " + bankNr;
  }

}

// cash: Amount=1000.0 / payment done @ 20121124 / bank= 12345678