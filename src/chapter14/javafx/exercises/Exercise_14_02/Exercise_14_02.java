/*
(Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as
shown in Figure 14.43b. A cell may be X, O, or empty. What to display
at each cell is randomly decided. The X and O are the image files x.gif
and o.gif.
 */
package chapter14.javafx.exercises.Exercise_14_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class
Exercise_14_02 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Image imageX = new Image("image/x.gif");
        Image imageO = new Image("image/o.gif");
        Image[] images = new Image[3];
        images[0] = imageX;
        images[1] = imageO;

        GridPane pane = new GridPane();


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int randomNum = (int) (Math.random() * 3);
                pane.add(new ImageView(images[randomNum]), i, j);
            }
        }

        Scene scene = new Scene(pane, imageX.getWidth() * 3, imageX.getHeight() * 3);
        stage.setScene(scene);
        stage.show();
    }
}
