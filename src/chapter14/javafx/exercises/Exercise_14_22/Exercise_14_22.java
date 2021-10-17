/*
(Connect two circles) Write a program that draws two filled circles with radius
15 pixels, centered at random locations, with a line connecting the two circles.
The line should not cross inside the circles, as shown in Figure 14.49c.
 */
package chapter14.javafx.exercises.Exercise_14_22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_22 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        double paneWidth = 200;
        double paneHeight = 200;

        double circleRadius = 15;

        double c1CenterX = Math.random() * (paneWidth - 5);
        double c1CenterY = Math.random() * (paneHeight - 5);
        double c2CenterX = Math.random() * (paneWidth - 5);
        double c2CenterY = Math.random() * (paneHeight - 5);

        double xDistance = c1CenterX - c2CenterX;
        double yDistance = c1CenterY - c2CenterY;
        double distance = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        System.out.println(distance);


        System.out.println(xDistance + " " + yDistance);

        Circle c1 = new Circle(c1CenterX, c1CenterY, circleRadius);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);
        Circle c2 = new Circle(c2CenterX, c2CenterY, circleRadius);
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        Line link = new Line(c1CenterX, c1CenterY, c2CenterX, c2CenterY);

        Pane pane = new Pane();
        pane.getChildren().addAll(link, c1, c2);

        Scene scene = new Scene(pane, paneWidth, paneHeight);
        stage.setScene(scene);
        stage.show();
    }
}
