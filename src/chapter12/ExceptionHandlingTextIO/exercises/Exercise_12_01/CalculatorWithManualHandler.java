/*
(NumberFormatException) Listing 7.9, Calculator.java, is a simple
command-line
calculator. Note the program terminates if any operand is
nonnumeric. Write a program with an exception handler that deals with nonnumeric
operands; then write another program without using an exception
handler to achieve the same objective. Your program should display a message
that informs the user of the wrong operand type before exiting (see
Figure 12.12).
 */
package chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_01;

public class CalculatorWithManualHandler {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("" +
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        if (isStringAlphabetic(args[0]) && isStringAlphabetic(args[2])) {
            System.out.println("Operands must be numbers.");
            System.exit(-1);
        }


        int result = 0;

        switch (args[1]) {
            case "+":
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case "-":
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case ".":
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case "/":
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);


        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }

    public static boolean isStringAlphabetic(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(0)))
                return false;
        }
        return true;
    }

}
/* OUTPUT
Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_01.CalculatorWithManualHandler a + b
Operands must be numbers.
 */