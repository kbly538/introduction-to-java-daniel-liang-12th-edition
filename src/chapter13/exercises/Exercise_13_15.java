/*
(Use BigInteger for the Rational class) Redesign and implement the Rational
class in Listing 13.13 using BigInteger for the numerator and denominator.
Write a test program that prompts the user to enter two rational numbers
and display the results.
 */
package chapter13.exercises;

import chapter13.exercises.Exercise_13_14.Rational;

import java.util.Scanner;

public class Exercise_13_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first rational number: ");
        Rational a = new Rational(input.nextBigInteger(), input.nextBigInteger());
        System.out.println("Enter second rational number: ");
        Rational b = new Rational(input.nextBigInteger(), input.nextBigInteger());
        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " - " + b + " = " + a.subtract(b));
        System.out.println(a + " / " + b + " = " + a.divide(b));
        System.out.println(a + " * " + b + " = " + a.multiply(b));
        System.out.println(b + " is " + b.bigDecimalValue());
    }
}


/* OUTPUT
Enter first rational number:
3 454
Enter second rational number:
7 2389

3 / 454 + 7 / 2389 = 10345 / 1084606
3 / 454 - 7 / 2389 = 3989 / 1084606
3 / 454 / 7 / 2389 = 7167 / 3178
3 / 454 * 7 / 2389 = 21 / 1084606
7 / 2389 is 0.002930096274591879447
 */