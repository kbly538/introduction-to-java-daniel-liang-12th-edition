/* LISTING 14.2 */
package chapter14.javafx.listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new Button("OK"), 200, 250);
        stage.setTitle("MyJvaFx");
        stage.setScene(scene);
        stage.show();

        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Secondary Stage");
        secondaryStage.setScene(new Scene(new Button("OK2"), 200, 250));
        secondaryStage.show();
    }
}
