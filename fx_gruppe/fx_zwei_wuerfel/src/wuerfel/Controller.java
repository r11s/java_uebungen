package wuerfel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Controller {

    Model model = new Model();

    @FXML
    ImageView dice1;
    @FXML
    ImageView dice2;
    @FXML
    Button btnRollDices;

    public void initialize() {

        setDicesZero();

    }

    public void setDicesZero() {
        this.dice1.setImage(model.getDiceZero());
        this.dice2.setImage(model.getDiceZero());
    }

    @FXML
    public void setDices(ActionEvent e) {
        this.dice1.setImage(model.rollDice());
        this.dice2.setImage(model.rollDice());
    }

}
