/*
(Approximate e) Use BigDecimal with 25 digits of precision
in the computation. Write a program that displays the e value for i = 100,
200, . . . , and 1000.
 */

package chapter10.oothinking.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise_10_20 {

    public static void main(String[] args) {

        for (BigDecimal i = BigDecimal.valueOf(100);
             i.compareTo(new BigDecimal("1000")) <= 0;
             i = i.add(new BigDecimal("100"))) {
            apprxE(i);
        }

    }

    public static void apprxE(BigDecimal iterations) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;

        for (BigDecimal i = BigDecimal.ONE;
             i.compareTo(iterations) <= 0;
             i = i.add(BigDecimal.ONE)) {
            term = term.multiply(i); //term *= i;
            e = e.add((BigDecimal.ONE).divide(term, 25, RoundingMode.HALF_UP)); //e += (1 / term);
        }

        System.out.print("Iterations: " + iterations + " | Approximation: " + e + "\n");
    }
}

/*
Iterations: 100  | Approximation: 2.7182818284590452353602875
Iterations: 200  | Approximation: 2.7182818284590452353602875
Iterations: 300  | Approximation: 2.7182818284590452353602875
Iterations: 400  | Approximation: 2.7182818284590452353602875
Iterations: 500  | Approximation: 2.7182818284590452353602875
Iterations: 600  | Approximation: 2.7182818284590452353602875
Iterations: 700  | Approximation: 2.7182818284590452353602875
Iterations: 800  | Approximation: 2.7182818284590452353602875
Iterations: 900  | Approximation: 2.7182818284590452353602875W
Iterations: 1000 | Approximation: 2.7182818284590452353602875W
 */