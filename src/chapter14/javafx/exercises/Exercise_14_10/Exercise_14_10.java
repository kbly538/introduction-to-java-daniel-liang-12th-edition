/*
(Display a cylinder) Write a program that draws a cylinder, as shown in Figure
14.45c.
You can use the following method to set the dashed stroke for an arc:arc.
getStrokeDashArray().addAll(6.0, 21.0);
The solution posted on the website enables the cylinder to resize horizontally.
Can you revise it to resize vertically as well?
 */
package chapter14.javafx.exercises.Exercise_14_10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_10 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new CylinderPane(), 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}

class CylinderPane extends Pane {
    public void paint() {
        double centerX = getWidth() / 2;
        double radiusX = getWidth() * 0.8 / 2;
        double heightStartY = getHeight() * 0.2;
        double heightEndY = getHeight() * 0.8;

        Ellipse top = new Ellipse(centerX, heightStartY, radiusX, 50);
        top.setFill(Color.WHITE);
        top.setStroke(Color.BLACK);

        Line lineLeft = new Line(centerX - radiusX, heightStartY, centerX - radiusX, heightEndY);
        Line lineRight = new Line(centerX + radiusX, heightStartY, centerX + radiusX, heightEndY);

        Arc topArc = new Arc(centerX, heightEndY, radiusX, 50, 0, 180);
        topArc.setFill(Color.WHITE);
        topArc.setStroke(Color.BLACK);
        topArc.getStrokeDashArray().addAll(6.0, 21.0);

        Arc bottomArc = new Arc(centerX, heightEndY, radiusX, 50, 180, 180);
        bottomArc.setFill(Color.WHITE);
        bottomArc.setStroke(Color.BLACK);

        getChildren().clear();
        getChildren().addAll(top, lineLeft, lineRight, topArc, bottomArc);
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paint();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paint();
    }

}
