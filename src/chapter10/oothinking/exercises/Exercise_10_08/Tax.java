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

public class Tax {

    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 208885, 372950}, // Married jointly or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
    };
    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    private double taxableIncome;

    public Tax() {
        this.filingStatus = 0;
        this.taxableIncome = 400_000;

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }


    public double getTax() {
        int status = getFilingStatus();
        double tax = brackets[status][0] * rates[0];
        for (int i = 1; i < rates.length - 1; i++) {
            tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
        }
        tax += (getTaxableIncome() - brackets[status][rates.length - 2]) * rates[rates.length - 1];
        return tax;
    }
}
