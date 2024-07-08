package aufgabe_10_1;

import java.io.File;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class ButtonBox extends VBox {

  Button start = new Button("|<");
  Button back = new Button("<");
  Button forward = new Button(">");
  Button end = new Button(">|");
  Button open = new Button("Open");

  private Model model;

  // Verzeichnis suchen und oeffnen
  DirectoryChooser directoryChooser = new DirectoryChooser();

  public ButtonBox(Stage stage, ImagePanel imagePanel) {

    this.setPadding(new Insets(20));
    this.setSpacing(10);

    start.setMaxWidth(Double.MAX_VALUE);
    back.setMaxWidth(Double.MAX_VALUE);
    forward.setMaxWidth(Double.MAX_VALUE);
    end.setMaxWidth(Double.MAX_VALUE);
    open.setMaxWidth(Double.MAX_VALUE);

    VBox.setMargin(open, new Insets(50, 0, 0, 0));

    directoryChooser.setTitle("Bildverzeichnis wählen");

    open.setOnAction(e -> {
      File dir = directoryChooser.showDialog(stage);
      if (dir != null) {
        model.setImageList(dir);
      }
      Image image = model.getFirstImage();
      if (image != null) {
        imagePanel.setImage(image);
      }

    });

    start.setOnAction(e -> {
      Image image = model.getFirstImage();
      if (image != null) {
        imagePanel.setImage(image);
      }
    });

    back.setOnAction(e -> {
      Image image = model.getPreviousImage();
      if (image != null) {
        imagePanel.setImage(image);
      }
    });

    forward.setOnAction(e -> {
      Image image = model.getNextImage();
      if (image != null) {
        imagePanel.setImage(image);
      }
    });

    end.setOnAction(e -> {
      Image image = model.getLastImage();
      if (image != null) {
        imagePanel.setImage(image);
      }
    });

    this.getChildren().addAll(start, back, forward, end, open);

  }

  public void addModel(Model model) {
    this.model = model;
  }

}
