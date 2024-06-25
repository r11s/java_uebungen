package wuerfel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private Button btnRoll;

    @FXML
    private ImageView diceOne;

    @FXML
    private ImageView diceTwo;

    private Model model;

    public Controller() {
        this.model = new Model();
    }

    @FXML
    void rollButton(ActionEvent event) {
        diceOne.setImage(model.rollDice());
        diceTwo.setImage(model.rollDice());
    }

}
