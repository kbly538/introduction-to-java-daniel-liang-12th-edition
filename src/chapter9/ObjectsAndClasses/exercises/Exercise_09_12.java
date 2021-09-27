/*
(Use the GregorianCalendar class) Java API has the GregorianCalendar
class in the java.util package, which you can use to obtain the year, month, and
day of a date. The no-arg constructor constructs an instance for the current date,
and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.
MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year,
month, and day. Write a program to perform two tasks:
1. Display the current year, month, and day.
2. The GregorianCalendar class has the setTimeInMillis(long), which
can be used to set a specified elapsed time since January 1, 1970. Set the value
to 1234567898765L and display the year, month, and day.
*/
package chapter9.ObjectsAndClasses.exercises;

import chapter9.ObjectsAndClasses.exercises.Exercise_09_11.LinearEquation;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercise_09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 end points for 2 lines: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = (y3 - y4);
        double d = -(x3 - x4);
        double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            if (linearEquation.getX() != Double.POSITIVE_INFINITY) {
                System.out.println("( " + linearEquation.getX() + ", " + linearEquation.getY() + " )");
            }
        } else {
            System.out.println("Lines are parallel.");
        }

    }
}

/* OUTPUT

Enter 4 end points for 2 lines:
2 2 5 -1,0 4,0 2,0 -1,0 -2,0
( 2.888888888888889, 1.1111111111111112 )

Enter 4 end points for 2 lines:
2 2 7 6,0 4,0 2,0 -1,0 -2,0
Lines are parallel.

 */