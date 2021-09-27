/*
(Display calendars) Write a program that prompts the user to enter the year and
first day of the year and displays the calendar table for the year on the console. For
example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year, as follows:
January 2013
Sun Mon Tue Wed Thu Fri Sat
         1   2   3   4   5
 6   7   8   9  10  11  12
13  14  15  16  17  18  19
20  21  22  23  24  25  26
27  28  29  30  31
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_29 {
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

            if (month == 2)
                days = isLeapYear ? 29 : 28;
            else if (month == 4 || month == 6
                    || month == 9 || month == 11)
                days = 30;
            else
                days = 31;


            System.out.println("                    " + monthName + " " + year + "                      ");
            System.out.println("====================================================");
            System.out.printf("%7s%7s%7s%7s%7s%7s%7s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            // Shift the beginning to the right
            for (int i = 0; i < day; i++) {
                System.out.printf("%7s", " ");
            }

            // i = index e.g. 1 for Monday
            // j = nth day in month
            for (int i = day + 1, j = 1; j <= days; i++, j++) {
                System.out.printf("%7d", j);
                if (i % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println();

            // First day of the month
            day += days;
            day %= 7;
        }
    }
}

/* OUTPUT
                    January 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                                         1      2
      3      4      5      6      7      8      9
     10     11     12     13     14     15     16
     17     18     19     20     21     22     23
     24     25     26     27     28     29     30
     31

                    February 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
             1      2      3      4      5      6
      7      8      9     10     11     12     13
     14     15     16     17     18     19     20
     21     22     23     24     25     26     27
     28

                    March 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
             1      2      3      4      5      6
      7      8      9     10     11     12     13
     14     15     16     17     18     19     20
     21     22     23     24     25     26     27
     28     29     30     31

                    April 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                                  1      2      3
      4      5      6      7      8      9     10
     11     12     13     14     15     16     17
     18     19     20     21     22     23     24
     25     26     27     28     29     30

                    May 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                                                1
      2      3      4      5      6      7      8
      9     10     11     12     13     14     15
     16     17     18     19     20     21     22
     23     24     25     26     27     28     29
     30     31

                    June 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                    1      2      3      4      5
      6      7      8      9     10     11     12
     13     14     15     16     17     18     19
     20     21     22     23     24     25     26
     27     28     29     30

                    July 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                                  1      2      3
      4      5      6      7      8      9     10
     11     12     13     14     15     16     17
     18     19     20     21     22     23     24
     25     26     27     28     29     30     31


                    August 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
      1      2      3      4      5      6      7
      8      9     10     11     12     13     14
     15     16     17     18     19     20     21
     22     23     24     25     26     27     28
     29     30     31

                    September 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                           1      2      3      4
      5      6      7      8      9     10     11
     12     13     14     15     16     17     18
     19     20     21     22     23     24     25
     26     27     28     29     30

                    October 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                                         1      2
      3      4      5      6      7      8      9
     10     11     12     13     14     15     16
     17     18     19     20     21     22     23
     24     25     26     27     28     29     30
     31

                    November 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
             1      2      3      4      5      6
      7      8      9     10     11     12     13
     14     15     16     17     18     19     20
     21     22     23     24     25     26     27
     28     29     30

                    December 2021
====================================================
    Sun    Mon    Tue    Wed    Thu    Fri    Sat
                           1      2      3      4
      5      6      7      8      9     10     11
     12     13     14     15     16     17     18
     19     20     21     22     23     24     25
     26     27     28     29     30     31


Process finished with exit code 0

 */
