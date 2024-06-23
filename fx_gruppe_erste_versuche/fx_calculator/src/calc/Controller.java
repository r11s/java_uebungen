package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

  Model model = new Model();

  String operator = "";
  long num1 = 0;

  @FXML
  private Text output;

  @FXML
  private Button btnReset;

  private boolean endCalculation = false;

  @FXML
  void processNumpad(ActionEvent event) {
    if (endCalculation) {
      output.setText("");
      endCalculation = false;
    }
    String value = ((Button) event.getSource()).getText();
    System.out.println(value);
    output.setText(output.getText() + value);
  }

  @FXML
  void processOperator(ActionEvent event) {
    String value = ((Button) event.getSource()).getText();

    if (!"=".equals(value)) {
      if (value.isEmpty()) {
        return;
      }

      operator = value;
      num1 = Long.parseLong(output.getText());
      System.out.println(num1);

      output.setText("");

    } else {
      if (operator.isEmpty()) {
        return;
      }

      output.setText(model.calculate(num1, Long.parseLong(output.getText()), operator));
      operator = "";
      endCalculation = true;
    }
  }

  @FXML
  void processReset(ActionEvent event) {
    output.setText("");
  }
}
