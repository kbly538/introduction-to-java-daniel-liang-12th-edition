/*
(Sum integers) Write a program that passes an unspecified number of integers from
command line and displays their total.
*/
package chapter7.arrays1d.exercises;

public class Exercise_07_22 {
    public static void main(String[] args) {
        String upperCaseLetters = "";
        String target = args[0];
        for (int i = 0; i < args[0].length(); i++) {
            if (Character.isUpperCase(target.charAt(i)))
                upperCaseLetters = upperCaseLetters + " " + target.charAt(i);
        }

        System.out.println("Upper case letters are: " + upperCaseLetters);

    }

}

/* OUTPUT
>java chapter7.arrays1d.exercises.Exercise_07_22 "This Program  Tries To Print Uppercase Letters In This String"
Upper case letters are:  T P T T P U L I T S

 */