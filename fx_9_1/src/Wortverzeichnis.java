import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Wortverzeichnis extends Application {

    @Override
    public void start(Stage stage) {

        // Elemente in der VBox links
        TextField txtEingabe = new TextField("Dummy Eingabe");

        Button btnAdd = new Button("Wort hinzufügen");

        btnAdd.setOnAction(e -> System.out.println(e));

        Button btnSearch = new Button("Wort suchen");
        Button btnViewAll = new Button("Alle anzeigen");

        Label lblCount = new Label("Dummy Label");

        VBox vBoxLinks = new VBox();
        vBoxLinks.getChildren().addAll(
                txtEingabe,
                btnAdd,
                btnSearch,
                btnViewAll,
                lblCount);

        ListView lsvWorte = new ListView<>();

        // Elemente in der HBox
        HBox root = new HBox();
        root.getChildren().add(vBoxLinks);
        root.getChildren().add(lsvWorte);

        Scene scene = new Scene(root);

        stage.setTitle("Aufgabe 9.1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
