/*
(Use the ClockPane class) Write a program that displays two clocks. The hour,
minute, and second values are 4, 20, 45 for the first clock, and 22, 46, 15 for the
second clock, as shown in Figure 14.51c.
 */
package chapter14.javafx.exercises.Exercise_14_26;

import chapter14.javafx.listings.DisplayClock.ClockPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercise_14_26 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        ClockPane clock1 = new ClockPane();
        ClockPane clock2 = new ClockPane();

        clock1.setMinSize(200, 200);
        clock2.setMinSize(200, 200);

        clock1.setHour(4);
        clock1.setMinute(20);
        clock1.setSecond(45);
        clock2.setHour(22);
        clock2.setMinute(46);
        clock2.setSecond(15);

        HBox clocks = new HBox();
        clocks.getChildren().addAll(clock1, clock2);
        clocks.setSpacing(20);

        Scene scene = new Scene(clocks);
        stage.setScene(scene);
        stage.show();


    }
}
