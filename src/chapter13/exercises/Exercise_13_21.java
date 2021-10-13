/*
(Algebra: vertex form equations) The equation of a parabola can be expressed in
either standard form (y = ax^2 + bx + c) or vertex form (y = a(x - h)^2 + k).
Write a program that prompts the user to enter a, b, and c as integers in standard
form and displays h = -b / 2a   and k = (4ac * b^2) / 4a in the vertex form. Display h
and k as rational numbers.
 */
package chapter13.exercises;

import chapter13.listings.RationalNumber.Rational;

import java.util.Scanner;

public class Exercise_13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Rational h = new Rational(-b, 2 * a);
        Rational k = new Rational(4 * a * c - b * b, 4 * a);
        System.out.println("h is " + h + " and " + " k is " + k);
    }
}

/* OUTPUT
Enter a, b, c:
1 3 1
h is -3/2 and  k is -5/4

Enter a, b, c:
2 3 4
h is -3/4 and  k is 23/8
 */