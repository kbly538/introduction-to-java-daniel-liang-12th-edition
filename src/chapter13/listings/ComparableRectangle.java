/* Listing 13.9 */
package chapter13.listings;

import chapter13.listings.Rectangle.Rectangle;
import org.jetbrains.annotations.NotNull;

public class ComparableRectangle extends Rectangle implements Comparable<Rectangle> {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(@NotNull Rectangle o) {
        return getArea() > o.getArea() ? 1 : (getArea() < o.getArea() ? -1 : 0);
    }

    @Override
    public boolean equals(Object obj) {
        return getArea() == ((ComparableRectangle) obj).getArea();
    }

    @Override
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() + " Area: " + getArea();
    }
}
