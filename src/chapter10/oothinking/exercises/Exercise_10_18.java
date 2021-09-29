/*
(Large prime numbers) Write a program that finds five prime numbers larger
than Long.MAX_VALUE.
 */
package chapter10.oothinking.exercises;

import chapter09.ObjectsAndClasses.exercises.Exercise_09_06.Stopwatch;

import java.math.BigInteger;

public class Exercise_10_18 {
    public static void main(String[] args) {


        Stopwatch stopwatch = new Stopwatch();
        BigInteger bigInt = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        stopwatch.start();
        int counter = 0;
        while (counter < 5) {
            if (isPrime(bigInt)) {
                System.out.println(bigInt);
                counter++;
            }
            bigInt = bigInt.add(BigInteger.ONE);
        }
        stopwatch.stop();
        System.out.println(stopwatch.getElapsedTime());

    }

    public static boolean isPrime(BigInteger bigInt) {
        if (bigInt.compareTo(BigInteger.ONE) == 0 || bigInt.compareTo(BigInteger.TWO) == 0) {
            return true;
        }

        BigInteger halfBigInt = bigInt.divide(new BigInteger("2"));

        for (BigInteger i = new BigInteger("2");
             i.compareTo(halfBigInt) <= 0;
             i = i.add(BigInteger.ONE)) {
            if (bigInt.remainder(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }


}
