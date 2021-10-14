/* LISTING 14.1 */
package chapter14.javafx.listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 250, 250);
        primaryStage.setTitle("JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
