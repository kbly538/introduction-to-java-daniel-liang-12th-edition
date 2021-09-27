/*
(Phone keypads) The international standard letter/number mapping for telephones
is given in Programming Exercise 4.15. Write a method that returns a
number, given an uppercase letter, as follows:
public static int getNumber(char uppercaseLetter)
Write a test program that prompts the user to enter a phone number as a string.
The input number may contain letters. The program translates a letter (uppercase
or lowercase) to a digit and leaves all other characters intact.
 */
package chapter06.methods.exercises;


import java.util.Scanner;

public class Exercise_6_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String phoneNumber = input.nextLine().toLowerCase();

        String allDigitsPhoneNumber = "";
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (Character.isAlphabetic(c)) {
                allDigitsPhoneNumber += getNumber(c);
            } else {
                allDigitsPhoneNumber += c + "";
            }
        }

        System.out.println(allDigitsPhoneNumber);

    }

    public static int getNumber(char uppercaseLetter) {

        if ("abc".contains("" + uppercaseLetter)) {
            return 2;
        } else if ("def".contains("" + uppercaseLetter)) {
            return 3;
        } else if ("ghi".contains("" + uppercaseLetter)) {
            return 4;
        } else if ("jkl".contains("" + uppercaseLetter)) {
            return 5;
        } else if ("mno".contains("" + uppercaseLetter)) {
            return 6;
        } else if ("prs".contains("" + uppercaseLetter)) {
            return 7;
        } else if ("tuv".contains("" + uppercaseLetter)) {
            return 8;
        } else if ("wxyz".contains("" + uppercaseLetter)) {
            return 9;
        }

        return 0;
    }

}

/* OUTPUT
Enter phone number:
1-800-Flowers
1-800-3569377

Enter phone number:
1800flowers
18003569377

*/