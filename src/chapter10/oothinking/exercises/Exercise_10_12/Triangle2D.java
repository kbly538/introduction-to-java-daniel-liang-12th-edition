/*
(Geometry: the Triangle2D class) Define the Triangle2D class that contains:
■■ Three points named p1, p2, and p3 of the type MyPoint with getter and
setter
methods. MyPoint is defined in Programming Exercise 10.4.
■■ A no-arg constructor that creates a default triangle with the points (0, 0),
(1, 1), and (2, 5).
■■ A constructor that creates a triangle with the specified points.
■■ A method getArea() that returns the area of the triangle.
■■ A method getPerimeter() that returns the perimeter of the triangle.
■■ A method contains(MyPoint p) that returns true if the specified point
p is inside this triangle (see Figure 10.22a).
■■ A method contains(Triangle2D t) that returns true if the specified
triangle is inside this triangle (see Figure 10.22b).
■■ A method overlaps(Triangle2D t) that returns true if the specified
triangle overlapswith this triangle.
Draw the UML diagram for the class and then implement the class. Write a
test program that creates a Triangle2D object t1 using the constructor
new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
new MyPoint(5, 3.5)), displays its area and perimeter, and displays the
result of t1.contains(3, 3), r1.contains(new Triangle2D(new
MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and t1
.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint
(4, –3), MyPoint(2, 6.5))).
(Hint: For the formula to compute the area of a triangle, see Programming
Exercise 2.19. To detect whether a point is inside a triangle, draw three
dashed lines, as shown in Figure 10.23. Let Δ denote the area of a triangle.
If ΔABp + ΔACp + ΔBCp == ΔABC, the point p is inside the triangle, as
shown in Figure 10.23a. Otherwise, point p is not inside the triangle, as
shown in Figure 10.23b.)
 */
package chapter10.oothinking.exercises.Exercise_10_12;

import chapter10.oothinking.exercises.Exercise_10_04.MyPoint;

public class Triangle2D {
    private MyPoint p1, p2, p3;
    private double[] sides = new double[3];

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sides[0] = MyPoint.distance(p1, p2);
        this.sides[1] = MyPoint.distance(p2, p3);
        this.sides[2] = MyPoint.distance(p1, p3);
    }

    public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
        this.sides[0] = MyPoint.distance(p1, p2);
        this.sides[1] = MyPoint.distance(p2, p3);
        this.sides[2] = MyPoint.distance(p1, p3);
    }

    public double getArea() {
        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.pow((s * (s - sides[0]) * (s - sides[1]) * (s - sides[2])), 0.5);
    }

    public double getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }


    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }


    public boolean contains(double x, double y) {
        MyPoint aPoint = new MyPoint(x, y);
        Triangle2D t1 = new Triangle2D(p1, p2, aPoint);
        Triangle2D t2 = new Triangle2D(p2, p3, aPoint);
        Triangle2D t3 = new Triangle2D(p1, p3, aPoint);
        double diff = Math.abs(this.getArea() - (t1.getArea() + t2.getArea() + t3.getArea()));
        if (diff < 0.000001)
            return true;
        else
            return false;
    }

    /**
     * Return true if all points of t1 are contained in this triangle
     */
    public boolean contains(Triangle2D t1) {
        return this.contains(t1.getP1().getX(), t1.getP1().getY())
                && this.contains(t1.getP2().getX(), t1.getP2().getY())
                && this.contains(t1.getP3().getX(), t1.getP3().getY());
    }


    /**
     * Return true if this triangle contains at most 2 points of t1
     */
    public boolean overlaps(Triangle2D t1) {
        return (this.contains(t1.getP1().getX(), t1.getP1().getY())
                || this.contains(t1.getP2().getX(), t1.getP2().getY())
                || this.contains(t1.getP3().getX(), t1.getP3().getY()))
                && !this.contains(t1);
    }

    public MyPoint getCentroid() {
        return new MyPoint((p1.getX() + p2.getX() + p3.getX()) / 3, (p1.getY() + p2.getY() + p3.getY()) / 3);
    }

}
