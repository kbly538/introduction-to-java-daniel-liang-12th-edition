/*
(Color and font) Write a program that displays five texts vertically, as shown in
Figure 14.44a. Set a random color and opacity for each text and set the font of
each text to Times Roman, bold, italic, and 22 pixels.
 */
package chapter14.javafx.exercises.Exercise_14_04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Exercise_14_04 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(35, 0, 0, 0));
        for (int i = 1; i < 6; i++) {
            Text t = new Text(200, 400, "Java");
            t.setRotate(90);
            t.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 30));
            t.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            hBox.getChildren().add(t);
        }

        Scene scene = new Scene(hBox, 320, 100);
        stage.setTitle("Color and Font");
        stage.setScene(scene);
        stage.show();


    }
}
