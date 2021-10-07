/* Listing 12.16 */
package Chapter12.ExceptionHandlingTextIO.listings;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            System.out.println("" +
                    "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " doesn't exist.");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Source file " + args[1] + " doesn't exist.");
            System.exit(3);
        }
        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }


        }
        System.out.println("Done");
    }
}
