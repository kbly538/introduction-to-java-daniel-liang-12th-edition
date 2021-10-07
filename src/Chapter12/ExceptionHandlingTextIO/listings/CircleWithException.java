/* Listing 12.7 */
package Chapter12.ExceptionHandlingTextIO.listings;

public class CircleWithException {

    private static int numberOfObjects = 0;
    private double radius = 1;

    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }

    }

    double getArea() {
        return Math.PI * radius * radius;
    }

}
