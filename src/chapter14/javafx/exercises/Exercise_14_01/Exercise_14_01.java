/*
(Display images) Write a program that displays four images in a grid pane, as
shown in Figure 14.43a
 */
package chapter14.javafx.exercises.Exercise_14_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Exercise_14_01 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ArrayList<ImageView> imageViews = new ArrayList<>();

        imageViews.add(new ImageView(new Image("image/germany.gif")));
        imageViews.add(new ImageView(new Image("image/china.gif")));
        imageViews.add(new ImageView(new Image("image/france.bmp")));
        imageViews.add(new ImageView(new Image("image/us.gif")));


        GridPane pane = new GridPane();
        pane.add(imageViews.get(0), 0, 0);
        pane.add(imageViews.get(1), 1, 0);
        pane.add(imageViews.get(2), 0, 1);
        pane.add(imageViews.get(3), 1, 1);

        imageViews.get(2).setFitWidth(new Image("image/germany.gif").getWidth());
        imageViews.get(2).setFitHeight(100);


        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
