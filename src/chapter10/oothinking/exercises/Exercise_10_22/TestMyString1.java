/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);
 */
package chapter10.oothinking.exercises.Exercise_10_22;

public class TestMyString1 {
    public static void main(String[] args) {

        char[] chars = {'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        char[] chars1 = {'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        char[] chars2 = {'a', 'c', 'a', 'd', 'e', 'm', 'y'};

        MyString1 s = new MyString1(chars);
        MyString1 s1 = new MyString1(chars1);
        MyString1 s2 = new MyString1(chars2);

        System.out.println("Length: " + s.length());
        System.out.println("Char at 0 and 4: " + s.charAt(0) + " & " + s.charAt(4));
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("toString: " + s);
        System.out.println("Equals \"academy\": " + s.equals(s2));
        System.out.println("Equals \"Academy\": " + s.equals(s1));
        System.out.println("Equals \"Academy.toLowerCase()\": " + s2.equals(s.toLowerCase()));
        System.out.println("Substring 0 to 5: " + s.substring(0, 5));
        System.out.println("valueOf 123 and 5: " + MyString1.valueOf(123) + " & " + MyString1.valueOf(5));
    }

}

/*
Length: 7
Char at 0 and 4: A & e
Lowercase: academy
toString: Academy
Equals "academy": false
Equals "Academy": true
Equals "Academy.toLowerCase()": true
Substring 0 to 5: Acade
valueOf 123 and 5: 123 & 5
 */
