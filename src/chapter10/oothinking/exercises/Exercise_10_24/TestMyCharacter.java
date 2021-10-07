/*
(Implement the Character class) The Character class is provided in the Java
library. Provide your own implementation for this class. Name the new class
MyCharacter.
 */
package chapter10.oothinking.exercises.Exercise_10_24;

public class TestMyCharacter {
    public static void main(String[] args) {

        System.out.println((int) 'a' + " " + (int) 'z');//        97 122
        System.out.println((int) 'A' + " " + (int) 'Z');//        65 90
        System.out.println((int) '0' + " " + (int) '9');//        48 57
        System.out.println((int) ' ' + " " + (int) ' ');//        32 32
        System.out.println();


        System.out.println("Is / letter or digit? " + MyCharacter.isLetterOrDigit('/'));
        System.out.println("Is 3 letter or digit? " + MyCharacter.isLetterOrDigit('3'));
        System.out.println("Is c letter or digit? " + MyCharacter.isLetterOrDigit('c'));

        System.out.println("Is 'A' uppercase? " + MyCharacter.isUpperCase('A'));
        System.out.println("Is 'b' uppercase? " + MyCharacter.isUpperCase('b'));
        System.out.println("Is '5' uppercase? " + MyCharacter.isUpperCase('5'));

        System.out.println("Is '3' digit? " + MyCharacter.isDigit('3'));
        System.out.println("Is 'Z' digit? " + MyCharacter.isDigit('Z'));
        System.out.println("Is 'k' digit? " + MyCharacter.isDigit('k'));

        System.out.println("Is 'l' a letter? " + MyCharacter.isLetter('l'));
        System.out.println("Is '6' a letter? " + MyCharacter.isLetter('6'));
        System.out.println("Is 'H' a letter? " + MyCharacter.isLetter('H'));


        System.out.println("Compare 'a' to 'b': " + MyCharacter.compare('a', 'b'));
        System.out.println("Compare '4' to '6': " + MyCharacter.compare('4', '6'));
        System.out.println("Compare '8' to '3': " + MyCharacter.compare('8', '3'));
        System.out.println("Compare 'A' to 'Z': " + MyCharacter.compare('A', 'Z'));
        System.out.println("Compare 'Z' to 'A': " + MyCharacter.compare('Z', 'A'));
        System.out.println("Compare 'V' to 'V': " + MyCharacter.compare('V', 'V'));

        System.out.println("B to lowercase: " + MyCharacter.toLowerCase('B'));
        System.out.println("3 to lowercase: " + MyCharacter.toLowerCase('3'));
        System.out.println("y to lowercase: " + MyCharacter.toLowerCase('y'));

        System.out.println("r to uppercase: " + MyCharacter.toTitleCase('r'));
        System.out.println("T to uppercase: " + MyCharacter.toTitleCase('T'));
        System.out.println("6 to uppercase: " + MyCharacter.toTitleCase('6'));

        System.out.println("Get numeric value of 'A': " + MyCharacter.getNumericValue('A'));
        System.out.println("Get numeric value of '6': " + MyCharacter.getNumericValue('6'));
        System.out.println("Get numeric value of '<': " + MyCharacter.getNumericValue('<'));

        System.out.println("Value of 6: " + MyCharacter.valueOf('6'));
        System.out.println("Value of h: " + MyCharacter.valueOf('h'));
        System.out.println("Value of K: " + MyCharacter.valueOf('K'));


        System.out.println("Is ' ' whitespace? " + MyCharacter.isWhitespace(' '));
        System.out.println("Is 'a' whitespace? " + MyCharacter.isWhitespace('a'));
        System.out.println("Is '7' whitespace? " + MyCharacter.isWhitespace('7'));
        System.out.println("Is 'A' whitespace? " + MyCharacter.isWhitespace('A'));

    }
}
