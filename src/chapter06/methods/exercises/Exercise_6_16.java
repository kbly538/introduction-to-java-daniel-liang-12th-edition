/*
(Number of days in a year) Write a method that returns the number of days in a
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2000 to 2020.
 */
package chapter06.methods.exercises;


public class Exercise_6_16 {
    public static void main(String[] args) {

        for (int i = 2000; i <= 2020; i++) {
            System.out.println(i + " " + numberOfDaysInAYear(i) + " days");
        }
    }
    public static int numberOfDaysInAYear(int year){
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear)
            return 366;
        else
            return 365;
    }

}

/* OUTPUT
2000 366 days
2001 365 days
2002 365 days
2003 365 days
2004 366 days
...
2014 365 days
2015 365 days
2016 366 days
2017 365 days
2018 365 days
2019 365 days
2020 366 days
*/