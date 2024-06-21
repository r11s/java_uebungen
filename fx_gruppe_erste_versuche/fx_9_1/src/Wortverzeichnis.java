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
        TextField txtEingabe = new TextField("");
        txtEingabe.setMaxWidth(Double.MAX_VALUE);
        txtEingabe.setMinWidth(Double.MIN_VALUE);

        Button btnAdd = new Button("Wort hinzufügen");
        btnAdd.setMaxWidth(Double.MAX_VALUE);
        btnAdd.setMinWidth(Double.MIN_VALUE);

        btnAdd.setOnAction(e -> System.out.println(e));

        Button btnSearch = new Button("Wort suchen");
        btnSearch.setMaxWidth(Double.MAX_VALUE);
        btnSearch.setMinWidth(Double.MIN_VALUE);

        Button btnViewAll = new Button("Alle anzeigen");
        btnViewAll.setMaxWidth(Double.MAX_VALUE);
        btnViewAll.setMinWidth(Double.MIN_VALUE);

        Label lblCount = new Label("(0)");

        VBox vBoxLinks = new VBox();

        vBoxLinks.setAlignment(Pos.CENTER);
        vBoxLinks.setSpacing(20);

        vBoxLinks.setPadding(new Insets(5));

        vBoxLinks.setPadding(new Insets(40, 0, 40, 0));

        vBoxLinks.getChildren().addAll(
                txtEingabe,
                btnAdd,
                btnSearch,
                btnViewAll,
                lblCount);

        ListView lsvWorte = new ListView<>();

        // Elemente in der HBox
        HBox root = new HBox();

        root.setFillHeight(false);
        root.setSpacing(24);
        root.setPadding(new Insets(20));

        root.getChildren().add(vBoxLinks);
        root.getChildren().add(lsvWorte);

        Scene scene = new Scene(root);

        stage.setTitle("Aufgabe 9.1 ohne SceneBuilder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
