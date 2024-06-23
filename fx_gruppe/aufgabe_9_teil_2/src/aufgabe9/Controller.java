package aufgabe9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

  Model model;

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

  public void initialize() {
    this.model = new Model();

  }

  @FXML
  void addWord(ActionEvent event) {
    String value = txfInput.getText().trim();
    if (value.isEmpty()) {
      return;
    }

    model.addWord(value);
    // System.out.println(model.getWordList());

    lvWordList.setItems(model.getItems());

  }

  @FXML
  void searchWord(ActionEvent event) {
    String value = txfInput.getText().trim();
    if (value.isEmpty()) {
      return;
    }

    System.out.println(value);

  }

  @FXML
  void showAll(ActionEvent event) {
    lvWordList.setItems(model.getItems());
  }

}
