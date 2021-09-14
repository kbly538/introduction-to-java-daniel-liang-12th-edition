/*
(Financial application: compute future tuition) Suppose the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition will
be $10,500. Write a program that displays the tuition in 10 years, and the total
cost of four years’ worth of tuition starting after the tenth year.
 */
package chapter5.loops.exercises;


public class Exercise_5_07 {
    public static void main(String[] args) {

        double tuition = 10000;
        double totalTuition = 0;
        int years = 0;

        for (int year = 1; years <= 10; year++) {
            tuition = tuition * 1.05;
            System.out.printf("Year %d: %5.2f\n", year, tuition);
            years++;
        }

        for (int i = 1; i <= 4; i++) {
            tuition = tuition * 1.05;
            totalTuition += tuition;
        }
        System.out.printf("Total cost of 4 years' tuition after 10 years: %.2f", totalTuition);

    }
}