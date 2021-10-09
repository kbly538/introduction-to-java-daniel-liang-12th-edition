/*
(NumberFormatException) Listing 6.8 implements the hex2Dec(String
hexString) method, which converts a hex string into a decimal number.
Implement the hex2Dec method to throw a NumberFormatException if the
string is not a hex string. Write a test program that prompts the user to enter
a hex number as a string and displays its decimal equivalent. If the method
throws an exception, display “Not a hex number”.
 */
package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_08;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) throws HexFormatException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value of the hex number is " + hex
                + " is " + hexToDecimal(hex.toUpperCase()));
    }

    private static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    private static int hexCharToDecimal(char hexChar) throws HexFormatException {
        if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + hexChar - 'A';
        } else if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else {
            throw new HexFormatException(hexChar);
        }
    }
}

/* OUTPUT
Enter a hex number:
saddfsa
Exception in thread "main" Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_08.HexFormatException: S is not a hex number.
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_08.Hex2Dec.hexCharToDecimal(Hex2Dec.java:41)
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_08.Hex2Dec.hexToDecimal(Hex2Dec.java:29)
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_08.Hex2Dec.main(Hex2Dec.java:22)


Enter a hex number:
12F
The decimal value of the hex number is 12F is 303

 */