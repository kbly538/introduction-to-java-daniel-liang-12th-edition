/*
(Conversion from miles to kilometers) Write a program that displays the following
table (note 1 mile is 1.609 kilometers):
Miles Kilometers
1       1.609
2       3.218
. . .
9       14.481
10      16.090
 */
package chapter05.loops.exercises;


public class Exercise_5_04 {
    public static void main(String[] args) {

        final double KM_PER_MILE = 1.609;

        System.out.printf("%-5s%4s%-2s\n", "Miles", " ", "Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            System.out.printf("%-3d%6s%-5.3f\n", miles, " ", miles * KM_PER_MILE);
        }
    }
}
