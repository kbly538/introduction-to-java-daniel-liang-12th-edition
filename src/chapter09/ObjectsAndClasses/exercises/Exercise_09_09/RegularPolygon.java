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

public class RegularPolygon {
    private int n; // number of sides
    private double side; // side length
    private double x; // x coordinate
    private double y; // y coordinate

    public RegularPolygon() {
        this(3, 1);
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public double getPerimeter() {
        return n * side;
    }
}
