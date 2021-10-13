/*
(Use the Rational class) Write a program that computes the following summation
series using the Rational class:
1/2+2/3+3/4.......98/99+99/100
You will discover that the output is incorrect because of integer overflow (too
large). To fix this problem, see Programming Exercise 13.15.
 */
package chapter13.exercises;

import chapter13.exercises.Exercise_13_14.Rational;

import java.math.BigInteger;
import java.util.ArrayList;

public class Exercise_13_18 {
    public static void main(String[] args) {

        Rational sum = new Rational();
        ArrayList<Rational> list = new ArrayList<>();

        BigInteger start = BigInteger.ONE;
        BigInteger end = new BigInteger("100");

        while (!start.equals(end)) {
            list.add(new Rational(start, start.add(BigInteger.ONE)));
            start = start.add(BigInteger.ONE);
        }

        for (Rational r : list) {
            sum = sum.add(r);
        }


        System.out.println("The sum of the series is " + sum);
    }
}
