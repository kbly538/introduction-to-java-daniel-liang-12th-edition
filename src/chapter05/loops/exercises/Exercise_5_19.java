/*
(Display numbers in a pyramid pattern) Write a nested for loop that prints the
following output:
                        1
                    1   2   1
                 1  2   4   2   1
             1   2  4   8   4   2   1
         1   2   4  8  16   8   4   2   1
      1  2   4   8 16  32  16   8   4   2  1
   1  2  4   8  16 32  64  32  16   8   4  2  1
1  2  4  8  16  32 64 128  64  32  16   8  4  2  1

 */

package chapter05.loops.exercises;

import java.util.Scanner;

public class Exercise_5_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter depth of the pyramid as an integer: ");
        int layers = input.nextInt();

        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < layers - i; j++) {
                System.out.printf("%6s", " ");
            }
            for (int j = 1, c = 1; c <= i; j *= 2, c++) {
                System.out.printf("%6d", j);
            }

            for (int j = (int) Math.pow(2, i), c = 0; c <= i; c++, j = j / 2) {
                System.out.printf("%6d", j);
            }
            System.out.println();
        }

    }
}

