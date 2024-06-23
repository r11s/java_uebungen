package aufgabe9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
  private TextArea txtWordList;

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
    txfInput.clear();

    txtWordList.setText(model.getWordList());
    lblCount.setText(model.getWordCount());
  }

  @FXML
  void searchWord(ActionEvent event) {
    String value = txfInput.getText().trim();

    txtWordList.setText(model.searchWordList(value));

  }

  @FXML
  void showAll(ActionEvent event) {
    txtWordList.setText(model.getWordList());
  }

}
