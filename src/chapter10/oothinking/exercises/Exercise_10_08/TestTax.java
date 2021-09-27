/*
(Financial: the Tax class) Programming Exercise 8.12 writes a program for
computing taxes using arrays. Design a class named Tax to contain the following
instance data fields:
■■ int filingStatus: One of the four tax-filing statuses: 0—single filer,
1—married filing jointly or qualifying widow(er), 2—married filing separately,
and 3—head of household. Use the public static constants SINGLE_FILER
(0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_SEPARATELY
(2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
■■ int[][] brackets: Stores the tax brackets for each filing status.
■■ double[] rates: Stores the tax rates for each bracket.
■■ double taxableIncome: Stores the taxable income.
Provide the getter and setter methods for each data field and the getTax()
method that returns the tax. Also, provide a no-arg constructor and the constructor
Tax(filingStatus, brackets, rates, taxableIncome).
Draw the UML diagram for the class and then implement the class. Write a test
program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
are shown in Table 10.1.
 */
package chapter10.oothinking.exercises.Exercise_10_08;

public class TestTax {

    public static void main(String[] args) {

        int[][] taxTable2001 = {
                {27050, 65550, 136750, 297350}, // Single filer
                {45200, 109250, 166500, 297350}, // Married jointly or qualifying widow(er)
                {22600, 54625, 83250, 148675}, // Married separately
                {36250, 93650, 151650, 297350} // Head of household
        };

        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

        Tax tax2009 = new Tax();
        Tax tax2001 = new Tax(Tax.SINGLE_FILER, taxTable2001, rates2001, 400_000);


        System.out.println("2009 Tax Table: Single Filer with 400k taxable income: "
                + tax2009.getTax());
        System.out.println("2001 Tax Table: Single Filer with 400k taxable income: "
                + tax2001.getTax());


    }
}

/* OUTPUT
2009 Tax Table: Single Filer with 400k taxable income: 117683.5
2001 Tax Table: Single Filer with 400k taxable income: 133510.15
 */
