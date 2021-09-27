/*
(Latin square) A Latin square is an n-by-n array filled with n different Latin letters,
each occurring exactly once in each row and once in each column. Write a
program that prompts the user to enter the number n and the array of characters,
as shown in the sample output, and checks if the input array is a Latin square.
The characters are the first n characters starting from A.
 */
package chapter08.array2d.exercises;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08_36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = input.nextInt();
        System.out.println("Enter " + n + " rows of letters separated by spaces: ");

        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = (char) ('A' + i);
        }

        char[][] matrix = new char[n][n];
        boolean wrongInputFlag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = input.next().charAt(0);
                if (contains(chars, ch)) {
                    matrix[i][j] = ch;
                } else {
                    System.out.println("The letters must be from A to " + (char) ('A' + n - 1));
                    wrongInputFlag = true;
                    break;
                }
            }
            if (wrongInputFlag)
                break;
        }

        boolean isLatinSq = isLatinSquare(matrix, chars);
        if (isLatinSq)
            System.out.println("The input array is a Latin square");
        else
            System.out.println("The input array is NOT a latin square");

    }

    public static boolean isLatinSquare(char[][] matrix, char[] chars) {

        for (int i = 0; i < matrix.length; i++) {
            if (!rowValid(matrix, i, chars) || !colValid(matrix, i, chars))
                return false;
        }
        return true;
    }

    public static boolean equals(char[] list1, char[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static char[] sortedCol(char[] list) {
        char[] sortedList = new char[list.length];
        for (int i = 0; i < list.length; i++) {
            sortedList[i] = list[i];
        }
        Arrays.sort(sortedList);
        return sortedList;
    }

    public static char[] sortedRow(char[] list) {
        char[] sortedList = new char[list.length];
        for (int i = 0; i < list.length; i++) {
            sortedList[i] = list[i];
        }
        Arrays.sort(sortedList);
        return sortedList;
    }

    public static boolean contains(char[] list, char key) {
        boolean keyExist = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                keyExist = true;
            }
        }
        return keyExist;
    }

    public static boolean rowValid(char[][] m, int row, char[] charList) {
        for (int i = 0; i < m.length; i++) {
            if (charList[i] != sortedRow(m[row])[i])
                return false;
        }
        return true;
    }

    public static boolean colValid(char[][] m, int col, char[] charList) {
        char[] tempCol = new char[m[0].length];
        for (int i = 0; i < m.length; i++) {
            tempCol[i] = m[col][i];
        }

        char[] sortedCol = sortedCol(tempCol);

        for (int i = 0; i < m.length; i++) {
            if (charList[i] != sortedCol[i])
                return false;
        }
        return true;
    }


}
/*
Enter number n:
3
Enter 3 rows of letters separated by spaces:
C B A
B A C
B C B
The input array is NOT a latin square

Enter number n:
5
Enter 5 rows of letters separated by spaces:
A B C D E
B C D E A
C D E A B
D E A B C
E A B C D
The input array is a Latin square


Enter number n:
12
Enter 12 rows of letters separated by spaces:
A B C D E Z F G H I S Q
The letters must be from A to L
The input array is NOT a latin square

*/