package chapter10.oothinking.exercises.Exercise_10_11;

import javafx.scene.shape.Circle;

public class Circle2D {
    private double x, y, radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return this.radius >= Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public boolean contains(Circle2D circleB) {
        return Math.abs(this.radius - circleB.getRadius()) >= Math.sqrt(Math.pow(circleB.getX() - this.x, 2)
                + Math.pow(circleB.getY() - this.y, 2));
    }

    public boolean overlaps(Circle2D circleB) {
        double centersDistance = Math.sqrt(Math.pow(circleB.getX() - this.x, 2)
                + Math.pow(circleB.getY() - this.y, 2));
        return this.radius + circleB.getRadius() >= centersDistance;
    }

}
