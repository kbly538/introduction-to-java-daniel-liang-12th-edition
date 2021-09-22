/*
(Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
using arrays. For each filing status, there are six tax rates. Each rate is applied
to a certain amount of taxable income. For example, from the taxable income of
$400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350) at 15%,
(82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at
33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing
statuses, which can be represented in the following array:
double[] rates = {rates[0, rates[1, rates[2, rates[3, rates[4, rates[5};
The brackets for each rate for all the filing statuses can be represented in a two-dimensional
array as follows:
int[][] brackets = {
{8350, 33950, brackets[0,[2 brackets[0,[3 372950}, // Single filer
{brackets[1,[0 brackets[1,[1 brackets[1,[2 brackets[1][3] 372950}, // Married jointly
// −or qualifying widow(er)
{8350, 33950, brackets[2,[2 brackets[2,[3 brackets[2}[4], // Married separately
{brackets[3,[0 brackets[3,[1 brackets[3,[2 brackets[3,[3 372950} // Head of household
};

Suppose the taxable income is $400,000 for single filers. The tax can be computed
as follows:
tax = brackets[0][0] * rates[0] +
(brackets[0][1] – brackets[0][0]) * rates[1] +
(brackets[0][2] – brackets[0][1]) * rates[2] +
(brackets[0][3] – brackets[0][2]) * rates[3] +
(brackets[0][4] – brackets[0][3]) * rates[4] +
(400000 – brackets[0][4]) * rates[5];
 */
package chapter8.array2d.exercises;

import java.util.Scanner;

public class Exercise_08_12 {
    public static void main(String[] args) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 208885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        Scanner input = new Scanner(System.in);

        // Prompt user enter to filing status
        System.out.println("(0 - Single Filer, 1 - Married Jointly or Qualifying Widow(er))" +
                "(2 - Married Filing Separately), (3 - Head of Hosuehold) Enter filing status: ");

        int status = input.nextInt();

        System.out.println("Enter the taxtable income: ");
        double income = input.nextDouble();

        double tax = brackets[status][0] * rates[0] +
                (brackets[status][1] - brackets[status][0]) * rates[1] +
                (brackets[status][2] - brackets[status][1]) * rates[2] +
                (brackets[status][3] - brackets[status][2]) * rates[3] +
                (brackets[status][4] - brackets[status][3]) * rates[4] +
                (income - brackets[status][4]) * rates[5];

        System.out.println("Tax is " + tax);

    }
}
/* OUTPUT
(0 - Single Filer, 1 - Married Jointly or Qualifying Widow(er))(2 - Married Filing Separately), (3 - Head of Hosuehold) Enter filing status:
3
Enter the taxtable income:
400000
Tax is 114360.0

*/