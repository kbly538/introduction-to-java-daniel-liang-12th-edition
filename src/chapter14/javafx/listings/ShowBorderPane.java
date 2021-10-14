/* LISTING 14.12 */
package chapter14.javafx.listings;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class ShowBorderPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane pane = new BorderPane();

        pane.setTop(new CustomPane("TOP"));
        pane.setRight(new CustomPane("RIGHT"));
        pane.setLeft(new CustomPane("LEFT"));
        pane.setBottom(new CustomPane("BOTTOM"));
        pane.setCenter(new CustomPane("CENTER"));


        Scene scene = new Scene(pane);
        stage.setTitle("Border Pane");
        stage.setScene(scene);
        stage.show();
    }

    private class CustomPane extends StackPane {
        public CustomPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: red");
            setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        }
    }
}
