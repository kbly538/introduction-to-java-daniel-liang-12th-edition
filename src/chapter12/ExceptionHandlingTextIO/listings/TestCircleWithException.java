/* Listing 12.8 */
package chapter12.ExceptionHandlingTextIO.listings;

public class TestCircleWithException {

    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        } catch (InvalidRadiusException e) {
            System.out.println(e);
        }

        System.out.println("Number of objects created is " + CircleWithCustomException.getNumberOfObjects());
    }

}

class CircleWithCustomException {

    private static int numberOfObjects = 0;
    private double radius = 1;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new InvalidRadiusException(radius);
        }

    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
