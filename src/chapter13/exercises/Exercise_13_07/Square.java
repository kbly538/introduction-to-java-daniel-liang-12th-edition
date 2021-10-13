package chapter13.exercises.Exercise_13_07;

import chapter13.exercises.Exercise_13_05.GeometricObject;

public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }
}
