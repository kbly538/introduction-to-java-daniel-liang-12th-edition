/* Listing 9.9 */
package chapter09.ObjectsAndClasses.listings;

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {

        CircleWithPrivateDataFields circle1 = new CircleWithPrivateDataFields(5);

        System.out.println("The area of the circle of radius "
                + circle1.getRadius() + " is " + circle1.getArea());

        circle1.setRadius(circle1.getRadius() * 1.1);


        System.out.println("The area of the circle of radius "
                + circle1.getRadius() + " is " + circle1.getArea());
        System.out.println("The number of objects created is "
                + CircleWithPrivateDataFields.getNumberOfObjects());
    }


}
