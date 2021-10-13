/* Listing 13.2 */
package chapter13.listings.Circle;

import chapter13.listings.GeometricObject.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }


    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}
