/*
(The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram
and implement the compareTo method to compare the circles on the basis of
area. Write a test class to find the larger of two instances of ComparableCircle
objects, and the larger between a circle and a rectangle.
 */
package chapter13.exercises.Exercise_13_06;

import chapter13.exercises.Exercise_13_05.Circle;
import org.jetbrains.annotations.NotNull;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(@NotNull ComparableCircle o) {
        return getArea() > o.getArea() ? 1 : getArea() < o.getArea() ? -1 : 0;
    }

}
