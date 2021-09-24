/*
(Use the GregorianCalendar class) Java API has the GregorianCalendar
class in the java.util package, which you can use to obtain the year, month, and
day of a date. The no-arg constructor constructs an instance for the current date,
and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.
MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year,
month, and day. Write a program to perform two tasks:
1. Display the current year, month, and day.
2. The GregorianCalendar class has the setTimeInMillis(long), which
can be used to set a specified elapsed time since January 1, 1970. Set the value
to 1234567898765L and display the year, month, and day.
*/
package chapter9.ObjectsAndClasses.exercises;

import java.sql.SQLOutput;
import java.util.GregorianCalendar;
import java.util.Random;

public class Exercise_09_05 {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Date: " + day + "/" + month + "/" + year);

        calendar.setTimeInMillis(1234567898765L);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Date: " + day + "/" + month + "/" + year);

    }
}

/* OUTPUT
87 35 76 24 92 49 41 45 64 50
79 59 72 83 36 75 46 2 23 41
22 71 89 2 93 42 49 42 35 76
32 0 52 95 87 31 99 18 79 2
91 5 55 84 71 95 58 87 77 38 
 */