import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {

    private int count = 0;

    @Override
    public void start(Stage stage) {

        // Controls
        Button button1 = new Button("Klick mich!");
        button1.setPrefWidth(100);
        button1.setTooltip(new Tooltip("Hallo, Du kannst mich klicken!"));

        Button button2 = new Button("Ausgang");
        button2.setPrefWidth(100);

        button2.setRotate(-15);

        VBox vBox = new VBox();

        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(50, 50, 50, 50));
        vBox.setSpacing(20);
        vBox.getChildren().addAll(button1, button2);

        button1.setOnAction(e -> {
            ++count;
            button1.setText(String.valueOf(count));
            // FileChooser fileChooser = new FileChooser();
            // fileChooser.showOpenDialog(stage);

            // Dialog dialog = new Dialog<String>();
            // dialog.setContentText("Hallo wie geht es?");

            // dialog.show();

        });

        button2.setOnAction(e -> {
            Platform.exit(); // Beenden
        });

        Scene root = new Scene(vBox);
        stage.setTitle("Beispiel 2");
        stage.setScene(root);

        stage.show();

    }

    @Override
    public void init() throws Exception {
        System.out.println("init ...");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop ...");
        ;
    }

    public static void main(String[] args) {
        launch(args);
    }
}