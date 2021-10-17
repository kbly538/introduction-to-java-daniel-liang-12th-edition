/*
(Plot the square function) Write a program that draws a diagram for the function
f(x) = x^2 (see Figure 14.48b).
 */
package chapter14.javafx.exercises.Exercise_14_18;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_18 extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        Pane pane = new Pane();

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(-1 * scaleFactor * x * x + 200);
        }

        Line xAxis = new Line(200, 30, 200, 300);
        Line yAxis = new Line(20, 200, 380, 200);

        Line xLeft = new Line(200, 30, 190, 40);
        Line xRight = new Line(200, 30, 210, 40);

        Line yLeft = new Line(370, 190, 380, 200);
        Line yRight = new Line(370, 210, 380, 200);

        Text textX = new Text("X");
        Text textY = new Text("Y");
        textX.setX(215);
        textX.setY(40);
        textY.setX(375);
        textY.setY(190);


        pane.getChildren().addAll(polyline, xAxis, yAxis, xLeft, xRight, yLeft, yRight, textX, textY);

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();

    }
}


