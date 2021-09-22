/*
(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
face up and some face down. You can represent the state of the coins using a
3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
0 0 0  1 0 1  1 1 0  1 0 1  1 0 0
0 1 0  0 0 1  1 0 0  1 1 0  1 1 1
0 0 0  1 0 0  0 0 1  1 0 0  1 1 0
Each state can also be represented using a binary number. For example, the preceding
matrices correspond to the numbers
000010000 101001100 110100001 101110100 100111110
There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, . . . ,
and 511 to represent all states of the matrix. Write a program that prompts the
user to enter a number between 0 and 511 and displays the corresponding matrix
with the characters H and T. In the following sample run, the user entered 7, which
corresponds to 000000111. Since 0 stands for H and 1 for T, the output is correct.
 */
package chapter8.array2d.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0-512: ");
        int number = input.nextInt();

        String binaryRepresentation = "";

        while (binaryRepresentation.length() < 9) {

            if (number == 0)
                binaryRepresentation = "0" + binaryRepresentation;

            binaryRepresentation = number % 2 + binaryRepresentation;
            number /= 2;

        }
        char[][] coinFlipMatrix = new char[3][3];

        int stringIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (binaryRepresentation.charAt(stringIndex) == '0')
                    coinFlipMatrix[i][j] = 'H';
                else
                    coinFlipMatrix[i][j] = 'T';
                System.out.print(coinFlipMatrix[i][j] + " ");
                stringIndex++;
            }
            System.out.println();
        }
    }
}
/* OUTPUT
Enter a number between 0-512:
20
H H H
H T H
T H H

Enter a number between 0-512:
444
T T H
T T T
T H H

 Enter a number between 0-512:
169
H H T
H T H
T H H

*/