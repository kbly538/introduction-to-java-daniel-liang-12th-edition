/*
(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.
 */
package chapter13.exercises.Exercise_13_09;

import chapter13.exercises.Exercise_13_05.GeometricObject;
import org.jetbrains.annotations.NotNull;

public class ComparableCircle extends GeometricObject implements Comparable<ComparableCircle> {

    private double radius;

    public ComparableCircle() {
        this(1);
    }

    public ComparableCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(@NotNull ComparableCircle o) {
        return getArea() > o.getArea() ? 1 : (getArea() < o.getArea() ? -1 : 0);
    }

    @Override
    public boolean equals(Object obj) {
        return getRadius() == ((ComparableCircle) obj).getRadius();
    }


}
