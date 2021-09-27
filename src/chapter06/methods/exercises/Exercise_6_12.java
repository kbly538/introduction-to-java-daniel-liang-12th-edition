/*
(Display characters) Write a method that prints characters using the following
header:
public static void printChars(char ch1, char ch2, int
numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers
per line. Write a test program that prints 10 characters per line from 1 to Z.
Characters are separated by exactly one space.

 */
package chapter06.methods.exercises;


public class Exercise_6_12 {
    public static void main(String[] args) {

        printChars('1', 'Z', 10);

    }

    public static void printChars(char ch1, char ch2, int
            numberPerLine){
        int chCounter = 0;
        for (int i = ch1; i <= ch2 ; i++) {
            chCounter++;
            if (chCounter % numberPerLine == 0){
                System.out.print((char) i + " \n");
            } else {
                System.out.print((char) i + " ");
            }
        }

    }

}

/* OUTPUT
1 2 3 4 5 6 7 8 9 :
; < = > ? @ A B C D
E F G H I J K L M N
O P Q R S T U V W X
Y Z
*/