/*
(Triangle class) Design a new Triangle class that extends the abstract
GeometricObject
class. Draw the UML diagram for the classes Triangle and
GeometricObject then implement the Triangle class. Write a test program
that prompts the user to enter three sides of the triangle, a color, and a Boolean
value to indicate whether the triangle is filled. The program should create a Triangle
object with these sides, and set the color and filled properties using the
input. The program should display the area, perimeter, color, and true or false to
indicate whether it is filled or not.
 */
package chapter13.exercises.Exercise_13_01;


import chapter13.exercises.Exercise_13_05.GeometricObject;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws Exception {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) throws Exception {

        if (isTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new Exception("Not a triangle");
        }
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) throws Exception {
        super(color, filled);
        if (isTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new Exception("Not a triangle");
        }
    }

    private boolean isTriangle(double side1, double side2, double side3) {
        if (side1 + side2 > side3 &&
                side2 + side3 > side2 &&
                side1 + side3 > side2)
            return true;
        else
            return false;
    }


    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "} " + super.toString();
    }
}

