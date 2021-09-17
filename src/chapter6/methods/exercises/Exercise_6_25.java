/*
(Convert milliseconds to hours, minutes, and seconds) Write a method that converts
milliseconds to hours, minutes, and seconds using the following header:

public static String convertMillis(long millis)

The method returns a string as hours:minutes:seconds. For example, convertMillis(
5500) returns a string 0:0:5, convertMillis(100000)
returns a string 0:1:40, and convertMillis(555550000) returns a string
154:19:10. Write a test program that prompts the user to enter a long integer
for milliseconds and displays a string in the format of hours:minutes:seconds.
 */
package chapter6.methods.exercises;

import java.util.Scanner;

public class Exercise_6_25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter millis: ");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));

    }

    public static String convertMillis(long millis) {
        // Total seconds
        long totalSeconds = millis / 1000;

        // Current seconds
        long currentSeconds = totalSeconds % 60;

        // Total minutes
        long totalMinutes = totalSeconds / 60;

        // Current minutes
        long currentMinutes = totalMinutes % 60;

        // Total hours
        long totalHours = totalMinutes / 60;

        return totalHours + ":" + currentMinutes + ":" + currentSeconds;
    }


}
/* OUTPUT
Enter millis: 10000
0:0:10

Enter millis: 1000000
0:16:40

Enter millis: 4586343684684
1273984:21:24
*/