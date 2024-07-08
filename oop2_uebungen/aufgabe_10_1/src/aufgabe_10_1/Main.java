package aufgabe_10_1;

import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage stage) throws Exception {

    Model model = new Model();

    // Main-Container
    BorderPane borderPane = new BorderPane();

    // Image-Container
    ImagePanel imagePanel = new ImagePanel();

    // Button-Container
    ButtonBox buttonBox = new ButtonBox(stage, imagePanel);
    buttonBox.addModel(model);

    borderPane.setCenter(imagePanel);
    borderPane.setRight(buttonBox);

    Scene scene = new Scene(borderPane);

    scene.widthProperty().addListener((observable, oldValue, newValue) -> {
      double width = (newValue.doubleValue() - 150.0) * 0.9;
      imagePanel.setFitWidth(width);
    });

    stage.setTitle("Bildbetrachter");
    stage.setWidth(800);
    stage.setHeight(800);
    stage.setScene(scene);

    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
