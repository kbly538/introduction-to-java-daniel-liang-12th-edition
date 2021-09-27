/*
(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
table is given in Appendix B. Characters are separated by exactly one space.
 */
package chapter05.loops.exercises;

public class Exercise_5_15 {
    public static void main(String[] args) {

        for (int i = 33; i <= 126; i++) {
            if ((i - 33) % 10 == 0) {
                System.out.println();
            }
            System.out.print((char) i + " ");
        }

    }
}