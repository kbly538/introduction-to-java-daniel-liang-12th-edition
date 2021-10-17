/*
(Random points on a circle) Modify Programming Exercise 4.6 to create five
random points on a circle, form a polygon by connecting the points clockwise,
and display the circle and the polygon, as shown in Figure 14.51b.
 */
package chapter14.javafx.exercises.Exercise_14_25;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Exercise_14_25 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane pane = new Pane();

        Circle c = new Circle(100, 100, 90);
        c.setStroke(Color.BLACK);
        c.setFill(Color.color(0, 0, 0, 0));
        pane.getChildren().add(c);

        ArrayList<Double> points = new ArrayList<Double>();

        for (int i = 1; i < 6; i++) {
            Circle point = new Circle(100, 100, 5);
            double randomization = Math.random() * i + i;
            point.setCenterX(100 - 90 * Math.sin(2 * Math.PI / randomization));
            point.setCenterY(100 - 90 * Math.cos(2 * Math.PI / randomization));
            points.add(point.getCenterX());
            points.add(point.getCenterY());
            pane.getChildren().add(point);
        }

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(points);
        polygon.setStroke(Color.RED);
        polygon.setFill(Color.color(0, 0, 0, 0));

        pane.getChildren().add(polygon);

        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();

    }
}
