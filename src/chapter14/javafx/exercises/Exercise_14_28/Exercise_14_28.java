/*
(Random time) Modify the ClockPane class with three new Boolean
properties—hourHandVisible, minuteHandVisible, and
secondHandVisible—
and their associated accessor and mutator methods.
You can use the set methods to make a hand visible or invisible. Write a test
program that displays only the hour and minute hands. The hour and minute
values are randomly generated. The hour is between 0 and 11, and the minute is
either 0 or 30, as shown in Figure 14.52b.
 */
package chapter14.javafx.exercises.Exercise_14_28;

import chapter14.javafx.listings.DisplayClock.ClockPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise_14_28 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClockPane pane = new ClockPane();
        pane.setMinSize(200, 200);
        //pane.setHourHandVisible(true);
        //pane.setMinuteHandVisible(true);

        pane.setHour((int) (Math.random() * 12));
        pane.setMinute((int) (Math.random() * 2) == 1 ? 0 : 30);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


}
