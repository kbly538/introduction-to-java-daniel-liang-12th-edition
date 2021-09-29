/*
(The MyDate class) Design a class named MyDate. The class contains:
■■ The data fields year, month, and day that represent a date. month is 0-based,
i.e., 0 is for January.
■■ A no-arg constructor that creates a MyDate object for the current date.
■■ A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
■■ A constructor that constructs a MyDate object with the specified year, month,
and day.
■■ Three getter methods for the data fields year, month, and day, respectively.
■■ A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.
Draw the UML diagram for the class then implement the class. Write a test
program that creates two MyDate objects (using new MyDate() and new
MyDate(34355555133101L)) and displays their year, month, and day.
(Hint: The first two constructors will extract the year, month, and day
from the elapsed time. For example, if the elapsed time is 561555550000
milliseconds,
the year is 1987, the month is 9, and the day is 18. You may
use the GregorianCalendar
class discussed in Programming Exercise 9.5
to simplify coding.)
 */
package chapter10.oothinking.exercises.Exercise_10_14;

import java.util.GregorianCalendar;

public class MyDate {
    private int year, month, day;

    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH) + 1;
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH) + 1;
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
