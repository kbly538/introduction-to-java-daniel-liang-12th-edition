/* Listing 12.15 */
package chapter12.ExceptionHandlingTextIO.listings;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Chapter12/ExceptionHandlingTextIO/listings/listings_src/scores.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(0);
        }

        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print("John T Smith");
            output.println(90);
            output.print("Eric K Jones");
            output.print(85);
        }
    }
}
