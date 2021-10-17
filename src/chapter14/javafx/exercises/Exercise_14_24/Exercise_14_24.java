/*
(Geometry: Inside a polygon?) Write a program that prompts the user to enter
the coordinates of five points from the command line. The first four points form a
polygon, and the program displays the polygon and a text that indicates whether
the fifth point is inside the polygon, as shown in Figure 14.51a. (Hint: Use the
Node’s contains method to test whether a point is inside a node.)
 */
package chapter14.javafx.exercises.Exercise_14_24;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_14_24 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points for the polygon: ");
        ArrayList<Double> points = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            points.add(input.nextDouble());
        }

        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(points);
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);

        Point2D point = new Point2D(pointX, pointY);

        String status = "";
        if (polygon.contains(point)) {
            status = "Point is inside the polygon";
        } else
            status = "Point is not inside the polygon";

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.getChildren().add(polygon);
        vBox.getChildren().add(new Text(status));


        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();

    }
}
