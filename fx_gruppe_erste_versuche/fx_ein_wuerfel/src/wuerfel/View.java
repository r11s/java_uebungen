package wuerfel;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class View {

    private Presenter presenter;

    private GridPane pane = new GridPane();
    private Image[] dices;

    ImageView dice1;
    ImageView dice2;

    Button btnRollDices;

    public View() {
        presenter = new Presenter(this);
        dices = new Image[7];

        initialize();
    }

    public void initialize() {

        this.fillDices();

        pane.setMinSize(300, 200);
        pane.setHgap(40);
        pane.setVgap(50);

        pane.setStyle("-fx-background-color: #66CD00;");
        pane.setPadding(new Insets(50));
        pane.setAlignment(Pos.TOP_CENTER);

        dice1 = new ImageView();
        dice2 = new ImageView();

        setDices(0, 0);

        pane.add(dice1, 0, 0);
        pane.add(dice2, 1, 0);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        btnRollDices = new Button("Würfeln");
        btnRollDices.setPrefSize(300, 100);

        btnRollDices.setFont(Font.font(24));
        btnRollDices.setOnAction(a -> presenter.rollDices());

        hBox.getChildren().add(btnRollDices);
        pane.add(hBox, 0, 2, 2, 2);

    }

    private void fillDices() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Image("images/wuerfel_" + i + ".png");
        }
    }

    public void setDices(int i, int j) {
        this.dice1.setImage(dices[i]);
        this.dice2.setImage(dices[j]);
    }

    public Parent getRoot() {
        return pane;
    }

}
