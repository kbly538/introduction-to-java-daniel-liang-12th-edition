/*
(Conversions between feet and meters) Write a class that contains the following
two methods:

        The formula for the conversion is:
        meter = 0.305 * foot
        foot = 3.279 * meter

 */
package chapter06.methods.exercises;

public class Exercise_6_09 {
    public static void main(String[] args) {

        System.out.printf("%-10s%-10s | %11s %8s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("----------------------------------------------------------");
        for (int f = 1, m = 20; f <= 10; f++, m+=5) {
            System.out.printf("%-10.2f%-10.3f | %10.1f%12.3f\n", f*1.0, footToMeter(f),
                    m*1.0, meterToFoot(m));
        }


    }

    /** Convert from feet to meters */
    public static double footToMeter(double foot){
        return foot * 0.305;
    }
    /** Convert from meters to feet */
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }

}

/* OUTPUT
Feet      Meters     |       Meters    Feet
----------------------------------------------------------
1,00      0,305      |       20,0      65,580
2,00      0,610      |       25,0      81,975
3,00      0,915      |       30,0      98,370
4,00      1,220      |       35,0     114,765
5,00      1,525      |       40,0     131,160
6,00      1,830      |       45,0     147,555
7,00      2,135      |       50,0     163,950
8,00      2,440      |       55,0     180,345
9,00      2,745      |       60,0     196,740
10,00     3,050      |       65,0     213,135


*/