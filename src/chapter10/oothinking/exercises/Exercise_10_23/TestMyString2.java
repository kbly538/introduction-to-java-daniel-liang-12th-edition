/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
 */
package chapter10.oothinking.exercises.Exercise_10_23;

public class TestMyString2 {
    public static void main(String[] args) {

        MyString2 s = new MyString2("zcademy");
        MyString2 s1 = new MyString2("Academy");
        MyString2 s2 = new MyString2("ACADEMY");

        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("toString: " + s);
        System.out.println("Equals \"academ\": " + s.compare("academ"));
        System.out.println("Equals \"academyy\": " + s.compare("academyy"));
        System.out.println("Equals \"academy\": " + s.compare("academy"));
        System.out.println("Equals \"Academy.toLowerCase()\": " + s2.equals(s.toUpperCase()));
        System.out.println("Substring 0 to 5: " + s.substring(0));
        System.out.println("valueOf 123 and 5: " + MyString2.valueOf(true) + " & " + MyString2.valueOf(false));
    }

}

/*
Uppercase: ZCADEMY
toString: zcademy
Equals "academ": 1
Equals "academyy": -1
Equals "academy": 0
Equals "Academy.toLowerCase()": false
Substring 0 to 5: zcademy
valueOf 123 and 5: 1 & 0
 */
