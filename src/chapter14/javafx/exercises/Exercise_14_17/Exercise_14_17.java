/*
(Game: hangman) Write a program that displays a drawing for the popular hangman
game, as shown in Figure 14.48a.
 */
package chapter14.javafx.exercises.Exercise_14_17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_17 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        StackPane pane = new StackPane();

        pane.getChildren().add(new Hangman());

        Scene scene = new Scene(pane, 700, 500);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
}


class Hangman extends Pane {
    public void paint() {


        double poleStartX = 100;
        double poleStartY = 20;


        Pole pole = new Pole(poleStartX, poleStartY);

        Line rope = new Line(pole.poleArmLength, poleStartY, pole.poleArmLength, 40);
        Circle head = new Circle(pole.poleArmLength, poleStartY + 40, 20);
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);
        Line body = new Line(pole.poleArmLength, poleStartY + 60, pole.poleArmLength, 200);
        Line armLeft = new Line(pole.poleArmLength, poleStartY + 60, pole.poleArmLength - 30, 180);
        Line armRight = new Line(pole.poleArmLength, poleStartY + 60, pole.poleArmLength + 30, 180);
        Line legLeft = new Line(pole.poleArmLength, 200, pole.poleArmLength - 20, 300);
        Line legRight = new Line(pole.poleArmLength, 200, pole.poleArmLength + 20, 300);


        getChildren().clear();
        getChildren().addAll(rope, pole, body, head, armLeft, armRight, legLeft, legRight);


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

class Pole extends Pane {

    double poleStartX;
    double poleStartY;
    double poleEndX;
    double poleEndY;
    double poleLength;
    double poleArmLength;
    double baseRadius;


    public Pole(double poleStartX, double poleStartY) {
        this.poleStartX = poleStartX;
        this.poleStartY = poleStartY;
        poleEndX = 50;
        poleEndY = poleStartY + 400;
        poleLength = 400;
        poleArmLength = poleLength / 2 + poleStartX;
        baseRadius = 30;
    }

    ;

    public void paint() {
        Arc poleBase = new Arc(poleStartX, poleStartY + poleLength, 60, baseRadius, -180, -180);
        poleBase.setType(ArcType.OPEN);
        poleBase.setFill(Color.WHITE);
        poleBase.setStroke(Color.BLACK);

        Line pole = new Line(poleStartX, poleStartY, poleStartX, poleEndY);
        Line poleArm = new Line(poleStartX, poleStartY, poleArmLength, poleStartY);

        getChildren().clear();
        getChildren().addAll(pole, poleArm, poleBase);

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
