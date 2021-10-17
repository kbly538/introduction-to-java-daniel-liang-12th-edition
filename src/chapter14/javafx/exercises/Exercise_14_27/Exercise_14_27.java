/*
(Draw a detailed clock) Modify the ClockPane class in Section 14.12 to draw
the clock with more details on the hours and minutes, as shown in Figure
14.52a.
 */
package chapter14.javafx.exercises.Exercise_14_27;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise_14_27 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClockPane clock = new ClockPane();
        clock.setHour(12);
        clock.setMinute(33);
        clock.setSecond(20);
        clock.setMinSize(200, 200);

        Scene scene = new Scene(clock);
        stage.setScene(scene);
        stage.show();
    }
}


class ClockPane extends Pane {

    private int hour;
    private int minute;
    private int second;

    public ClockPane() {
        setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void setCurrentTime() {
        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock();
    }

    private void paintClock() {

        double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12 * 2.3, "12");
        Text t2 = new Text(centerX - clockRadius + 3 * 6.9, centerY + 5, "9");
        Text t3 = new Text(centerX + clockRadius - 10 * 3, centerY + 3, "3");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3 * 6.9, "6");


        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        double mLength = clockRadius * 0.65;
        double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, minuteX, minuteY);
        mLine.setStroke(Color.BLUE);

        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);


        ArrayList<Line> lines = new ArrayList<>();
        for (int i = 1; i <= 60; i++) {

            double markLength = clockRadius * 0.92;
            if (i % 5 == 0)
                markLength = clockRadius * 0.8;
            double markStartX = centerX + markLength * Math.sin(i * (2 * Math.PI / 60));
            double markStartY = centerY - markLength * Math.cos(i * (2 * Math.PI / 60));
            double markEndX = centerX + clockRadius * Math.sin(i * (2 * Math.PI / 60));
            double markEndY = centerY - clockRadius * Math.cos(i * (2 * Math.PI / 60));
            Line mark = new Line(markStartX, markStartY, markEndX, markEndY);

            lines.add(mark);
        }


        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
        for (int i = 0; i < lines.size(); i++) {
            getChildren().add(lines.get(i));
        }


    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paintClock();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paintClock();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }
}