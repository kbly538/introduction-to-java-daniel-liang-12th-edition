/* Listing 9.8 */
package chapter09.ObjectsAndClasses.listings;

public class CircleWithPrivateDataFields {
    private static int numberOfObjects = 0;
    private double radius = 1;

    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
