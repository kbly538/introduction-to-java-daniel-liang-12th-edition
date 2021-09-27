/*
(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
■■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■■ A no-arg constructor that creates a default rectangle.
■■ A constructor that creates a rectangle with the specified width and height.
■■ A method named getArea() that returns the area of this rectangle.
■■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test program
that creates two Rectangle objects—one with width 4 and height 40, and
three objectives the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.
 */
package chapter09.ObjectsAndClasses.exercises.Exercise_09_01;

public class Rectangle {

    private double width = 1;
    private double height = 1;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
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

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width * height);
    }
}
