/*
(NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the bin-
2Dec method to throw a NumberFormatException if the string is not a
binary string. Write a test program that prompts the user to enter a binary
number as a string and displays its decimal equivalent. If the method throws
an exception, display “Not a binary number”.
 */
package chapter12.ExceptionHandlingTextIO.exercises;

import java.util.Scanner;

public class Exercise_12_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String binary = input.nextLine();

        System.out.println("The decimal value of the binary number is " + binary
                + " is " + bin2Dec(binary));
    }

    public static int bin2Dec(String binaryString) {
        if (!isBinaryString(binaryString))
            throw new NumberFormatException("Not a binary number.");
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            decimalValue += (binaryString.charAt(binaryString.length() - 1 - i) - 48) * Math.pow(2, i);
        }
        return decimalValue;

    }

    public static boolean isBinaryString(String binaryString) {
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1')
                return false;
        }
        return true;
    }
}

/* OUTPUT
Enter a binary number:
123
Exception in thread "main" java.lang.NumberFormatException: Not a binary number.
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_07.bin2Dec(Exercise_12_07.java:27)
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_07.main(Exercise_12_07.java:22)

Enter a binary number:
1111
The decimal value of the binary number is 1111 is 15
 */