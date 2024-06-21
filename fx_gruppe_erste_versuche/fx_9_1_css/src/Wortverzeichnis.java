import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Wortverzeichnis extends Application {

    @Override
    public void start(Stage stage) {

        TextField txfEingabe = new TextField();
        txfEingabe.setMaxWidth(Double.MAX_VALUE);

        VBox.setMargin(txfEingabe, new Insets(20, 0, 10, 0));

        Button btnAdd = new Button("Hinzufügen");
        btnAdd.setMaxWidth(Double.MAX_VALUE);

        Button btnSearch = new Button("Suchen");
        btnSearch.setMaxWidth(Double.MAX_VALUE);

        Button btnViewAll = new Button("Alle Anzeigen");
        btnViewAll.setMaxWidth(Double.MAX_VALUE);
        btnAdd.setMinWidth(20);

        Label lblWordCount = new Label("( 0 Worte )");
        lblWordCount.setMaxWidth(Double.MAX_VALUE);
        lblWordCount.setPadding(new Insets(5, 0, 5, 0));
        lblWordCount.setStyle("-fx-alignment: center; -fx-background-color: gold ; " +
                " -fx-border-width: 0.5 ; -fx-border-style: dotted");

        VBox.setMargin(lblWordCount, new Insets(20, 0, 0, 0));

        VBox lVBox = new VBox();
        lVBox.setMinWidth(120);
        lVBox.setMaxWidth(120);
        lVBox.setPadding(new Insets(10));
        lVBox.setSpacing(10);

        lVBox.getChildren().addAll(txfEingabe, btnAdd, btnSearch, btnViewAll, lblWordCount);

        ListView<String> lviWorte = new ListView<>();
        lviWorte.getItems().add("Hallo Welt!");

        VBox rVBox = new VBox();
        rVBox.getChildren().add(lviWorte);
        rVBox.setPadding(new Insets(10));

        HBox root = new HBox();
        root.getChildren().addAll(lVBox, rVBox);
        root.setAlignment(Pos.CENTER);

        HBox.setHgrow(rVBox, Priority.ALWAYS);
        VBox.setVgrow(lviWorte, Priority.ALWAYS);

        Scene scene = new Scene(root);

        stage.setMinWidth(300);
        stage.setMinHeight(480);
        stage.setTitle("Aufgabe 9.1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
