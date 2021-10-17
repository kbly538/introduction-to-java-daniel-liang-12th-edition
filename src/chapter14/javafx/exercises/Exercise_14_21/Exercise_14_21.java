/*
(Two circles and their distance) Write a program that draws two circles with
radius 15 pixels, centered at random locations, with a line connecting the two
circles. The distance between the two centers is displayed on the line, as shown
in Figure 14.49b.
 */
package chapter14.javafx.exercises.Exercise_14_21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_21 extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        double paneWidth = 500;
        double paneHeight = 500;

        double circleRadius = 15;

        double c1CenterX = Math.random() * (paneWidth - 30);
        double c1CenterY = Math.random() * (paneWidth - 30);
        double c2CenterX = Math.random() * (paneWidth - 30);
        double c2CenterY = Math.random() * (paneWidth - 30);

        double xDistance = c1CenterX - c2CenterX;
        double yDistance = c1CenterY - c2CenterY;
        double distance = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        System.out.println(distance);


        System.out.println(xDistance + " " + yDistance);

        Circle c1 = new Circle(c1CenterX, c1CenterY, circleRadius);
        Circle c2 = new Circle(c2CenterX, c2CenterY, circleRadius);
        Line link = new Line(c1CenterX, c1CenterY, c2CenterX, c2CenterY);
        Text distanceLabel = new Text(distance + "");

        double offset = 20;

        if (c1CenterX < c2CenterX) {
            distanceLabel.setX(Math.abs(c1CenterX - c2CenterX) / 2 + c1CenterX + offset);
        } else {
            distanceLabel.setX(Math.abs(c1CenterX - c2CenterX) / 2 + c2CenterX + offset);
        }
        if (c1CenterY < c2CenterY) {
            distanceLabel.setY(Math.abs(c1CenterY - c2CenterY) / 2 + c1CenterY);
        } else {
            distanceLabel.setY(Math.abs(c1CenterY - c2CenterY) / 2 + c2CenterY);

        }

        Pane pane = new Pane();
        pane.getChildren().addAll(link, c1, c2, distanceLabel);

        Scene scene = new Scene(pane, paneWidth, paneHeight);
        stage.setScene(scene);
        stage.show();

    }
}
