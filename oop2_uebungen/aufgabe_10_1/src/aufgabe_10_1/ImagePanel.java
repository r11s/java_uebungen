package aufgabe_10_1;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class ImagePanel extends StackPane {

  private ImageView imageView = new ImageView();

  public ImagePanel() {

    this.setPadding(new Insets(10));

    this.imageView.setPreserveRatio(true);

    this.getChildren().addAll(imageView);

  }

  public void setImage(Image image) {

    this.imageView.setImage(image);
  }

  public void setFitWidth(double width) {
    this.imageView.setFitWidth(width);
  }

}
