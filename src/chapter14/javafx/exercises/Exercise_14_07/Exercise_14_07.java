/*
(Display random 0 or 1) Write a program that displays a 10-by-10 square matrix,
as shown in Figure 14.45a. Each element in the matrix is 0 or 1, randomly generated.
Display each number centered in a text field. Use TextField’s setText
method to set value 0 or 1 as a string.
 */
package chapter14.javafx.exercises.Exercise_14_07;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_14_07 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField r = new TextField();
                r.setText((int) (Math.random() * 2) + "");
                pane.add(r, i, j);
            }
        }

        Scene scene = new Scene(pane, 270, 270);
        stage.setTitle("10x10 Matrix");
        stage.setScene(scene);
        stage.show();
    }
}
