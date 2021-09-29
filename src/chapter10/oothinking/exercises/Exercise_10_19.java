/*
(Mersenne prime) A prime number is called a Mersenne prime if it can be
written in the form 2p - 1 for some positive integer p. Write a program that
finds all Mersenne primes with p … 100 and displays the output as shown
below. (Hint: You have to use BigInteger to store the number because it is
too big to be stored in long. Your program may take several hours to run.)
 */
package chapter10.oothinking.exercises;

import chapter09.ObjectsAndClasses.exercises.Exercise_09_06.Stopwatch;

import java.math.BigInteger;

public class Exercise_10_19 {
    public static void main(String[] args) {

        final int MERSENNE_PRIME_NUMBER = 8;
        int num = 2;
        int counter = 0;
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        while (counter < MERSENNE_PRIME_NUMBER) {
            if (isPrime(BigInteger.TWO.pow(num).subtract(BigInteger.ONE))) {
                System.out.print(num + "->");
                System.out.println(" p^2-1 = " + (BigInteger.TWO.pow(num).subtract(BigInteger.ONE)));
                counter++;
            }
            num++;
        }
        stopwatch.stop();
        System.out.println(stopwatch.toString());
    }

    public static boolean isPrime(BigInteger bigNumber) {

        for (BigInteger i = new BigInteger("2");
             i.compareTo(bigNumber.sqrt()) <= 0;
             i = i.add(BigInteger.ONE)) {
            if (bigNumber.remainder(i).equals(BigInteger.ZERO))
                return false;
        }
        return true;
    }

}

/*
2-> p^2-1 = 3
3-> p^2-1 = 7
5-> p^2-1 = 31
7-> p^2-1 = 127
13-> p^2-1 = 8191
17-> p^2-1 = 131071
19-> p^2-1 = 524287
31-> p^2-1 = 2147483647
Elapsed time since start 69 ms
 */