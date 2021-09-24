/* Listing 9.11 */
package chapter9.ObjectsAndClasses.listings;

public class TestPassObject {
    public static void main(String[] args) {

        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        int n = 5;
        printAreas(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);


    }

    public static void printAreas(CircleWithPrivateDataFields circle, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(circle.getRadius() + "\t\t" + circle.getArea());
            circle.setRadius(circle.getRadius() + 1);
            times--;
        }
    }

}
