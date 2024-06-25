package demo;

import java.util.Timer;
import java.util.TimerTask;

import javafx.beans.property.SimpleStringProperty;

public class Model {

  SimpleStringProperty textProperty = new SimpleStringProperty("A");
  private Timer timer;

  public void startTimer() {
    MyTask task = new MyTask();
    timer = new Timer(true);

    timer.scheduleAtFixedRate(task, 1000, 1000);

  }

  public SimpleStringProperty getTextProperty() {
    return textProperty;
  }

  public void stopTimer() {
    timer.cancel();
    timer.purge();
  }

  class MyTask extends TimerTask {

    @Override
    public void run() {
      char ch = textProperty.get().charAt(0);
      ch++;
      if (ch > 'Z') {
        ch = 'A';
      }
      textProperty.set(String.valueOf(ch));
    }

  }
}
