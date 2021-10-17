/*
(Create four fans) Write a program that places four fans in a GridPane with two
rows and two columns, as shown in Figure 14.45b.
 */
package chapter14.javafx.exercises.Exercise_14_09;

import chapter09.ObjectsAndClasses.exercises.Exercise_09_08.Fan;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Stack;

public class Exercise_14_09 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Pane fanPane = new Pane();
                fanPane.setPadding(new Insets(20, 20, 20, 20));
                Circle c = new Circle(50, 50, 50);
                c.setStroke(Color.BLACK);
                c.setFill(Color.WHITE);
                fanPane.getChildren().add(c);

                for (int k = 0; k < 4; k++) {
                    Arc a = new Arc();

                    a.centerXProperty().bind(c.centerXProperty());
                    a.centerYProperty().bind(c.centerYProperty());

                    a.setRadiusX(48);
                    a.setRadiusY(48);

                    a.setStartAngle(90 * k);
                    a.setLength(40);

                    a.setType(ArcType.ROUND);
                    a.setFill(Color.RED);
                    fanPane.getChildren().add(a);
                }
                pane.add(fanPane, i, j);
            }
        }


        Scene scene = new Scene(pane, 250, 250);
        stage.setTitle("Four Fans");
        stage.setScene(scene);
        stage.show();
    }
}
