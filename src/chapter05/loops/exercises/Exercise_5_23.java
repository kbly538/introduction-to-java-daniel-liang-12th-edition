/*
(Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0
+ 0.000000001 is equal to 100000000.0. To avoid cancellation errors and
obtain more accurate results, carefully select the order of computation. For example,
in computing the following summation, you will obtain more accurate
results by computing from right to left rather than from left to right:
1 + 1/2 + 1/3 + ...... 1/n
Write a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000.
 */

package chapter05.loops.exercises;

public class Exercise_5_23 {
    public static void main(String[] args) {
        // from left to right summation
        double denominator = 1;
        int numberOfElements = 50000;
        double resultLR = 0;

        while (denominator <= numberOfElements) {

            resultLR += (1 / denominator);
            denominator++;
        }

        System.out.println(resultLR); // left to right summation result

        denominator = numberOfElements;
        double resultRL = 0;
        while (denominator >= 1) {
            resultRL += (1 / denominator);
            denominator--;
        }
        System.out.println(resultRL); // right to left summation result

    }
}

