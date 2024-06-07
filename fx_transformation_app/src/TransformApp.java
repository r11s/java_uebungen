import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TransformApp extends Application {

    private Parent createContent() {
        Rectangle box = new Rectangle(100, 50, Color.PINK);

        transform(box);

        return new Pane(box);
    }

    private void transform(Rectangle box) {
        box.setTranslateX(100);
        box.setTranslateY(200);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent(), 300, 300, Color.LIGHTGOLDENRODYELLOW));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
