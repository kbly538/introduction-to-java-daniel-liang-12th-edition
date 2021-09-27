/*
(Compute e) You can approximate e using the following summation:

e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + .......... + 1/i!)
 */

package chapter05.loops.exercises;

public class Exercise_5_26 {
    public static void main(String[] args) {

        double e = 1;
        double term = 1;

        for (int i = 1; i <= 20; i++) {
            term *= i;
            e += (1 / term);
        }

        System.out.printf("%.20f", e);
    }
}
