package chapter13.exercises;

import chapter13.listings.RationalNumber.Rational;

public class Exercise_13_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise_13_16 exp");
            System.exit(1);
        }

        String[] expression = args[0].split(" ");
        String[] firstTerm = expression[0].split("/");
        String[] secondTerm = expression[2].split("/");
        String operator = expression[1];
        Rational firstNumber = new Rational(Integer.parseInt(firstTerm[0]), Integer.parseInt(firstTerm[1]));
        Rational secondNumber = new Rational(Integer.parseInt(secondTerm[0]), Integer.parseInt(secondTerm[1]));

        switch (operator) {
            case "+":
                System.out.println(firstNumber.getNumerator() + "/" + firstNumber.getDenominator() + " + "
                        + secondNumber.getNumerator() + "/" + secondNumber.getDenominator() + " = " +
                        firstNumber.add(secondNumber));
                break;
            case "-":
                System.out.println(firstNumber.getNumerator() + "/" + firstNumber.getDenominator() + " - "
                        + secondNumber.getNumerator() + "/" + secondNumber.getDenominator() + " = " +
                        firstNumber.subtract(secondNumber));
                break;
            case "/":
                System.out.println(firstNumber.getNumerator() + "/" + firstNumber.getDenominator() + " / "
                        + secondNumber.getNumerator() + "/" + secondNumber.getDenominator() + " = " +
                        firstNumber.divide(secondNumber));
                break;
            case "*":
                System.out.println(
                        firstNumber.getNumerator() + "/" + firstNumber.getDenominator() + " * "
                                + secondNumber.getNumerator() + "/" + secondNumber.getDenominator() + " = " +
                                firstNumber.multiply(secondNumber));
                break;
        }

    }
}


/* OUTPUT
3/4 + 1/5 = 19/20

3/4 - 1/5 = 11/20

3/4 * 1/5 = 3/20

3/4 / 1/5 = 15/4
 */