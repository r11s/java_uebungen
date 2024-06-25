package demo;

import java.util.Timer;
import java.util.TimerTask;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {

  SimpleStringProperty text = new SimpleStringProperty("A");

  @FXML
  private Text label;

  // Konstruktor wird zuerst aufgerufen
  // bevor etwas initilisert wurde.
  // Damit kann z.B. ein Model zum
  // Controller hinzugefuegt werden.
  public Controller() {

  }

  // Initialize wird aufgerufen
  // nachdem die FXML-Annotations stattfanden!
  public void initialize() {

    sumNonObervable();
    System.out.println("------------------------");
    sumObservable();

    MyTask task = new MyTask();
    Timer timer = new Timer(true);

    timer.scheduleAtFixedRate(task, 1000, 1000);

    label.textProperty().bind(text);

  }

  private void sumObservable() {
    SimpleIntegerProperty a = new SimpleIntegerProperty(10);
    SimpleIntegerProperty b = new SimpleIntegerProperty(10);

    NumberBinding sum = a.add(b);

    System.out.println(sum.getValue());

    a.set(20);

    System.out.println(sum.getValue());
  }

  private void sumNonObervable() {
    int a = 10;
    int b = 10;
    int sum = a + b;

    System.out.println(sum);

    b = 20;
    System.out.println(sum);
  }

  class MyTask extends TimerTask {

    @Override
    public void run() {
      int ch = text.get().charAt(0);
      ch++;
      text.set(String.valueOf((char) ch));
    }

  }

}
