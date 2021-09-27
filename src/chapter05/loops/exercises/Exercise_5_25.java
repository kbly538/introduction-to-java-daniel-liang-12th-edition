/*
(Compute p) You can approximate p by using the following summation:

PI = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - .......... + (-)^i+1 / 2i-1)
 */

package chapter05.loops.exercises;

public class Exercise_5_25 {
    public static void main(String[] args) {

        double denominator = 1;
        double pi = 0;
        int terms = 1000000;

        while (denominator <= terms) {

            pi += (4 / denominator);
            pi *= -1;
            denominator += 2;
        }

        System.out.println(pi);


    }
}

