/* LISTING 14.6 */
package chapter14.javafx.listings;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BindingDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        d1.bind(d2);
        System.out.println("d1 is " + d1.getValue() +
                " and d2 is " + d2.getValue());
        d2.setValue(70);
        System.out.println("d1 is " + d1.getValue() + " d2 is " + d2.getValue());
    }
}
