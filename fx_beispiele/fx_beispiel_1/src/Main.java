import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private int count = 0;

    @Override
    public void start(Stage stage) {

        // Controls
        Button button1 = new Button("Klick mich!");
        button1.setPrefWidth(100);

        Button button2 = new Button("Ausgang");
        button2.setPrefWidth(100);

        // Container
        VBox vBox = new VBox();

        // HBox vBox = new HBox(); // wie VBox aber horizontal

        // vBox.setPrefWidth(600.0);
        // vBox.setPrefHeight(400.0);

        // Alignment <=> Ausrichtung
        // vBox.setAlignment(Pos.TOP_LEFT);
        vBox.setAlignment(Pos.CENTER);

        // Innerer Rand der v-Box
        vBox.setPadding(new Insets(50, 50, 50, 50));
        // top, right, bottom, left <-> Nord, Ost, Süd, West <-> NOSW

        vBox.setSpacing(20);

        vBox.getChildren().addAll(button1, button2);

        // Äusserer Rand der Buttons
        // VBox.setMargin(button1, new Insets(0, 0, 15, 0));
        // VBox.setMargin(button2, new Insets(15, 0, 0, 0));

        button1.setOnAction(e -> {
            ++count;
            button1.setText(Integer.toString(count));
        });

        button2.setOnAction(e -> {
            Platform.exit(); // Beenden
            // stage.close(); // Stage schliessen
        });

        // button1.setOnAction(new EventHandler<ActionEvent>() {
        // @Override
        // public void handle(ActionEvent e) {
        // ++count;
        // button1.setText(Integer.toString(count));
        // }
        // });

        // button2.setOnAction(new EventHandler<ActionEvent>() {
        // @Override
        // public void handle(ActionEvent e) {
        // ++count;
        // stage.close();
        // }
        // });

        Scene root = new Scene(vBox);
        stage.setTitle("Beispiel 1");
        stage.setScene(root);

        // stage.setMinWidth(500.0);
        // stage.setMaxWidth(700.0);
        // stage.setMinHeight(300.0);

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}