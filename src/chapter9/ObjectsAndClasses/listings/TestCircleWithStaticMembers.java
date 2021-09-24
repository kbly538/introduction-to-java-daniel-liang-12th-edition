/* Listing 9.7 */
package chapter9.ObjectsAndClasses.listings;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of circles is " + CircleWithStaticMembers.getNumberOfObjects());

        CircleWithStaticMembers circle1 = new CircleWithStaticMembers();

        System.out.println("After creating circle1");
        System.out.println("Circle1: radius (" + circle1.radius + ") and number of objects ("
                + circle1.getNumberOfObjects() + ")");

        CircleWithStaticMembers circle2 = new CircleWithStaticMembers(5);

        circle1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("circle1:radius (" + circle1.radius + ") and number of circles is ("
                + circle1.getNumberOfObjects() + ")");
        System.out.println("circle2:radius (" + circle2.radius + ") and number of circles is ("
                + circle2.getNumberOfObjects() + ")");
    }
}
