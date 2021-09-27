/*
(Conversion from miles to kilometers) Write a program that displays the following
two tables side by side:
Miles Kilometers | Kilometers Miles
1       1.609    | 20       12.430
2       3.218    | 25       15.538
. . .
9       14.481   | 60       37.290
10      16.090   | 65       40.398
 */
package chapter05.loops.exercises;


public class Exercise_5_06 {
    public static void main(String[] args) {

        final double KM_PER_MILE = 1.609;

        System.out.printf("%-10s%4s%-2s", "Miles", " ", "Kilometers");
        System.out.printf("%3s%10s%4s%-2s\n", " ", "Kilometers", " ", "Miles");
        for (int mile = 1, km = 20; mile <= 20; mile += 2, km += 5) {
            System.out.printf("%-3d%7s%10.3f", mile, " ", mile * KM_PER_MILE);
            System.out.printf("%3s|%3s%-3d%7s%10.3f\n", " ", " ", km, " ", km / KM_PER_MILE);
        }
    }
}
