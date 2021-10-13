/*
(Enable GeometricObject comparable) Modify the GeometricObject class to
implement the Comparable interface and define a static max method in the GeometricObject
class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write
a test program that uses the max method to find the larger of two circles, the larger
of two rectangles.
 */
package chapter13.exercises.Exercise_13_05;

public class TestComparableGeometricObject {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(24);
        GeometricObject c2 = new Circle(23);

        GeometricObject r1 = new Rectangle(1000, 500);
        GeometricObject r2 = new Rectangle(20, 5);

        Circle c3 = (Circle) GeometricObject.max(c1, c2);
        Rectangle r3 = (Rectangle) GeometricObject.max(r1, r2);

        System.out.println(GeometricObject.max(c3, r3));

    }
}

/*
Rectangle{width=1000.0, height=500.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 23:26:34 EET 2021}
 */