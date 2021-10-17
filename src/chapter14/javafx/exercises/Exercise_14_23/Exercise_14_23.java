/*
(Geometry: two rectangles) Write a program that prompts the user to enter the
center coordinates, width, and height of two rectangles from the command line.
The program displays the rectangles and a text indicating whether the two are
overlapping, whether one is contained in the other, or whether they don’t overlap,
as shown in Figure 14.50. See Programming Exercise 10.13 for checking the
relationship between two rectangles.
 */
package chapter14.javafx.exercises.Exercise_14_23;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Exercise_14_23 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter center coordinates, width and height of 1st rectangle: ");
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        System.out.println("Enter center coordinates, width and height of 2st rectangle: ");
        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        double r1Area = r1Width * r1Height;
        double r2Area = r2Width * r2Height;

        Rectangle r1, r2;
        r1 = new Rectangle(r1X - (r1Width / 2), r1Y - (r1Height / 2), r1Width, r1Height);
        r2 = new Rectangle(r2X - (r2Width / 2), r2Y - (r2Height / 2), r2Width, r2Height);

        r1.setStroke(Color.BLACK);
        r1.setFill(Color.color(0, 0, 0, 0));
        r2.setStroke(Color.RED);
        r2.setFill(Color.color(0, 0, 0, 0));

        Pane pane = new Pane();
        pane.getChildren().addAll(r1, r2);

        double xDistance = Math.abs(r1X - r2X);
        double yDistance = Math.abs(r1Y - r2Y);


        String status = "";
        if (((r1.getX() < r2.getX()) && (r1.getX() + r1.getWidth() > r2.getX() + r2.getWidth())) &&
                ((r1.getY() < r2.getY()) && (r1.getY() + r1.getHeight() > r2.getY() + r2.getHeight()))) {
            status = "r2 is inside r1";
        } else if (r1.getX() + r1.getWidth() < r2.getX() || r1.getX() > r2.getX() + r2.getWidth() ||
                r1.getY() + r1.getHeight() < r2.getY() || r1.getY() > r2.getY() + r2.getHeight()) {
            status = "r2 outside r1";
        } else {
            status = "r2 overlaps r1";
        }

        Text verdict = new Text(status);

        VBox borderPane = new VBox();
        borderPane.getChildren().addAll(pane, verdict);
        borderPane.setAlignment(Pos.CENTER);
        borderPane.setSpacing(30);
        borderPane.setPadding(new Insets(10, 20, 10, 20));


        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();


    }
}

