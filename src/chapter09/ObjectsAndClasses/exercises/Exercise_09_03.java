/*
(Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively.
*/
package chapter09.ObjectsAndClasses.exercises;

import java.util.Date;

public class Exercise_09_03 {
    public static void main(String[] args) {
        Date date = new Date();
        for (long i = 10000; i < Math.pow(10, 12); i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}

/* OUTPUT
Thu Jan 01 02:00:10 EET 1970
Thu Jan 01 02:01:40 EET 1970
Thu Jan 01 02:16:40 EET 1970
Thu Jan 01 04:46:40 EET 1970
Fri Jan 02 05:46:40 EET 1970
Mon Jan 12 15:46:40 EET 1970
Sun Apr 26 19:46:40 EET 1970
Sat Mar 03 11:46:40 EET 1973
 */