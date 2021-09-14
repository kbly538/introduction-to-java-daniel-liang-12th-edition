/*
(Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:
Kilograms Pounds | Pounds Kilograms
1           2.2  | 20       9.09
3           6.6  | 25       11.36
. . .
197       433.4  | 510      231.82
199       437.8  | 515      234.09
 */
package chapter5.loops.exercises;


public class Exercise_5_05 {
    public static void main(String[] args) {

        final double POUND_PER_KG = 2.2;

        System.out.printf("%-10s%4s%-2s", "Kilograms", " ", "Pounds");
        System.out.printf("%3s%10s%4s%-2s\n", " ", "Pounds", " ", "Kilograms");
        for (int kg = 1, pound = 20; kg <= 200; kg += 2, pound += 5) {
            System.out.printf("%-3d%7s%10.2f", kg, " ", kg * POUND_PER_KG);
            System.out.printf("%3s|%3s%-3d%7s%-10.2f\n", " ", " ", pound, " ", pound / POUND_PER_KG);
        }
    }
}
