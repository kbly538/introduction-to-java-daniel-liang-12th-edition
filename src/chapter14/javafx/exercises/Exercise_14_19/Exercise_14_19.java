package chapter14.javafx.exercises.Exercise_14_19;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_19 extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        Pane pane = new Pane();

        Polyline sineWave = new Polyline();
        sineWave.setStroke(Color.RED);
        ObservableList<Double> sinList = sineWave.getPoints();
        double sinScaleFactor = 50;
        for (int x = -250; x <= 280; x++) {
            sinList.add(x + 300.0);
            sinList.add(200 - sinScaleFactor * Math.sin((x / 200.0) * 2 *
                    Math.PI));
        }

        Polyline cosWave = new Polyline();
        cosWave.setStroke(Color.BLUE);
        ObservableList<Double> cosPoints = cosWave.getPoints();
        double cosScaleFactor = 50;
        for (int x = -250; x <= 305; x++) {
            cosPoints.add(x + 250.0);
            cosPoints.add(200 - cosScaleFactor * Math.sin((x / 200.0) * 2 *
                    Math.PI));
        }

        double piScale = 100;

        Text pi0Text = new Text(305, 195, "0");
        Circle pi0 = new Circle(300, 200, 2);

        Text pi1Text = new Text(305 + piScale, 195, "\u03c0");
        Circle pi1 = new Circle(300 + piScale, 200, 2);

        Text pi2Text = new Text(305 + piScale * 2, 195, "2 \u03c0");
        Circle pi2 = new Circle(300 + piScale * 2, 200, 2);


        Text pim1Text = new Text(295 - piScale, 195, "-\u03c0");
        Circle pim1 = new Circle(300 - piScale, 200, 2);

        Text pim2Text = new Text(295 - piScale * 2, 195, "-2 \u03c0");
        Circle pim2 = new Circle(300 - piScale * 2, 200, 2);

        Line xAxis = new Line(20, 200, 580, 200);
        Line yAxis = new Line(300, 30, 300, 300);

        Line xLeft = new Line(300, 30, 290, 40);
        Line xRight = new Line(300, 30, 310, 40);

        Line yLeft = new Line(570, 190, 580, 200);
        Line yRight = new Line(570, 210, 580, 200);

        Text textX = new Text("X");
        Text textY = new Text("Y");
        textX.setX(315);
        textX.setY(40);
        textY.setX(575);
        textY.setY(190);


        pane.getChildren().addAll(xAxis, yAxis, xLeft, xRight, yLeft, yRight, textX, textY,
                pi0, pi0Text, pi1, pi1Text, pi2, pi2Text, pim1, pim1Text, pim2, pim2Text, sineWave, cosWave);

        Scene scene = new Scene(pane, 600, 400);
        stage.setScene(scene);
        stage.show();

    }
}
