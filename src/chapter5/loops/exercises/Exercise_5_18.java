/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
Pattern A Pattern B Pattern C Pattern D
1                       1
1 2                   2 1
1 2 3               3 2 1
1 2 3 4           4 3 2 1
1 2 3 4 5       5 4 3 2 1
1 2 3 4 5 6   6 5 4 3 2 1

1 2 3 4 5 6   1 2 3 4 5 6
1 2 3 4 5       1 2 3 4 5
1 2 3 4           1 2 3 4
1 2 3               1 2 3
1 2                   1 2
1                       1

 */

package chapter5.loops.exercises;

import java.util.Scanner;

public class Exercise_5_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 15: ");
        int layers = input.nextInt();

        /* PATTERN A
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4 5 6
                       */
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", j + 1);
            }
            System.out.println();
        }

        System.out.println();
        /*  PATTERN B
            1 2 3 4 5 6
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
                     */
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < layers - i - 1; j++) {
                System.out.printf("%4d", j + 1);
            }
            System.out.println();
        }

        /* PATTERN C
                  1
                2 1
              3 2 1
            4 3 2 1
          5 4 3 2 1
        6 5 4 3 2 1
                    */

        for (int i = 1; i <= layers; i++) {
            for (int j = 0; j < layers - i; j++) {
                System.out.printf("%4s", " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.printf("%4d", i - j);
            }
            System.out.println();
        }

        System.out.println();
        /* PATTERN D
            1 2 3 4 5 6
              1 2 3 4 5
                1 2 3 4
                  1 2 3
                    1 2
                      1
         */
        for (int i = 1; i <= layers; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("%4s", " ");
            }
            for (int j = 1; j <= layers - i; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();

        }

    }
}

