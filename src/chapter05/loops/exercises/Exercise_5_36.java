/*
(Business application: checking ISBN) Use loops to simplify Programming
Exercise
3.9.
 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first 9 digits of ISBN
        System.out.println("Enter the first 9 digits of ISBN: ");
        int isbn9 = input.nextInt();
        int checksum = 0;
        String isbn = "";

        for (int i = 9; i >= 1; i--) {
            int digit;
            if (i == 9) {
                digit = isbn9 % 10;
                checksum += digit * i;
                isbn += digit;
            } else {
                digit = (isbn9 /= 10) % 10;
                checksum += digit * i;
                isbn = digit + isbn;
            }
        }
        checksum %= 11;
        System.out.println("ISBN is: " + isbn + (checksum == 10 ? "X" : checksum));
        input.close();

    }
}

/* OUTPUT
Enter the first 9 digits of ISBN:
123456789
ISBN is: 123456789X
*/