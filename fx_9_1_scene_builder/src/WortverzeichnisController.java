
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WortverzeichnisController {

  @FXML
  private TextField txtEingabe;

  @FXML
  private Label lblCount;

  public void initialize() {

    System.out.println("Hallo");
    System.out.println(lblCount);

    txtEingabe.setText("");
    lblCount.setText("(" + 0 + ")");

  }

}