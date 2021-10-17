/*
(Paint a smiley face) Write a program that paints a smiley face, as shown in
Figure
14.46a.
 */
package chapter14.javafx.exercises.Exercise_14_11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Exercise_14_11 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(new SmileyFace(), 200, 200);
        stage.setTitle("Smiley Face");
        stage.setScene(scene);
        stage.show();

    }
}

class SmileyFace extends Pane {
    public void paint() {

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        double radius = 90;

        Circle face = new Circle(centerX, centerY, radius);
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);

        Ellipse eyeL = new Ellipse(centerX - 40, centerY - 40, 25, 20);
        eyeL.setFill(Color.WHITE);
        eyeL.setStroke(Color.BLACK);
        Ellipse eyeR = new Ellipse(centerX + 35, centerY - 40, 25, 20);
        eyeR.setFill(Color.WHITE);
        eyeR.setStroke(Color.BLACK);
        Circle pupilL = new Circle(centerX - 40, centerY - 40, 10);
        Circle pupilR = new Circle(centerX + 35, centerY - 40, 10);

        Polygon nose = new Polygon();
        nose.getPoints().setAll(centerX, centerY - 20, centerX - 10, centerY + 20, centerX + 10, centerY + 20);
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);

        Arc mouth = new Arc(centerX, centerY + 20, 50, 20, 180, 180);
        mouth.setFill(Color.WHITE);
        mouth.setStroke(Color.BLACK);
        getChildren().clear();
        getChildren().addAll(face, eyeL, eyeR, pupilL, pupilR, nose, mouth);
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
