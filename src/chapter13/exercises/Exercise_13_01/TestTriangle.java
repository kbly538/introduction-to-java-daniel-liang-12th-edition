/*
(Triangle class) Design a new Triangle class that extends the abstract
GeometricObject
class. Draw the UML diagram for the classes Triangle and
GeometricObject then implement the Triangle class. Write a test program
that prompts the user to enter three sides of the triangle, a color, and a Boolean
value to indicate whether the triangle is filled. The program should create a Triangle
object with these sides, and set the color and filled properties using the
input. The program should display the area, perimeter, color, and true or false to
indicate whether it is filled or not.
 */
package chapter13.exercises.Exercise_13_01;

public class TestTriangle {
    public static void main(String[] args) throws Exception {

        try {
            Triangle t1 = new Triangle();
            //Triangle t2 = new Triangle(1,2,3);
            Triangle t3 = new Triangle(2, 2, 2);
            Triangle t4 = new Triangle(5, 8, 4, "Orange", true);

            System.out.println(t1);
            //System.out.println(t2);
            System.out.println(t3);
            System.out.println(t4);

            System.out.println(t4.getPerimeter());
            System.out.println(t4.getArea());
            System.out.println(t4.getColor());
            System.out.println(t4.isFilled());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

/* OUTPUT
Triangle{side1=1.0, side2=1.0, side3=1.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 17:27:43 EET 2021}
Triangle{side1=2.0, side2=2.0, side3=2.0} GeometricObject{color='White', filled=true, dateCreated=Mon Oct 11 17:27:43 EET 2021}
Triangle{side1=5.0, side2=8.0, side3=4.0} GeometricObject{color='Orange', filled=true, dateCreated=Mon Oct 11 17:27:43 EET 2021}
17.0
8.181534085976786
Orange
true
 */