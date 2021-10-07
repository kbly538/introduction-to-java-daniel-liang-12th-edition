/*
(Create large dataset) Create a data file with 1,000 lines. Each line in the file
consists of a faculty member’s first name, last name, rank, and salary. The
faculty member’s first name and last name for the ith line are FirstNamei and
LastNamei. The rank is randomly generated as assistant, associate, and full.
The salary is randomly generated as a number with two digits after the decimal
point. The salary for an assistant professor should be in the range from 50,000
to 80,000, for associate professor from 60,000 to 110,000, and for full professor
from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055.95
FirstName2 LastName2 associate 81112.45
. . .
FirstName1000 LastName1000 full 92255.21
 */
package Chapter12.ExceptionHandlingTextIO.exercises.Exercise_12_25;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateLargeDataSet {
    public static void main(String[] args) throws IOException {
        String path = "D:\\intelij-workspace\\introduction-to-java-daniel-liang-12th-edition\\src\\Chapter12\\ExceptionHandlingTextIO\\exercises\\Exercise_12_24\\Salary.txt";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            file.createNewFile();
        }

        String[] ranks = {"assistant", "associate", "full"};
        float[][] salaryRanges = {{50_000, 80_000}, {60_000, 110_000}, {75_000, 130_000}};
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 1; i <= 1000; i++) {

                int randomRank = (int) (Math.random() * 3);

                float minSalary = salaryRanges[randomRank][0];
                float maxSalary = salaryRanges[randomRank][1];
                float randomSalary = minSalary + (float) (Math.random() * (maxSalary - minSalary));
                output.print("FirstName" + i + " ");
                output.print("LastName" + i + " ");
                output.print(ranks[randomRank] + " ");
                output.print(randomSalary);
                output.print("\r\n");
            }
        }
    }
}
