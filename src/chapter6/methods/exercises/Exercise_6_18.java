/*
(Check password) Some Websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■■ A password must have at least eight characters.
■■ A password must contain only letters and digits.
■■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed, or Invalid Password otherwise.
 */
package chapter6.methods.exercises;


import java.util.Scanner;

public class Exercise_6_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        System.out.println(isValid(password));
    }

    public static String isValid(String password){
        boolean isEightChars = true;
        boolean isLettersAndDigits = true;
        boolean isAtLeastTwoDigits = true;
        int charCounter = 0;
        int digitCounter = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isAlphabetic(ch)){
                charCounter++;
            } else if (Character.isDigit(ch)){
                charCounter++;
                digitCounter++;
            }
            else {
                isLettersAndDigits = false;
            }
        }

        isEightChars = charCounter >= 8;
        isAtLeastTwoDigits = digitCounter >= 2;

        return isEightChars&&isAtLeastTwoDigits&&isLettersAndDigits? "Valid Password": "Invalid Password";
    }


}

/* OUTPUT
Enter your password:
!dsakod23
Invalid Password

Enter your password:
abc12345
Valid Password
*/