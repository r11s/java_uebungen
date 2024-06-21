package wuerfel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        View view = new View();

        Scene scene = new Scene(view.getRoot());

        stage.setTitle("Zwei Würfel");
        stage.setScene(scene);
        stage.show();

    }

}
