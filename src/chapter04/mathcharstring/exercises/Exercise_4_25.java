/*
(Generate vehicle plate numbers) Assume that a vehicle plate number consists
of three uppercase letters followed by four digits. Write a program to generate a
plate number.
 */
package chapter04.mathcharstring.exercises;

public class Exercise_4_25 {

    public static void main(String[] args) {
        int randomChar1 = 'A' + (int) (Math.random() * ('Z' - 'A' + 1));
        int randomChar2 = 'A' + (int) (Math.random() * ('Z' - 'A' + 1));
        int randomChar3 = 'A' + (int) (Math.random() * ('Z' - 'A' + 1));
        int randomDigit1 = (int) (Math.random() * 10);
        int randomDigit2 = (int) (Math.random() * 10);
        int randomDigit3 = (int) (Math.random() * 10);
        int randomDigit4 = (int) (Math.random() * 10);

        System.out.println((char) randomChar1 + "" + (char) randomChar2 + "" + (char) randomChar3
                + "" + randomDigit1 + randomDigit2 + randomDigit3 + randomDigit4);

    }
}
