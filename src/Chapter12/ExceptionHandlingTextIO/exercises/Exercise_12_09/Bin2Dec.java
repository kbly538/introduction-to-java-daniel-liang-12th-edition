/*
(BinaryFormatException) Exercise 12.7 implements the bin2Dec method
to throw a BinaryFormatException if the string is not a binary string. Define
a custom exception called BinaryFormatException. Implement the bin2Dec
method to throw a BinaryFormatException if the string is not a binary string.
 */
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) throws BinaryFormatException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String binary = input.nextLine();

        System.out.println("The decimal value of the binary number is " + binary
                + " is " + bin2Dec(binary));
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        if (!isBinaryString(binaryString))
            throw new BinaryFormatException(binaryString);
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
asd
Exception in thread "main" Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09.BinaryFormatException: asd is not a binary number
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09.Bin2Dec.bin2Dec(Bin2Dec.java:25)
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09.Bin2Dec.main(Bin2Dec.java:20)

Enter a binary number:
123
Exception in thread "main" Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09.BinaryFormatException: 123 is not a binary number
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09.Bin2Dec.bin2Dec(Bin2Dec.java:25)
	at Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_09.Bin2Dec.main(Bin2Dec.java:20)

 Enter a binary number:
1111111111
The decimal value of the binary number is 1111111111 is 1023

 */