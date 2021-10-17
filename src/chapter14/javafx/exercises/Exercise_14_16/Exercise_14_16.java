/*
(Display a 3 * 3 grid) Write a program that displays a 3 * 3 grid, as shown in
Figure 14.47c. Use red color for vertical lines and blue for horizontals. The lines
are automatically resized when the window is resized.
 */
package chapter14.javafx.exercises.Exercise_14_16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Exercise_14_16 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        StackPane pane = new StackPane();

        pane.getChildren().add(new Grid());
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();


    }
}


class Grid extends Pane {
    public void paint() {

        Line hLine1 = new Line(0, getHeight() / 3, getWidth(), getHeight() / 3);
        hLine1.setStroke(Color.BLUE);
        hLine1.setStrokeWidth(5);
        Line hLine2 = new Line(0, getHeight() / 3 * 2, getWidth(), getHeight() / 3 * 2);
        hLine2.setStroke(Color.BLUE);
        hLine2.setStrokeWidth(5);

        Line vLine1 = new Line(getWidth() / 3, 0, getWidth() / 3, getHeight());
        vLine1.setStroke(Color.RED);
        vLine1.setStrokeWidth(5);
        Line vLine2 = new Line(getWidth() / 3 * 2, 0, getWidth() / 3 * 2, getHeight());
        vLine2.setStroke(Color.RED);
        vLine2.setStrokeWidth(5);


        getChildren().clear();
        getChildren().addAll(hLine1, hLine2, vLine1, vLine2);
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
