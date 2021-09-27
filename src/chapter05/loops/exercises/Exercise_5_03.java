/*
Conversion from kilograms to pounds) Write a program that displays the following
table (note 1 kilogram is 2.2 pounds):
Kilograms Pounds
1           2.2
3           6.6
. . .
197       433.4
199       437.8
 */
package chapter05.loops.exercises;


public class Exercise_5_03 {
    public static void main(String[] args) {

        final double POUND_PER_KG = 2.2;

        System.out.printf("%-10s%4s%-2s\n", "Kilograms", " ", "Pounds");
        for (int i = 1; i <= 200; i++) {
            System.out.printf("%-3d%7s%10.2f\n", i, " ", i * POUND_PER_KG);
        }
    }
}
