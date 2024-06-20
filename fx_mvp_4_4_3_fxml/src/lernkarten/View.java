package lernkarten;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class View {

    private Presenter presenter;

    @FXML
    private Label lblQuestion;

    @FXML
    private TextField txfSolution;

    @FXML
    private Label lblStatus;

    @FXML
    private Button btnCheck;

    @FXML
    private Button btnNext;

    public void initialize() {
        presenter = new Presenter(this);
        presenter.choose();

        btnCheck.setOnAction(e -> actionHandler(e));
        btnNext.setOnAction(e -> presenter.choose());
    }

    private void actionHandler(ActionEvent e) {
        presenter.check(lblQuestion.getText(), txfSolution.getText());
    }

    public void showNewWord(String word) {
        lblQuestion.setText(word);
        txfSolution.setText("");
    }

    public void eraseMessage() {
        lblStatus.setText("");
    }

    public void showNoInputMessage() {
        lblStatus.setText("Es wurde keine Antwort eingegeben!");
        lblStatus.setTextFill(Color.BLUEVIOLET);
    }

    public void showOKMessage() {
        lblStatus.setText("Die Antwort war richtig. Weiter so!");
        lblStatus.setTextFill(Color.GREEN);
    }

    public void showNotOkMessage() {
        lblStatus.setText("Die Antwort war falsch! Noch ein Versuch?");
        lblStatus.setTextFill(Color.RED);
    }
}
