import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Ein erstes Beispiel
 */
public class FX_41 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label lb1 = new Label("Hallo");
        Label lb2 = new Label("Welt");

        VBox vBox = new VBox();

        vBox.getChildren().addAll(lb1, lb2);

        Scene scene = new Scene(vBox, 300, 300);

        stage.setScene(scene);
        stage.setTitle("Hallo");
        stage.show();

        stage.show();
    }

}
