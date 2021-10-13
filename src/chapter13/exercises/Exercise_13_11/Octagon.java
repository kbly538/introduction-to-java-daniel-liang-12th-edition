/*
(The Octagon class) Write a class named Octagon that extends
GeometricObject
and implements the Comparable and Cloneable interfaces.
Assume all eight sides of the octagon are of equal length. The area can be
computed
using the following formula:
area = 12 + 4/222 * side * side
The Octagon class has a private double data field named side with its getter and
setter methods. The class has a no-arg constructor that creates an Octagon with
side 0, and a constructor to create an Octagon with a specified side.
Draw the UML diagram that involves Octagon, GeometricObject, Comparable,
and Cloneable. Write a test program that creates an Octagon object with side
value 5 and displays its area and perimeter. Create a new object using the clone
method, and compare the two objects using the compareTo method.
 */
package chapter13.exercises.Exercise_13_11;

import chapter13.exercises.Exercise_13_05.GeometricObject;
import org.jetbrains.annotations.NotNull;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side;

    public Octagon() {
        this(0);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(@NotNull Octagon o) {
        return getArea() > o.getArea() ? 1 : (getArea() < o.getArea() ? -1 : 0);
    }

    public Octagon clone() {
        Octagon o = new Octagon(this.side);
        return o;
    }
}
