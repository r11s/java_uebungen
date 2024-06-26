package pacman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;

public class Controller {

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

    model.setRight(maze.getPrefWidth());
    model.setLeft(0);
    model.setStep(maze.getPrefWidth() / 30);
    pacman.centerXProperty().bind(model.getX());
    pacman.centerYProperty().bind(model.getY());
    pacman.startAngleProperty().bind(model.getAngle());
    pacman.lengthProperty().bind(model.getLength());
  }

  @FXML
  private Pane maze;

  @FXML
  private Arc pacman;

  @FXML
  void onActionPlay(ActionEvent event) {
    model.startTimer();
  }

  @FXML
  void onActionStop(ActionEvent event) {
    model.stopTimer();
  }

  @FXML
  void onKeyPressed(KeyEvent event) {

  }

  @FXML
  void onKeyReleased(KeyEvent event) {

  }

  @FXML
  void onKeyTyped(KeyEvent event) {

  }

}
