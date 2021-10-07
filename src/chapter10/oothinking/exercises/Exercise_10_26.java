/*
(Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as a
string in which the operands and operator are separated by zero or more spaces.
For example, 3+4 and 3 + 4 are acceptable expressions.
 */
package chapter10.oothinking.exercises;


public class Exercise_10_26 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("" +
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }


        int result = 0;

        switch (args[1].trim()) {
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
}

/* OUTPUT
java chapter10.oothinking.exercises.Exercise_10_26  20 -     100
20 - 100 = -80


java chapter10.oothinking.exercises.Exercise_10_26  4 .      5
4 . 5 = 20
 */