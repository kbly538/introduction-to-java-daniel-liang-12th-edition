/*
(The Triangle class) Design a class named Triangle that extends
GeometricObject.
The class contains:
■■ Three double data fields named side1, side2, and side3 with default values
1.0 to denote three sides of a triangle.
■■ A no-arg constructor that creates a default triangle.
■■ A constructor that creates a triangle with the specified side1, side2, and side3.
■■ The accessor methods for all three data fields.
■■ A method named getArea() that returns the area of this triangle.
■■ A method named getPerimeter() that returns the perimeter of this triangle.
■■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_05;

import chapter11.InheritenceAndPolymorphism.listings.GeometricObject.GeometricObject;

import java.util.Scanner;

public class TestTriangle extends GeometricObject {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides for the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color: ");
        String color = input.next();
        System.out.println("Is triangle filled? Y/N: ");

        String filled = input.next().toLowerCase();
        boolean isFilled = filled.startsWith("y");

        Triangle t1 = new Triangle(side1, side2, side3);
        t1.setColor(color);
        t1.setFilled(isFilled);

        System.out.println(t1.toString());
        System.out.println("Color: " + t1.getColor() + " filled: " + t1.isFilled());


    }
}

/* OUTPUT
Enter three sides for the triangle:
0 1 2
Enter the color:
Black
Is triangle filled? Y/N:
Y
Exception in thread "main" Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_05.IllegalTriangleException: The sum of any two sides must be greater than the other.
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_05.Triangle.<init>(Triangle.java:41)
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_05.TestTriangle.main(TestTriangle.java:45)
 */
