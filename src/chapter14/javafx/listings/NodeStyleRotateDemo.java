/* LISTING 14.7 */
package chapter14.javafx.listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        StackPane pane = new StackPane();
        Button btOk = new Button("OK");
        btOk.setStyle("-fx-border-color: blue;");
        pane.getChildren().add(btOk);

        pane.setRotate(45);
        pane.setStyle(
                "-fx-border-color: red; -fx-background-color: lightgray; ");


        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("NodeStyleRotate");
        stage.setScene(scene);
        stage.show();
    }
}
