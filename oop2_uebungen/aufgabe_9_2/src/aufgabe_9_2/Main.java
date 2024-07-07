package aufgabe_9_2;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage stage) throws Exception {

    HBox hBox = new HBox();
    hBox.setPrefWidth(500);
    hBox.setAlignment(Pos.CENTER);

    hBox.setPadding(new Insets(10));
    hBox.setSpacing(10);

    HBox.setHgrow(hBox, Priority.ALWAYS);

    VBox vBox = new VBox();
    vBox.setMinWidth(140);
    vBox.setPrefWidth(140);
    vBox.setMaxWidth(140);
    vBox.setSpacing(10);
    vBox.setAlignment(Pos.CENTER);

    TextField textField = new TextField();
    textField.setMaxWidth(Double.MAX_VALUE);
    VBox.setMargin(textField, new Insets(0, 0, 10, 0));

    Button addItem = new Button("Add Item");
    addItem.setMaxWidth(Double.MAX_VALUE);

    Button search = new Button("Search");
    search.setMaxWidth(Double.MAX_VALUE);

    Button viewAll = new Button("View All");
    viewAll.setMaxWidth(Double.MAX_VALUE);

    Label count = new Label("(0 Wörter)");
    count.setMaxWidth(Double.MAX_VALUE);
    count.setAlignment(Pos.CENTER);
    VBox.setMargin(count, new Insets(10, 0, 0, 0));

    vBox.setMinWidth(vBox.getPrefWidth());

    vBox.getChildren().addAll(textField, addItem, search, viewAll, count);

    Line line = new Line();
    line.setStartX(0);
    line.setStartY(0);
    line.setEndX(0);
    line.setStrokeWidth(2);
    line.endYProperty().bind(vBox.heightProperty());
    HBox.setMargin(line, new Insets(5, 10, 5, 10));
    line.setStroke(Color.GAINSBORO);

    TextArea words = new TextArea();
    TextArea allWords = new TextArea();

    HBox.setHgrow(words, Priority.ALWAYS);

    addItem.setOnAction(e -> {
      String newWord = textField.getText().trim();
      if (newWord.length() > 0) {
        words.setText(words.getText() + "\n" + newWord);

      }
      textField.setText("");
    });

    search.setOnAction(e -> {
      String searchWord = textField.getText().trim();
      String s = allWords.getText();

      if (s.indexOf(searchWord, 0) < 0) {
        searchWord = "";
      }
      words.setText(searchWord);
    });

    viewAll.setOnAction(e -> {
      words.setText(allWords.getText());
    });

    hBox.getChildren().addAll(vBox, line, words);

    Scene scene = new Scene(hBox);

    stage.setTitle("Fehlertolerantes suchen in einem Wortverzeichnis");
    stage.setScene(scene);
    stage.show();

    String s = "Vielfalt, Schritt, Schrei, Eigentum, "
        + "Sammlung, Medaillon, Anforderung, Schwester, Sonne , Physik";
    String t = s.replaceAll(" ", "").replaceAll(",", "\n");
    words.setText(t);
    allWords.setText(t);

  }

  public static void main(String[] args) {
    launch(args);
  }

}
