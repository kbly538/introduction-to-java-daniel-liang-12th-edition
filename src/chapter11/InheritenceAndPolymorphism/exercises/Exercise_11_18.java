/*
(ArrayList of Character) Write a method that returns an array list of Character
from a string using the following header:
public static ArrayList<Character> toCharacterArray(String s)
For example, toCharacterArray("abc") returns an array list that contains
characters 'a', 'b', and 'c'.
 */
package chapter11.InheritenceAndPolymorphism.exercises;


import java.util.ArrayList;

public class Exercise_11_18 {
    public static void main(String[] args) {

        System.out.println(toCharacterArray("abc"));
        System.out.println(toCharacterArray("JAVA11"));
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}
/* OUTPUT
"abc" returns [a, b, c]
"JAVA11" returns [J, A, V, A, 1, 1]
 */