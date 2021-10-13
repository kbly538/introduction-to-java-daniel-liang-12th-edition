/* Listing 13.4 */
package chapter13.listings;

import chapter13.listings.Circle.Circle;
import chapter13.listings.GeometricObject.GeometricObject;
import chapter13.listings.Rectangle.Rectangle;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);


    }

    private static void displayGeometricObject(GeometricObject geoObject) {
        System.out.println();
        System.out.println("Thea area is " + geoObject.getArea());
        System.out.println("The perimeter is " + geoObject.getPerimeter());
    }

    private static boolean equalArea(GeometricObject geoObject1, GeometricObject geoObject2) {
        return geoObject1.getArea() == geoObject2.getArea();
    }

}

