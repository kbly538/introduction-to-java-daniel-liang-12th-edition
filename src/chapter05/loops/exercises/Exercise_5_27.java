/*
(Display leap years) Write a program that displays all the leap years, 10 per line,
from 101 to 2100, separated by exactly one space. Also display the number of
leap years in this period.

 */

package chapter05.loops.exercises;

public class Exercise_5_27 {
    public static void main(String[] args) {

        int year = 101;
        int counter = 0;

        while (year <= 2100) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            if (isLeapYear) {
                counter++;
                System.out.printf("%4d ", year);
                if (counter % 10 == 0) {
                    System.out.println();
                }

            }
            year++;
        }

    }
}
