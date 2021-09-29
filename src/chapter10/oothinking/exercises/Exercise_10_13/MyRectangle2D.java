/*
(Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
contains:
■■ Two double data fields named x and y that specify the center of the rectangle
with getter and setter methods. (Assume the rectangle sides are parallel to
x- or y-axis.)
■■ The data fields width and height with getter and setter methods.
■■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
1 for both width and height.
■■ A constructor that creates a rectangle with the specified x, y, width, and
height.
■■ A method getArea() that returns the area of the rectangle.
■■ A method getPerimeter() that returns the perimeter of the rectangle.
■■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this rectangle (see Figure 10.24a).
■■ A method contains(MyRectangle2D r) that returns true if the specified
rectangle is inside this rectangle (see Figure 10.24b).
■■ A method overlaps(MyRectangle2D r) that returns true if the specified
rectangle overlaps with this rectangle (see Figure 10.24c).
Draw the UML diagram for the class then implement the class. Write a test
program that creates a MyRectangle2D object r1 (new MyRectangle2D
(2, 2, 5.5, 4.9)), displays its area and perimeter, and displays the result
of r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5,
10.5, 3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3,
5.4)).
 */
package chapter10.oothinking.exercises.Exercise_10_13;

import chapter10.oothinking.exercises.Exercise_10_04.MyPoint;

public class MyRectangle2D {
    private double x, y, width, height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);

    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return Math.round(((height * width) * 100)) / 100.0;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Exercise 10.15
    public static MyRectangle2D getRectangle(double[][] points) {
        double smallestX = 9999;
        double largestX = -9999;
        double smallestY = 9999;
        double largestY = -9999;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > largestX)
                largestX = points[i][0];
            if (points[i][0] < smallestX)
                smallestX = points[i][0];
            if (points[i][1] > largestY)
                largestY = points[i][1];
            if (points[i][1] < smallestY)
                smallestY = points[i][1];
        }

        double boundingRetangleWidth = largestX - smallestX;
        double boundingRectangleHeight = largestY - smallestY;
        double x = (boundingRetangleWidth / 2) + smallestX;
        double y = (boundingRectangleHeight / 2) + smallestY;

        return new MyRectangle2D(x, y, boundingRetangleWidth, boundingRectangleHeight);
    }

    public boolean contains(double x, double y) {
        return (this.x - Math.round((width / 2.0) * 100) / 100.0) <= x
                && (this.x + Math.round((width / 2.0) * 100) / 100.0) >= x
                && (this.y - Math.round((height / 2.0) * 100) / 100.0) <= y
                && (this.y + Math.round((height / 2.0) * 100) / 100.0) >= y;
    }

    public boolean contains(MyRectangle2D r2) {
        for (int i = 0; i < 4; i++) {
            if (!this.contains(r2.getBoundingPoints(this)[i].getX(), r2.getBoundingPoints(this)[i].getY()))
                return false;
        }
        return true;
    }

    public boolean overlaps(MyRectangle2D r2) {
        int numberOfPointsInside = 0;
        for (int i = 0; i < 4; i++) {
            if (this.contains(r2.getBoundingPoints(this)[i].getX(), r2.getBoundingPoints(this)[i].getY()))
                numberOfPointsInside++;
        }
        return numberOfPointsInside == 1 || numberOfPointsInside == 2;
    }

    public MyPoint[] getBoundingPoints(MyRectangle2D rect) {
        double halfWidth = rect.width / 2.0;
        double halfHeight = rect.height / 2.0;
        MyPoint topLeft = new MyPoint(rect.x - (halfWidth), rect.y + (halfHeight));
        MyPoint topRight = new MyPoint(rect.x + (halfWidth), rect.y + (halfHeight));
        MyPoint bottomLeft = new MyPoint(rect.x - (halfWidth), rect.y - (halfHeight));
        MyPoint bottomRight = new MyPoint(rect.x + (halfWidth), rect.y - (halfHeight));

        return new MyPoint[]{topLeft, topRight, bottomLeft, bottomRight};
    }
}
