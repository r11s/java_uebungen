package demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

        Scene scene = new Scene(root);

        stage.setMinWidth(220);
        stage.setMinHeight(200);

        stage.setTitle("Observable Demo 1");
        stage.setScene(scene);
        stage.show();

    }

}
