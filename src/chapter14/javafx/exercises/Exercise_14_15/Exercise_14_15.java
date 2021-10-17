/*
(Display a STOP sign) Write a program that displays a STOP sign, as shown
in Figure 14.47b. The octagon is in red and the sign is in white. (Hint: Place an
octagon and a text in a stack pane.)
 */
package chapter14.javafx.exercises.Exercise_14_15;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_15 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        StackPane pane = new StackPane();


        Text text = new Text("STOP");
        Octagon trafficSign = new Octagon();
        trafficSign.setRotate(-67.5);
        text.setFont(Font.font("Highway Gothic", FontWeight.BOLD, 50));
        text.setFill(Color.WHITE);

        pane.getChildren().addAll(trafficSign, text);


        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}


class Octagon extends Pane {
    public void paint() {
        Polygon octagon = new Polygon();
        octagon.setRotate(90);
        octagon.setFill(Color.RED);
        octagon.setStroke(Color.WHITE);
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;
        ObservableList<Double> points = octagon.getPoints();

        for (int i = 0; i < 8; i++) {

            double x = centerX + radius * Math.sin(i * Math.PI * 2 / 8);
            double y = centerY - radius * Math.cos(i * Math.PI * 2 / 8);

            points.add(x);
            points.add(y);
        }


        getChildren().clear();
        getChildren().add(octagon);


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
