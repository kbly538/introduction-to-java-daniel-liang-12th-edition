/*
(Estimate p) p can be computed using the following summation:
m(i) = 4 * (1-1/3+1/5-1/7+....+ (-1)^i+1 / (2i-1))
 */
package chapter6.methods.exercises;


public class Exercise_6_14 {
    public static void main(String[] args) {

        System.out.printf("%-10s %4s\n", "i", "m(i)");
        for (int i = 1; i <= 901 ; i+=100) {
            System.out.printf("%-10d%6.4f\n", i, piApproximation(i));
        }
    }

    public static double piApproximation(int terms){

        double pi = 0;


        for (int i = 1, c = 1; i <= terms*2; i+=2, c*=-1) {
            pi += (4 * 1.0 / i) * c;
        }
        return pi;
    }

}

/* OUTPUT
i          m(i)
1         4,0000
101       3,1515
201       3,1466
301       3,1449
401       3,1441
501       3,1436
601       3,1433
701       3,1430
801       3,1428
901       3,1427
*/