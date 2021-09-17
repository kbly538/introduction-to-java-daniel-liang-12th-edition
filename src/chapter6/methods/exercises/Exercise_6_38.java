/*
(Generate random characters) Use the methods in RandomCharacter in Listing
6.10 to print 100 uppercase letters then 100 single digits, printing 50 per line.
*/

package chapter6.methods.exercises;

public class Exercise_6_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if (i % 50 == 0)
                System.out.println();
        }

        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if (i % 50 == 0)
                System.out.println();
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('1', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

}
/* OUTPUT
F R W A I A E F B T L O O L N P U M P L K A A K H W V D R T P L B E T C R O I Q X Y E L G F W H B O
F Q A F U Q R A G O A D B D A R G A W Y G L D H W V G T L P H W N K A K Z O I L O Q Y C E F P G E V
6 1 6 3 1 5 4 1 6 1 2 7 3 1 6 1 6 7 8 4 8 6 4 4 8 8 7 2 7 1 7 7 2 9 9 7 3 4 4 5 2 2 4 5 8 2 3 3 7 2
5 4 4 7 9 9 7 5 7 4 5 6 3 3 7 8 2 7 5 9 6 4 6 1 3 3 9 8 7 6 4 5 1 3 1 5 6 1 2 4 8 1 2 9 7 9 9 1 4 7
*/