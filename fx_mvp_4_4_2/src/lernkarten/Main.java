package lernkarten;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = FXMLLoader.load(getClass().getResource("View.fxml"));

        stage.setMinWidth(root.getPrefWidth());
        stage.setMinHeight(root.getPrefHeight());

        stage.setTitle("Vokabel-Trainer");
        stage.setScene(new Scene(root));

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
