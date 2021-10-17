/*
(Display 54 cards) Expand Exercise 14.3 to display all 54 cards (including two
jokers), nine per row. The image files are jokers and are named 53.png and 54.png.
 */
package chapter14.javafx.exercises.Exercise_14_08;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exercise_14_08 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));


        int cardNum = 1;
        int posX = 5;
        int posY = 5;
        for (int i = 0; i < 6; i++) {
            posX = 5;
            for (int j = 0; j < 9; j++) {
                Image card = new Image("image/card/" + cardNum + ".png");
                ImageView cardView = new ImageView(card);
                cardView.setX(posX + card.getWidth() * j);
                cardView.setY(posY);
                pane.getChildren().add(cardView);
                cardNum++;
                posX += 10;
            }

            posY += new Image("image/card/1.png").getHeight();
            posY += 10;


        }

        Scene scene = new Scene(pane, new Image("image/card/1.png").getWidth() * 9 + 90, new Image("image/card/1.png").getHeight() * 6 + 60);
        stage.setTitle("Deck of Cards");
        stage.setScene(scene);
        stage.show();

    }
}
