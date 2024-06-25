package demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

  @FXML
  private Button btnStart;

  @FXML
  private Button btnStop;

  @FXML
  private Text label;

  @FXML
  private TextField tf1;

  @FXML
  private TextField tf2;

  private Model model;

  // Konstruktor wird zuerst aufgerufen
  // bevor etwas initilisert wurde.
  // Damit kann z.B. ein Model zum
  // Controller hinzugefuegt werden.
  public Controller() {
    model = new Model();
  }

  // Initialize wird aufgerufen
  // nachdem die FXML-Annotations stattfanden!
  public void initialize() {

    label.textProperty().bind(model.getTextProperty());

    tf1.textProperty().bindBidirectional(tf2.textProperty());

  }

  @FXML
  void actionStart(ActionEvent event) {
    model.startTimer();
  }

  @FXML
  void actionStop(ActionEvent event) {
    model.stopTimer();
  }

}
