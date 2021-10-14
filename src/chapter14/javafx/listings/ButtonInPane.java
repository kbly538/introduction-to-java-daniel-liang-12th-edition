/* LISTING 14.3 */
package chapter14.javafx.listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    public void start(Stage stage) throws Exception {

        StackPane pane = new StackPane();
        Button btn = new Button("OK");
        pane.getChildren().add(btn);
        Scene scene = new Scene(pane, 200, 50);
        stage.setTitle("Button In Pane");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
