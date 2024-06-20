package lernkarten;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class View {

    @FXML
    private Label lblTitle;

    public void initialize() {

        System.out.println(lblTitle.getText());
    }
}
