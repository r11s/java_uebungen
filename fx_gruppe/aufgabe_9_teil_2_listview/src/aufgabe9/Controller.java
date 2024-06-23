package aufgabe9;

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
  private ListView<String> lvwWordList;

  public void initialize() {
    this.model = new Model();

    lvwWordList.setItems(model.getWordList());
    lblCount.setText(model.getWordCount());
  }

  @FXML
  void addWord(ActionEvent event) {
    String value = txfInput.getText().trim();
    if (value.isEmpty()) {
      return;
    }
    lvwWordList.setItems(model.getWordList());
    model.addWord(value);
    lblCount.setText(model.getWordCount());
    txfInput.clear();
    lblCount.setText(model.getWordCount());
  }

  @FXML
  void searchWord(ActionEvent event) {
    String value = txfInput.getText().trim();

    lvwWordList.setItems(model.getSearchList(value));

    lblCount.setText(model.getGefundenCount());
  }

  @FXML
  void showAll(ActionEvent event) {
    lvwWordList.setItems(model.getWordList());
  }

}
