/* Lisitng 11.7 */
package Chapter11.InheritenceAndPolymorphism.listings;

import Chapter11.InheritenceAndPolymorphism.listings.GeometricObject.Circle;
import Chapter11.InheritenceAndPolymorphism.listings.GeometricObject.Rectangle;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);
        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);

    }

    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " +
                    ((Circle) object).getArea());
            System.out.println("The circle diameter is " +
                    ((Circle) object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " +
                    ((Rectangle) object).getArea());

        }
    }
}
