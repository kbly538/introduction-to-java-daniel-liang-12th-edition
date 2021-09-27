/*
(Display the first days of each month) Write a program that prompts the user to
enter the year and first day of the year, then displays the first day of each month
in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
January 1, 2013, your program should display the following output:
January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter the first day of the year:(0-6) ");
        int firstDay = input.nextInt();
        int day = firstDay;

        for (int month = 1; month <= 12; month++) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            int days = 0;

            String monthName = "";
            String dayName = "";


            switch (month) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    break;
            }

            switch (day) {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
            }

            if (month == 2 && isLeapYear) {
                days = 29;
            } else if (month == 2) {
                days = 28;
            } else if (month == 2
                    || month == 4
                    || month == 6
                    || month == 9
                    || month == 11) {
                days = 30;
            } else {
                days = 31;
            }

            System.out.printf("%s 1, %d is %s\n", monthName, year, dayName);

            day += days;
            day %= 7;
        }
    }
}
