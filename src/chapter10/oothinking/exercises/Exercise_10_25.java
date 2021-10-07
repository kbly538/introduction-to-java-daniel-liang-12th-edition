/*
(New string split method) The split method in the String class returns an
array of strings consisting of the substrings split by the delimiters. However, the
delimiters are not returned. Implement the following new method that returns
an array of strings consisting of the substrings split by the matching delimiters,
including the matching delimiters.
public static String[] split(String s, String regex)
For example, split("ab#12#453", "#") returns ab, #, 12, #, and 453 in
an array of String and split("a?b?gf#e", "[?#]") returns a, ?, b, ?, gf,
#, and e in an array of String.
 */
package chapter10.oothinking.exercises;

import java.util.Arrays;

public class Exercise_10_25 {

    public static void main(String[] args) {


        String[] a = split("$ARCade//fig3-fcccc!!d", "[$//3-!!]");

        System.out.println(Arrays.toString(a));

    }

    public static String[] split(String s, String regex) {
        String newStr = "";
        int counter = 0;

        boolean isDelimiter = false;
        for (int i = 0; i < s.length(); i++) {
            isDelimiter = false;
            for (int j = 0; j < regex.length(); j++) {
                if (s.charAt(i) == regex.charAt(j)) {
                    newStr = newStr + "@@" + s.charAt(i) + "@@";
                    counter++;
                    isDelimiter = true;
                    break;
                }
            }
            if (!isDelimiter)
                newStr += s.charAt(i);
            counter++;

        }
        String finalStr = "";
        String[] temp = newStr.split("[@@]");
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].isEmpty()) {
                finalStr += temp[i] + " ";
            }
        }
        return finalStr.split(" ");
    }
}

/* OUTPUT
String: "$ARCade//fig3-fcccc!!d"
Regex =  [$//3-!!]

Resulting string array = [$, ARCade, /, /, fig, 3, -, fcccc, !, !, d]
 */