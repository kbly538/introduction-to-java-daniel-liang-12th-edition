/*
(Display a rectanguloid) Write a program that displays a rectanguloid, as
shown in Figure 14.47a. The cube should grow and shrink as the window grows
or shrinks.
 */
package chapter14.javafx.exercises.Exercise_14_14;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_14_14 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Rectanguloid r = new Rectanguloid();

        Scene scene = new Scene(r);
        stage.setTitle("Rectanguloid");
        stage.setScene(scene);
        stage.show();
    }
}

class Rectanguloid extends Pane {

    double width = 1;
    double height = 1;

    public void paint() {
        Rectangle front = new Rectangle(20, 50, width, height);
        front.setFill(Color.WHITE);
        front.setStroke(Color.BLACK);
        front.widthProperty().bind(widthProperty().subtract(60));
        front.heightProperty().bind(heightProperty().subtract(60));

        Rectangle back = new Rectangle(40, 20, width, height);
        back.setFill(Color.color(0, 0, 0, 0));
        back.setStroke(Color.BLACK);
        back.widthProperty().bind(front.widthProperty());
        back.heightProperty().bind(front.heightProperty());

        // Left Face
        Line line1 = new Line(20, 50, 40, 20);
        Line line2 = new Line(20, 50 + height, 40, 20 + height);
        line2.startYProperty().bind(front.yProperty().add(front.heightProperty()));
        line2.endYProperty().bind(back.yProperty().add(back.heightProperty()));

        // Right Face
        Line line3 = new Line(20 + width, 50, 40 + width, 20);
        Line line4 = new Line(20 + width, 50 + height, 40 + width, 20 + height);
        line3.startXProperty().bind(front.xProperty().add(front.widthProperty()));
        line3.endXProperty().bind(back.xProperty().add(back.widthProperty()));

        line4.startXProperty().bind(front.xProperty().add(front.widthProperty()));
        line4.endXProperty().bind(back.xProperty().add(back.widthProperty()));
        line4.startYProperty().bind(front.yProperty().add(front.heightProperty()));
        line4.endYProperty().bind(back.yProperty().add(back.heightProperty()));


        getChildren().clear();
        getChildren().addAll(front, back, line1, line2, line3, line4);
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paint();
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paint();
    }
}
