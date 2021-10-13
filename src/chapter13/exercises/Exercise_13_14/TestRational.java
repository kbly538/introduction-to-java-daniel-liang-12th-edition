/*
(Use BigInteger for the Rational class) Redesign and implement the Rational
class in Listing 13.13 using BigInteger for the numerator and denominator.
Write a test program that prompts the user to enter two rational numbers
and display the results
 */

package chapter13.exercises.Exercise_13_14;

import java.math.BigInteger;

public class TestRational {
    public static void main(String[] args) {

        BigInteger n = new BigInteger("1");
        BigInteger d = new BigInteger("-123456789");

        Rational r1 = new Rational(n, d);
        Rational r2 = new Rational(n, d);
        Rational r3 = new Rational(n, d);

        System.out.println("r1 * r2 * r3 is " +
                r1.multiply(r2.multiply(r3)));
    }
}


/* OUTPUT
r1 * r2 * r3 is -1 / 2204193661661244627
r1 * r2 * r3 is 1 / 1881676371789154860897069
r1 * r2 * r3 is -1 / 1881676371789154860897069

 */