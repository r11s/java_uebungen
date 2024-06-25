package wuerfel;

import javafx.scene.image.Image;

public class Model {

  private Image[] dices = new Image[7];

  public Model() {
    fillDices();
  }

  public Image rollDice() {

    return dices[(int) Math.floor(Math.random() * 6 + 1.0)];

  }

  private void fillDices() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = new Image("images/wuerfel_" + i + ".png");
    }
  }

}
