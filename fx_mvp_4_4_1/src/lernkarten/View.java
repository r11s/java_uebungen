package lernkarten;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class View {

    @FXML
    private Label label;

    public void initialize() {

        label.setText("(" + 0 + ")");
        System.out.println("Hallo");
    }
}
