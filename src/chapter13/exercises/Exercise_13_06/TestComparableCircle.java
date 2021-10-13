/*
(The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram
and implement the compareTo method to compare the circles on the basis of
area. Write a test class to find the larger of two instances of ComparableCircle
objects, and the larger between a circle and a rectangle.
 */
package chapter13.exercises.Exercise_13_06;

public class TestComparableCircle {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(10, "White", true);
        ComparableCircle c2 = new ComparableCircle(5, "Black", false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Is c1 has a larger area than c2? " + (c1.compareTo(c2) == 1 ? true : false));

    }
}

/* OUTPUT
Circle{radius=10.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 23:07:29 EET 2021}
Circle{radius=5.0} GeometricObject{color='Black', filled=false, dateCreated=Mon Oct 11 23:07:29 EET 2021}
Is c1 has a larger area than c2? true
 */
