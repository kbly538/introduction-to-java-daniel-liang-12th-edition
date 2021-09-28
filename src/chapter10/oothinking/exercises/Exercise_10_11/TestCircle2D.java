/*
(Geometry: the Circle2D class) Define the Circle2D class that contains:
■■ Two double data fields named x and y that specify the center of the circle
with getter methods.
■■ A data field radius with a getter method.
■■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
■■ A constructor that creates a circle with the specified x, y, and radius.
■■ A method getArea() that returns the area of the circle.
■■ A method getPerimeter() that returns the perimeter of the circle.
■■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
■■ A method contains(Circle2D circle) that returns true if the specified
circle is inside this circle (see Figure 10.21b).
■■ A method overlaps(Circle2D circle) that returns true if the specified
circle overlaps with this circle
Draw the UML diagram for the class then implement the class. Write a test
program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
displays its area and perimeter, and displays the result of c1.contains(3,
3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
Circle2D(3, 5, 2.3)).
 */

package chapter10.oothinking.exercises.Exercise_10_11;

public class TestCircle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 perimeter: " + c1.getPerimeter());

        System.out.println("Does c1 contain point (3, 3)?) " + c1.contains(3, 3));
        System.out.println("Does c1 contain circle (4, 5, 10.5)?) " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Does c1 overlap point (3, 5, 2.3)?) " + c1.overlaps(new Circle2D(3, 5, 2.3)));

        Circle2D c2 = new Circle2D(0, 0, 10);
        System.out.println("Does c2 contain point (4, 5)?) " + c2.contains(4, 5));
        System.out.println("Does c2 contain point (9, 9)?) " + c2.contains(9, 9));

        Circle2D c3 = new Circle2D(3.4, 5.7, 5.5);
        System.out.println("Does c3 overlap circle (6.7,3.5,3)?) "
                + c3.overlaps(new Circle2D(6.7, 3.5, 3)));

        Circle2D c4 = new Circle2D(3.4, 5.5, 1);
        System.out.println("Does c4 overlap circle (5.5,7.2,1)?) "
                + c4.overlaps(new Circle2D(5.5, 7.2, 1)));

        Circle2D c5 = new Circle2D(0.5, 5.1, 13);
        System.out.println("Does c5 contain circle (1, 1.7, 4.5)?) "
                + c5.contains(new Circle2D(1, 1.7, 4.5)));
    }

}

/* OUTPUT
c1 area: 95.03317777109123
c1 perimeter: 34.55751918948772
Does c1 contain point (3, 3)?) true
Does c1 contain circle (4, 5, 10.5)?) true
Does c1 overlap point (3, 5, 2.3)?) true
Does c2 contain point (4, 5)?) true
Does c2 contain point (9, 9)?) false
Does c3 overlap circle (6.7,3.5,3)?) true
Does c4 overlap circle (5.5,7.2,1)?) false
Does c5 contain circle (1, 1.7, 4.5)?) true
 */