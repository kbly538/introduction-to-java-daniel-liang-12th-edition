/*
(Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal if
their areas are the same. Draw the UML diagram that involves Rectangle, GeometricObject,
and Comparable.
 */
package chapter13.exercises.Exercise_13_10;

public class TestComparableRectangle {
    public static void main(String[] args) {
        ComparableRectangle r1 = new ComparableRectangle(5, 10);
        ComparableRectangle r2 = new ComparableRectangle(15, 20);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        System.out.println("r1 equals r2? " + r1.equals(r2));
        System.out.println("r1 compared to r2: " + r1.compareTo(r2));
    }
}


/* OUTPUT
ComparableRectangle{width=5.0, height=10.0} GeometricObject{color='White', filled=true, dateCreated=Tue Oct 12 00:11:01 EET 2021}
ComparableRectangle{width=15.0, height=20.0} GeometricObject{color='White', filled=true, dateCreated=Tue Oct 12 00:11:01 EET 2021}
r1 equals r2? false
r1 compared to r2: -1
 */