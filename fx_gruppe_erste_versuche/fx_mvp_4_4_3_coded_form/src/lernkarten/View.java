package lernkarten;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class View {

    private Presenter presenter;

    private GridPane pane = new GridPane();

    private Label lblTitle = new Label("Bitte übersetzen Sie:");

    private Label lblQuestion = new Label("Hello");
    private TextField txfSolution = new TextField("Hallo");

    private HBox hbxButtons = new HBox();
    private Button btnCheck = new Button("Überprüfen");
    private Button btnNext = new Button("Weiter");

    private Label lblStatus = new Label("Status:");

    public View(Presenter presenter) {
        this.presenter = presenter;
        initialize();
    }

    public void initialize() {

        // GridPane
        pane.setPadding(new Insets(10, 12, 10, 12));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setMinSize(500, 250);
        ColumnConstraints c0 = new ColumnConstraints();
        c0.setHgrow(Priority.NEVER);
        c0.setMinWidth(120);
        c0.setPrefWidth(120);
        ColumnConstraints c1 = new ColumnConstraints();
        c1.setHgrow(Priority.ALWAYS);
        pane.getColumnConstraints().addAll(c0, c1);

        RowConstraints r0 = new RowConstraints();
        RowConstraints r1 = new RowConstraints();
        RowConstraints r2 = new RowConstraints();
        r2.setVgrow(Priority.ALWAYS);
        RowConstraints r3 = new RowConstraints();

        pane.getRowConstraints().addAll(r0, r1, r2, r3);

        // Controls
        lblTitle.setFont(Font.font(18));

        // add(Knoten, Spalte, Zeile, Spaltenweite, Zeilenweite)
        pane.add(lblTitle, 0, 0, 2, 1);

        lblQuestion.setFont(Font.font("Helvetica", FontWeight.BOLD, 15));
        lblQuestion.setTextFill(Color.NAVY);
        lblQuestion.setPrefSize(120, 26);
        lblQuestion.setStyle("-fx-border-color: ORANGE");
        pane.add(lblQuestion, 0, 1, 1, 1);

        txfSolution.setFont(Font.font(13));
        txfSolution.prefWidth(200);
        pane.add(txfSolution, 1, 1, 1, 1);

        hbxButtons.setSpacing(8);
        hbxButtons.setAlignment(Pos.CENTER_LEFT);
        hbxButtons.setPrefSize(200, 100);
        hbxButtons.setMinWidth(200);
        hbxButtons.setAlignment(Pos.BOTTOM_RIGHT);

        btnCheck.setPrefSize(88, 26);
        btnNext.setPrefSize(63, 26);

        hbxButtons.getChildren().addAll(btnCheck, btnNext);
        pane.add(hbxButtons, 0, 2, 2, 1);

        HBox hbxStatus = new HBox();
        hbxStatus.getChildren().add(lblStatus);
        HBox.setMargin(lblStatus, new Insets(0, 0, 0, 10));
        pane.add(hbxStatus, 0, 3, 2, 1);

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

    public Parent getRoot() {
        return pane;
    }
}
