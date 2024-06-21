package lernkarten;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

        Model model = new Model();
        Presenter presenter = new Presenter(model);

        View view = new View(presenter);
        presenter.addView(view);
        presenter.choose();

        Scene scene = new Scene(view.getRoot());

        stage.setTitle("Lernkarten");
        stage.setScene(scene);
        stage.show();

    }

}
