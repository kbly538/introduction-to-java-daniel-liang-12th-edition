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

public class TestOctagon {
    public static void main(String[] args) {

        Octagon o1 = new Octagon(5);
        System.out.println("Area: " + o1.getArea());
        System.out.println("Perimeter: " + o1.getPerimeter());

        Octagon o2 = o1.clone();

        System.out.println("o1 compared to o2 " + o1.compareTo(o2));
        System.out.println("o1 == o2 " + (o1 == o2));
    }
}

/* OUTPUT
Area: 120.71067811865476
Perimeter: 40.0
o1 compared to o2 0
o1 == o2 false
 */