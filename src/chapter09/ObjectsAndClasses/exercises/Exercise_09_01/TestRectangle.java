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

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.printf("rectangle1: \nwidth: %f \nheight: %f \narea: %f \nperimeter: %f\n", rectangle1.getWidth(),
                rectangle1.getHeight(), rectangle1.getArea(), rectangle1.getPerimeter());
        System.out.printf("\nrectangle2: \nwidth: %f \nheight: %f \narea: %f \nperimeter: %f", rectangle2.getWidth(),
                rectangle2.getHeight(), rectangle2.getArea(), rectangle2.getPerimeter());

    }
}


/* OUTPUT
rectangle1:
width: 4,000000
height: 40,000000
area: 160,000000
perimeter: 320,000000

rectangle2:
width: 3,500000
height: 35,900000
area: 125,650000
perimeter: 251,300000
 * */