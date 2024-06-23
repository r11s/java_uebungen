package wuerfel;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Controller {

    Model model = new Model();

    private GridPane pane = new GridPane();

    ImageView dice1;
    ImageView dice2;

    Button btnRollDices;

    public Controller() {
        initialize();

        setDicesZero();
    }

    // Der View wird hier programmiert
    public void initialize() {

        pane.setMinSize(300, 200);
        pane.setHgap(40);
        pane.setVgap(50);

        pane.setStyle("-fx-background-color: #66CD00;");
        // pane.setStyle("-fx-background-color: LAVENDER;");
        pane.setPadding(new Insets(50));
        pane.setAlignment(Pos.TOP_CENTER);

        dice1 = new ImageView();
        dice2 = new ImageView();

        pane.add(dice1, 0, 0);
        pane.add(dice2, 1, 0);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        btnRollDices = new Button("Würfeln");
        btnRollDices.setPrefSize(300, 100);

        btnRollDices.setFont(Font.font(24));
        btnRollDices.setOnAction(a -> this.setDices());

        hBox.getChildren().add(btnRollDices);
        pane.add(hBox, 0, 2, 2, 2);

    }

    // steuert den View
    public void setDicesZero() {
        this.dice1.setImage(model.getDiceZero());
        this.dice2.setImage(model.getDiceZero());
    }

    public void setDices() {
        this.dice1.setImage(model.rollDice());
        this.dice2.setImage(model.rollDice());
    }

    public Parent getRoot() {
        return pane;
    }

}
