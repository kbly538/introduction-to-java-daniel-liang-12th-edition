/* Listing 9.6 */
package chapter9.ObjectsAndClasses.listings;

public class CircleWithStaticMembers {
    public static int numberOfObjects = 0;
    double radius;

    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
