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
package chapter09.ObjectsAndClasses.exercises;

import java.util.GregorianCalendar;

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
Date: 25/8/2021
Date: 14/1/2009
 */