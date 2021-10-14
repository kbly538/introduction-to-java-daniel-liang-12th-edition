/*
(Display three cards) Write a program that displays three cards randomly
selected from a deck of 52, as shown in Figure 14.43c. The card image files are
named 1.png, 2.png, . . . , 52.png and stored in the image/card directory. All
three cards are distinct and selected randomly. (Hint: You can select random
cards by storing the numbers 1–52 to an array list, perform a random shuffle
introduced in Section 11.12, and use the first three numbers in the array list as
the file names for the image.)
 */
package chapter14.javafx.exercises.Exercise_14_03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Exercise_14_03 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FlowPane pane = new FlowPane();
        pane.setHgap(5);
        pane.setPadding(new Insets(5, 5, 5, 5));

        for (int i = 0; i < 3; i++) {
            int randomCard = 1 + (int) (Math.random() * 52);
            Image card = new Image("image/card/" + (int) randomCard + ".png");
            ImageView cardView = new ImageView(card);
            pane.getChildren().add(cardView);

        }

        Scene scene = new Scene(pane, new Image("image/card/1.png").getWidth() * 3 + 20, 105);
        stage.setTitle("3 Random Cards");
        stage.setScene(scene);
        stage.show();

    }
}
