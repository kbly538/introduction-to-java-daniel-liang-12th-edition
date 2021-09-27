/*
(Financial application: compute commissions) Write a method that computes the
commission, using the scheme in Programming Exercise 5.39. The header of the
method is as follows:
public static double computeCommission(double salesAmount)

 */
package chapter06.methods.exercises;


public class Exercise_6_11 {
    public static void main(String[] args) {

        System.out.printf("%10s%10s\n", "Sales Amount", "Comission");
        for (int i = 10000; i <= 100000; i+=5000) {
            System.out.printf("%-10d%10.1f\n", i, computeCommission(i));
        }
    }
        public static double computeCommission(double salesAmount) {

            double totalSales = 0;
            double comission = 0;


            // until total sales reaches target salesAmount with a tolerance of 0.01
            while (salesAmount - totalSales >= 0.01) {
                double sales = 0.1;
                totalSales += sales;
                if (totalSales <= 5000) comission += sales * 0.08;
                else if (totalSales <= 10000) comission += sales * 0.1;
                else comission += sales * 0.12;

            }
            return comission;
        }

}

/* OUTPUT
Sales Amount Comission
10000          900,0
15000         1500,0
20000         2100,0
25000         2700,0
...
80000         9300,0
85000         9900,0
90000        10500,0
95000        11100,0
100000       11700,0
*/