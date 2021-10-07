/* Listing 11.5 */
package Chapter11.InheritenceAndPolymorphism.listings;

import Chapter11.InheritenceAndPolymorphism.listings.GeometricObject.Circle;
import Chapter11.InheritenceAndPolymorphism.listings.GeometricObject.GeometricObject;
import Chapter11.InheritenceAndPolymorphism.listings.GeometricObject.Rectangle;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    /**
     * Display geometric object properties
     */
    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
