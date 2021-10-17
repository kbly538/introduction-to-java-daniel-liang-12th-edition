/*
(Characters around circle) Write a program that displays a string “Welcome to
Java” around the circle, as shown in Figure 14.44b. (Hint: You need to display
each character in the right location with appropriate rotation using a loop.)
 */
package chapter14.javafx.exercises.Exercise_14_05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_05 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        char[] chars = "WELCOME TO JAVA".toCharArray();

        Pane pane = new Pane();


        for (int i = 0; i < chars.length; i++) {
            Text ch = new Text(chars[i] + "");
            ch.setFont(Font.font("Courier", FontWeight.BOLD, 30));
            ch.setX(190 + Math.cos(Math.PI * i * 2 / chars.length) * 100);
            ch.setY(200 + Math.sin(Math.PI * i * 2 / chars.length) * 100);
            ch.setRotate(90 + 360 / chars.length * i);
            pane.getChildren().add(ch);
        }

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Characters around Circle");
        stage.setScene(scene);
        stage.show();

    }
}
