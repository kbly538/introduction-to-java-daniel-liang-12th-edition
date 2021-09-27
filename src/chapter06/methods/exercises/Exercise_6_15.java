/*
(Financial application: print a tax table) Listing 3.5 gives a program to compute
tax. Write a method for computing tax using the following header:
public static double computeTax(int status, double
taxableIncome)
Use this method to write a program that prints a tax table for taxable income
from $50,000 to $60,000 with intervals of $50 for all the statuses.

 */
package chapter06.methods.exercises;


public class Exercise_6_15 {
    public static void main(String[] args) {


        System.out.printf("%-10s%-5s%15s%10s%11s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-10s%-5s%15s%12s%12s\n", "Income", " ", "or Qualifying", "Seperate", "Household");
        System.out.printf("%-10s%-5s%15s%12s%12s\n", " ", " ", "Widow(er)", " ", " ");

        for (int i = 50000, status = 0; i <= 60000; i += 50, status++) {

            System.out.printf("%-10d%-5d%15d%12d%12d\n", i, Math.round(computeTax(0, i)),
                    Math.round(computeTax(1, i)), Math.round(computeTax(2, i)),
                    Math.round(computeTax(3, i)));
        }
    }
        public static double computeTax(int status, double taxableIncome) {
            double tax = 0;

            // Single filer
            if (status == 0) {
                if (taxableIncome <= 8350) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 33950) {
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <= 82250) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                } else if (taxableIncome <= 171550) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                            + (taxableIncome - 82250) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                            + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25
                            + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33
                            + (taxableIncome - 372950) * 0.35;
                }
                //Married Jointly or Qualifying Widow(er)
            } else if (status == 1) {
                if (taxableIncome <= 16700) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 67900) {
                    tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
                } else if (taxableIncome <= 137050) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
                } else if (taxableIncome <= 208850) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                            + (taxableIncome - 137050) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                            + (208850 - 137050) * 0.28 + (taxableIncome - 208850) * 0.33;
                } else {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                            + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33
                            + (taxableIncome - 372950) * 0.35;
                }
                // Married Filing Separately
            } else if (status == 2) {
                if (taxableIncome <= 8350) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 33950) {
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <= 68525) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                } else if (taxableIncome <= 104425) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25
                            + (taxableIncome - 68525) * 0.28;
                } else if (taxableIncome <= 186475) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25
                            + (104425 - 68525) * 0.28 + (taxableIncome - 104425) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25
                            + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33
                            + (taxableIncome - 186475) * 0.35;
                }
                // Head of Household
            } else if (status == 3) {
                if (taxableIncome <= 11950) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 45500) {
                    tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
                } else if (taxableIncome <= 117450) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
                } else if (taxableIncome <= 190200) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25
                            + (taxableIncome - 117450) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25
                            + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
                } else {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25
                            + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33
                            + (taxableIncome - 372950) * 0.35;
                }

            } else {
                System.out.println("Error: Invalid input.");
                System.exit(1);
            }

            return tax;

        }
}

/* OUTPUT
Taxable   Single  Married Joint   Married    Head of
Income           or Qualifying    Seperate   Household
                     Widow(er)
50000     8688            6665        8688        7353
50050     8700            6673        8700        7365
50100     8713            6680        8713        7378
50150     8725            6688        8725        7390
....
59700     11113           8120       11113        9778
59750     11125           8128       11125        9790
59800     11138           8135       11138        9803
59850     11150           8143       11150        9815
59900     11163           8150       11163        9828
59950     11175           8158       11175        9840
60000     11188           8165       11188        9853
*/