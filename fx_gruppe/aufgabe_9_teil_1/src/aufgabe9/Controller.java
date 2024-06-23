package aufgabe9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

  @FXML
  private Button btnAddItem;

  @FXML
  private Button btnSearch;

  @FXML
  private Button btnViewAll;

  @FXML
  private Label lblCount;

  @FXML
  private TextField txfInput;

  @FXML
  private ListView<String> lvWordList;

  @FXML
  void addWord(ActionEvent event) {
    String value = ((Button) event.getSource()).getText();
    System.out.println(value);
    System.out.println(txfInput.getText());

  }

  @FXML
  void searchWord(ActionEvent event) {
    String value = ((Button) event.getSource()).getText();
    System.out.println(value);
    System.out.println(txfInput.getText());

  }

  @FXML
  void showAll(ActionEvent event) {
    String value = ((Button) event.getSource()).getText();
    System.out.println(value);
  }

}
