/*
(Draw an arrow line) Write a static method that draws an arrow line from a
starting
point to an ending point in a pane using the following method header:
public static void drawArrowLine(double startX, double startY,
double endX, double endY, Pane pane)
Write a test program that randomly draws an arrow line, as shown in Figure 14.49a.
 */
package chapter14.javafx.exercises.Exercise_14_20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_20 extends Application {
    public static void drawArrowLine(double startX, double startY,
                                     double endX, double endY, Pane pane) {

        pane.getChildren().add(new Line(startX, startY, endX, endY));
        // find slope of this line
        double slope = ((((double) startY) - (double) endY))
                / (((double) startX) - (((double) endX)));

        double arctan = Math.atan(slope);

        // This will flip the arrow 45 off of a
        // perpendicular line at pt x2
        double set45 = 1.57 / 2;

        // arrows should always point towards i, not i+1
        if (startX < endX) {
            // add 90 degrees to arrow lines
            set45 = -1.57 * 1.5;
        }

        // set length of arrows
        int arrlen = 15;

        // draw arrows on line
        pane.getChildren().add(new Line(endX, endY, (endX + (Math.cos(arctan + set45) * arrlen)),
                ((endY)) + (Math.sin(arctan + set45) * arrlen)));

        pane.getChildren().add(new Line(endX, endY, (endX + (Math.cos(arctan - set45) * arrlen)),
                ((endY)) + (Math.sin(arctan - set45) * arrlen)));


    }

    @Override
    public void start(Stage stage) throws Exception {

        Pane pane = new Pane();

        double paneWidth = 300;
        double paneHeight = 300;

        double randomStartX = Math.random() * (paneWidth - 20);
        double randomStartY = Math.random() * (paneWidth - 20);
        double randomEndX = Math.random() * (paneWidth - 20);
        double randomEndY = Math.random() * (paneWidth - 20);

        drawArrowLine(randomStartX, randomStartY, randomEndX, randomEndY, pane);

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();

    }
}
