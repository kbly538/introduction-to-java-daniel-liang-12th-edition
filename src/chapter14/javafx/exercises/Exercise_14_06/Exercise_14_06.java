/*
(Game: display a checkerboard) Write a program that displays a checkerboard
in which each white and black cell is a Rectangle with a fill color black or
white, as shown in Figure 14.44c.
 */
package chapter14.javafx.exercises.Exercise_14_06;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_14_06 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);


        Color cellColor = Color.WHITE;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cellColor = (cellColor == Color.BLACK ? Color.WHITE : Color.BLACK);
                Rectangle r = new Rectangle(0, 0, 240 / 8, 240 / 8);
                r.setFill(cellColor);
                pane.add(r, i, j);
            }
            cellColor = (cellColor == Color.BLACK ? Color.WHITE : Color.BLACK);
        }

        Scene scene = new Scene(pane, 240, 240);
        stage.setTitle("Checker Board");
        stage.setScene(scene);
        stage.show();
    }
}
