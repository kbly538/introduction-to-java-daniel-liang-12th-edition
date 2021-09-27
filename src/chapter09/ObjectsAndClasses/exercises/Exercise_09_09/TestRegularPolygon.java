/*
(Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have
the same length and all angles have the same degree (i.e., the polygon is both equilateral
and equiangular). Design a class named RegularPolygon that contains:
■■ A private int data field named n that defines the number of sides in the polygon
with default value 3.
VideoNote
The Fan class
Programming Exercises 365
■■ A private double data field named side that stores the length of the side with
default value 1.
■■ A private double data field named x that defines the x-coordinate of the polygon’s
center with default value 0.
■■ A private double data field named y that defines the y-coordinate of the polygon’s
center with default value 0.
■■ A no-arg constructor that creates a regular polygon with default values.
■■ A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
■■ A constructor that creates a regular polygon with the specified number of sides,
length of side, and x- and y-coordinates.
■■ The accessor and mutator methods for all data fields.
■■ The method getPerimeter() that returns the perimeter of the polygon.
■■ The method getArea() that returns the area of the polygon.
Draw the UML diagram for the class then implement the class. Write a test program
that creates three RegularPolygon objects, created using the no-arg constructor,
using RegularPolygon(6, 4), and using RegularPolygon(10, 4,
5.6, 7.8). For each object, display its perimeter and area.
 */
package chapter09.ObjectsAndClasses.exercises.Exercise_09_09;

public class TestRegularPolygon {
    public static void main(String[] args) {

        RegularPolygon polygon1 = new RegularPolygon(6, 4);
        RegularPolygon polygon2 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon1 Perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon1 Area: " + polygon1.getArea());
        System.out.println("Polygon2 Perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon2 Area: " + polygon2.getArea());
    }
}

/* OUTPUT
Polygon1 Perimeter: 24.0
Polygon1 Area: 41.569219381653056
Polygon2 Perimeter: 40.0
Polygon2 Area: 123.10734148701015
 */