package chapter14.javafx.exercises.Exercise_14_29;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_29 extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        Scene scene = new Scene(new GaltonBox());
        stage.setScene(scene);
        stage.show();
    }
}


class GaltonBox extends Pane {
    public void paint() {
        setMinSize(400, 400);

        int layers = 1;
        int numberOfBalls;
        double startY = 20;


        getChildren().clear();
        while (layers <= 8) {
            numberOfBalls = 1;
            double startX = 180;
            startX -= (20 * layers);
            startY += 30;
            while (numberOfBalls <= layers) {
                startX += 40;
                Circle circle = new Circle(startX, startY, 8);
                circle.setFill(Color.GREEN);
                getChildren().add(circle);
                numberOfBalls++;
            }
            layers++;
        }

        Line line1 = new Line(180, 2, 180, 30);
        Line line2 = new Line(220, 2, 220, 30);
        Line line3 = new Line(180, 30, 20, 270);
        Line line4 = new Line(220, 30, 380, 270);
        Line line5 = new Line(20, 270, 20, 390);
        Line line6 = new Line(380, 270, 380, 390);
        Line line7 = new Line(20, 390, 380, 390);
        for (int i = 1, range = 60; i < layers; i++, range += 40) {
            Line line = new Line(60, 268, 60, 390);
            line.setStartX(range);
            line.setEndX(range);
            getChildren().add(line);
        }
        getChildren().addAll(line1, line2, line3, line4, line5, line6, line7);
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