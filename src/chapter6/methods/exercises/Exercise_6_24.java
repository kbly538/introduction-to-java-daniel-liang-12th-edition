/*
(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
current time. Revise this example to display the current date and time. The calendar
example in Listing 6.12, PrintCalendar.java, should give you some ideas on
how to find the year, month, and day.
 */
package chapter6.methods.exercises;

public class Exercise_6_24 {
    public static void main(String[] args) {

        final int TIME_ZONE_OFFSET = 3;

        // Total milliseconds from Jan 1 1970
        long totalMillis = System.currentTimeMillis();

        // Total seconds
        long totalSeconds = totalMillis / 1000;

        // Current Second
        long currentSecond = (int) (totalSeconds % 60);

        // Total minutes
        long totalMinutes = totalSeconds / 60;

        //Current minutes
        long currentMinutes = (int) (totalMinutes % 60);

        //Total hours
        long totalHours = totalMinutes / 60;

        //Current hour
        long currentHour = (int) (totalHours % 24);

        // total days
        int totalDays = (int) (totalHours / 24);
        if (currentHour > 0) totalDays++;

        // current year
        int currentYear = getYear(totalDays);

        // current month
        int currentMonth = getMonth(totalDays, currentYear);

        // current day
        int currentDay = getDay(currentYear, currentMonth, totalDays);


        displayTime(currentHour, currentMinutes, currentSecond, TIME_ZONE_OFFSET);
        displayDate(currentYear, currentMonth, currentDay);

    }

    /**
     * Return current day 1-31
     */
    private static int getDay(int currentYear, int currentMonth, int totalDays) {
        int currentDaysInTheYear = totalDays - getTotalDaysToYear(currentYear - 1);
        return currentDaysInTheYear - getTotalDaysInMonths(currentYear, currentMonth - 1);
    }

    /**
     * return total days in a specified year
     */
    private static int totalNumberOfDayInTheYear(int year) {
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }

    /**
     * return current month
     */
    public static int getMonth(long totalDays, int currentYear) {
        long totalNumberOfDaysInTheYear = totalDays - getTotalDaysToYear(currentYear - 1);
        int currentMonth = 0;
        do {
            currentMonth++;
        } while (getTotalDaysInMonths(currentYear, currentMonth) < totalNumberOfDaysInTheYear);
        return currentMonth;
    }

    /**
     * Return current year
     */
    public static int getYear(long totalDays) {
        int year = 1970;
        while (totalDays - (isLeapYear(year) ? 366 : 365) >= 0) {
            year++;
            if (isLeapYear(year))
                totalDays -= 366;
            else
                totalDays -= 365;
        }


        return year;
    }

    /**
     * Get total days until specified year
     */
    public static int getTotalDaysToYear(int year) {

        int total = 0;

        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;
        }
        return total;
    }

    /**
     * Get total days to a specified month in a specified year.
     */
    public static int getTotalDaysInMonths(int year, int month) {
        int total = 0;
        for (int i = 1; i <= month; i++) {
            total += getNumOfDaysInMonth(year, i);
        }
        return total;
    }

    /**
     * Get the number of days in a month
     */
    static int getNumOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            if (isLeapYear(year))
                return 29;
            else
                return 28;

        return 0; // If month is incorrect.
    }


    /**
     * Prints date DD/MM/YYYY
     */
    public static void displayDate(int currentYear, int currentMonth, int currentDay) {
        System.out.printf("%02d/%02d/%04d\n", currentDay, currentMonth, currentYear);
    }

    /**
     * Prints time
     */
    public static void displayTime(long hour, long minutes, long seconds, int timeZoneOffset) {
        System.out.printf("Current Time: %02d:%02d:%02d\n", hour + timeZoneOffset, minutes, seconds);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
/* OUTPUT
Current Time: 14:15:40
16/09/2021
*/