/*
(Enable GeometricObject comparable) Modify the GeometricObject class to
implement the Comparable interface and define a static max method in the GeometricObject
class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write
a test program that uses the max method to find the larger of two circles, the larger
of two rectangles.
 */
package chapter13.exercises.Exercise_13_05;

import java.util.Date;

abstract public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this("White", true);
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();

    }

    public static GeometricObject max(GeometricObject geoObject1, GeometricObject geoObject2) {
        return geoObject1.getArea() > geoObject2.getArea() == true ? geoObject1 : (geoObject1.getArea() > geoObject2.getArea() == false ? geoObject2 : null);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
