package pacman;

import java.util.Timer;
import java.util.TimerTask;

import javafx.beans.property.SimpleDoubleProperty;

public class Model {

  private double offset = 30;
  private double step = 0;
  private double right = 0;
  private double left = 0;

  private SimpleDoubleProperty xProp = new SimpleDoubleProperty(offset);
  private SimpleDoubleProperty yProp = new SimpleDoubleProperty(offset);
  private SimpleDoubleProperty angleProp = new SimpleDoubleProperty(15);
  private SimpleDoubleProperty lengthProp = new SimpleDoubleProperty(330);

  private Timer timer;

  public void setRight(double x) {
    right = x - offset;
  }

  public void setLeft(double x) {
    left = x + offset;
  }

  public void startTimer() {
    MyTask task = new MyTask();
    timer = new Timer(true);

    timer.scheduleAtFixedRate(task, 200, 200);

  }

  public void stopTimer() {
    timer.cancel();
    timer.purge();
  }

  class MyTask extends TimerTask {

    @Override
    public void run() {
      double x = xProp.get();
      double nx = x + step;

      if (nx < right && nx > left) {
        xProp.set(nx);
      } else if (nx < left) {
        xProp.set(left);
        step = -step;
        angleProp.set(15);
      } else {
        xProp.set(right + 1);
        step = -step;
        angleProp.set(195);
      }
      openClose();
    }

    private void openClose() {
      double mouth = angleProp.get();

      if (mouth == 15) {
        angleProp.set(45);
        lengthProp.set(270);
        return;
      }

      if (mouth == 45) {
        angleProp.set(15);
        lengthProp.set(330);
        return;
      }

      if (mouth == 195) {
        angleProp.set(225);
        lengthProp.set(270);
        return;
      }

      if (mouth == 225) {
        angleProp.set(195);
        lengthProp.set(330);
        return;
      }

      if (mouth == 15) {
        angleProp.set(45);
        lengthProp.set(270);
        return;
      }

    }

  }

  public SimpleDoubleProperty getX() {
    return xProp;
  }

  public SimpleDoubleProperty getY() {
    return yProp;
  }

  public void setStep(double s) {
    step = s;
  }

  public SimpleDoubleProperty getAngle() {
    return angleProp;
  }

  public SimpleDoubleProperty getLength() {
    return lengthProp;
  }
}
