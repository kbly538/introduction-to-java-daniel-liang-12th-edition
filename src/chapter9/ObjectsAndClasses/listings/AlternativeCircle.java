/*  Listing 9.2 */
package chapter9.ObjectsAndClasses.listings;

public class AlternativeCircle {
    double radius;

    AlternativeCircle() {
        radius = 1;
    }

    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    public static void main(String[] args) {
        // Create a circle with radius 1
        AlternativeCircle circle1 = new AlternativeCircle();
        System.out.println("The area of the circle of radius " +
                circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        AlternativeCircle circle2 = new AlternativeCircle(25);
        System.out.println("The area of the circle of radius " +
                circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        AlternativeCircle circle3 = new AlternativeCircle(125);
        System.out.println("The area of the circle of radius " +
                circle3.radius + " is " + circle3.getArea());

        // Modify the circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " +
                circle2.radius + " is " + circle2.getArea());
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

}

