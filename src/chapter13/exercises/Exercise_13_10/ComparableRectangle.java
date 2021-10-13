package chapter13.exercises.Exercise_13_10;

import chapter13.exercises.Exercise_13_05.GeometricObject;
import org.jetbrains.annotations.NotNull;


public class ComparableRectangle extends GeometricObject implements Comparable<ComparableRectangle> {
    private double width;
    private double height;

    public ComparableRectangle() {
        this(1, 2);
    }

    public ComparableRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(@NotNull ComparableRectangle o) {
        return getArea() > o.getArea() ? 1 : (getArea() < o.getArea() ? -1 : 0);
    }

    @Override
    public boolean equals(Object o) {
        return getArea() == ((ComparableRectangle) o).getArea();
    }


    @Override
    public String toString() {
        return "ComparableRectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
