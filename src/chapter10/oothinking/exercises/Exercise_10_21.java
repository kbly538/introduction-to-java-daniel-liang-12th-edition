/*
(Divisible by 5 or 6) Find the first 10 numbers greater than Long.MAX_VALUE
that are divisible by 5 or 6.
 */

package chapter10.oothinking.exercises;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercise_10_21 {
    public static void main(String[] args) {

        String a = "DFSADSA";

        final int NUMBER_OF_INTEGERS_FOR_DISPLAY = 10;

        BigInteger value = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int counter = 0;
        while (counter < NUMBER_OF_INTEGERS_FOR_DISPLAY) {
            value = value.add(BigInteger.ONE);
            if (value.mod(BigInteger.valueOf(5)) == BigInteger.ZERO || value.mod(BigInteger.valueOf(6)) == BigInteger.ZERO) {
                System.out.println(value);
                counter++;
            }
        }
    }

}

/*
9223372036854775810
9223372036854775812
9223372036854775815
9223372036854775818
9223372036854775820
9223372036854775824
9223372036854775825
9223372036854775830
9223372036854775835
9223372036854775836
 */