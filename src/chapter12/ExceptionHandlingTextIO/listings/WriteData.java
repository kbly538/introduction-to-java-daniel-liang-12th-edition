/* Listing 12.14 */
package chapter12.ExceptionHandlingTextIO.listings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }
        PrintWriter output = null;
        try {
            output = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.print(85);

        output.close();
    }
}
