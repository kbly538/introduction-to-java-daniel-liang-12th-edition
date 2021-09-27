/*
(Sum series) Write a method to compute the following summation:
m(i) = 1 / 2 + 2 / 3 + .... + i / (i + 1)
 */
package chapter06.methods.exercises;


public class Exercise_6_13 {
    public static void main(String[] args) {

        System.out.printf("%-10s %4s\n", "i", "m(i)");
        for (int i = 1; i <= 20 ; i++) {
            System.out.printf("%-10d%6.4f\n", i, sum(i));
        }
    }

    public static double sum(int numberOfTerms){

        double total = 0;

        for (int i = 1; i <= numberOfTerms ; i++) {
            total += (i * 1.0 / (i+1));
            if (i == numberOfTerms) break;
        }

        return total;
    }

}

/* OUTPUT
i          m(i)
1         0,5000
2         1,1667
3         1,9167
4         2,7167
5         3,5500
...
17        14,5049
18        15,4523
19        16,4023
20        17,3546
*/