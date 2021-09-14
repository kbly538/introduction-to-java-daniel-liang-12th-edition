/*
(Display patterns) Write a method to display a pattern as follows:
1
2 1
3 2 1
...
n n–1 ... 3 2 1
The method header is
public static void displayPattern(int n)
Write a test program that prompts the user to enter a number n and invokes displayPattern(
n) to display the pattern.
 */
package chapter6.methods.exercises;

import java.util.Scanner;

public class Exercise_6_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of layers : ");
        int layers = input.nextInt();
        displayPattern(layers);
    }

    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0 ; j--) {
                if ( j > i) System.out.printf("%5s", " ");
                else System.out.printf("%5d", j);
            }
            System.out.println();
        }
    }

}

/* OUTPUT
Enter number of layers :
12
                                                           1
                                                      2    1
                                                 3    2    1
                                            4    3    2    1
                                       5    4    3    2    1
                                  6    5    4    3    2    1
                             7    6    5    4    3    2    1
                        8    7    6    5    4    3    2    1
                   9    8    7    6    5    4    3    2    1
             10    9    8    7    6    5    4    3    2    1
        11   10    9    8    7    6    5    4    3    2    1
   12   11   10    9    8    7    6    5    4    3    2    1


*/