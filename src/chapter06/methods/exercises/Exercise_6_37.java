/*
(Format an integer) Write a method with the following header to format the integer
with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size
of the string is the width. For example, format(34, 4) returns 0034 and format(
34, 5) returns 00034. If the number is longer than the width, the method
returns the string representation for the number. For example, format(34, 1)
returns 34.
Write a test program that prompts the user to enter a number and its width, and
displays a string returned by invoking format(number, width).
*/

package chapter06.methods.exercises;

public class Exercise_6_37 {
    public static void main(String[] args) {
        System.out.println(format(134, 4));
    }

    public static String format(int number, int width) {

        int numLength = (number + "").length();

        String formattedNumber = number + "";

        if (width > numLength) {
            for (int i = 0; i < width - numLength; i++) {
                formattedNumber = 0 + formattedNumber;
            }
        }
        return formattedNumber;
    }

}
/* OUTPUT
input : format(134, 4)
output: 0134
*/