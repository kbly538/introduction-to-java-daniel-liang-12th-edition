/*
(Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
which is calculated from the other digits using the following formula:
10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
If the checksum is 10, replace it with 0. Your program should read the input as a
string. Display “invalid input” if the input is invalid.
 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_47 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn13 = input.nextLine();
        final int DIGITS = 12;
        int digitsSum = 0; //(d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)

        if (isbn13.length() != 12) {
            System.out.println(isbn13 + " is an invalid input.");
        } else {
            for (int i = 0; i < DIGITS; i++) {
                String digitString = "" + isbn13.charAt(i);
                int digit = Integer.parseInt(digitString);
                if (i % 2 == 0) {
                    digitsSum += digit;
                } else {
                    digitsSum += (3 * digit);
                }
            }

            int checksum = 10 - digitsSum % 10;
            if (checksum == 10) checksum = 0;

            System.out.println("The ISBN-13 number is " + isbn13 + checksum);
        }

    }
}

/* OUTPUT
Enter the first 12 digits of an ISBN-13 as a string:
97801320
97801320 is an invalid input.

Enter the first 12 digits of an ISBN-13 as a string:
978013213079
The ISBN-13 number is 9780132130790

Enter the first 12 digits of an ISBN-13 as a string:
978013213080
The ISBN-13 number is 9780132130806
*/