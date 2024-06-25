package demo;

import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

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

}
