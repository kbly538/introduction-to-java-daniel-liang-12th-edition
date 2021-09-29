/*
(Square numbers) Find the first 10 square numbers that are greater than Long.
MAX_VALUE. A square number is a number in the form of n2. For example, 4, 9,
and 16 are square numbers. Find an efficient approach to run your program fast.
 */
package chapter10.oothinking.exercises;

import java.math.BigInteger;

public class Exercise_10_17 {
    public static void main(String[] args) {
        BigInteger value = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        value = value.sqrt();
        for (int i = 0; i < 5; i++) {
            value = value.add(BigInteger.ONE);
            System.out.println(value.pow(2));
        }

    }
}

/* OUTPUT
9223372037000250000
9223372043074251001
9223372049148252004
9223372055222253009
9223372061296254016
 */