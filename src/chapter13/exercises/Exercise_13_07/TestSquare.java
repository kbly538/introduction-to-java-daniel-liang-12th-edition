/*
(The Colorable interface) Design an interface named Colorable with a void
method named howToColor(). Every class of a colorable object must implement
the Colorable interface. Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to
display the message Color all four sides. The Square class contains a
data field side with getter and setter methods, and a constructor for constructing
a Square with a specified side. The Square class has a private double data field
named side with its getter and setter methods. It has a no-arg constructor to
create a Square with side 0, and another constructor that creates a Square with
the specified side.
Draw a UML diagram that involves Colorable, Square, and GeometricObject.
Write a test program that creates an array of five GeometricObjects. For each object
in the array, display its area and invoke its howToColor method if it is colorable.
 */

package chapter13.exercises.Exercise_13_07;

import chapter13.exercises.Exercise_13_01.Triangle;
import chapter13.exercises.Exercise_13_05.Circle;
import chapter13.exercises.Exercise_13_05.GeometricObject;
import chapter13.exercises.Exercise_13_05.Rectangle;

import java.util.ArrayList;

public class TestSquare {
    public static void main(String[] args) throws Exception {

        GeometricObject g1 = new Circle(10);
        GeometricObject g2 = new Rectangle(10, 20);
        GeometricObject g3 = new Square(4);
        GeometricObject g4 = new Triangle(6, 8, 10);
        GeometricObject g5 = new Square(40);

        ArrayList<GeometricObject> list = new ArrayList<>();
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);

        for (int i = 0; i < list.size(); i++) {
            GeometricObject elem = list.get(i);
            if (list.get(i) instanceof Colorable)
                ((Colorable) elem).howToColor();
            System.out.println(elem);
            System.out.println();

        }
    }
}

/* OUTPUT
Circle{radius=10.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 23:27:20 EET 2021}

Rectangle{width=10.0, height=20.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 23:27:20 EET 2021}

Color all four sides.
Square{side=4.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 23:27:20 EET 2021}

Triangle{side1=6.0, side2=8.0, side3=10.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 23:27:20 EET 2021}

Color all four sides.
Square{side=40.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 23:27:20 EET 2021}
 */
