/*
(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.
 */
package chapter13.exercises.Exercise_13_09;

public class TestComparableCircle {

    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(20);
        ComparableCircle c2 = new ComparableCircle(30);
        ComparableCircle c3 = new ComparableCircle(20);

        System.out.println("c1.equals(c3)? " + c1.equals(c3));
        System.out.println("c2.equals(c1)? " + c2.equals(c1));
        System.out.println("c1.compareTo(c2) " + c1.compareTo(c2));
        System.out.println("c1.compareTo(c3) " + c1.compareTo(c3));
        System.out.println("c2.compareTo(c3) " + c2.compareTo(c3));
    }
}

/* OUTPUT
c1.equals(c3)? true
c2.equals(c1)? false
c1.compareTo(c2) -1
c1.compareTo(c3) 0
c2.compareTo(c3) 1
 */