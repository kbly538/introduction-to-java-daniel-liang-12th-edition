/* Listing 8.2 */
package chapter08.array2d.listings;

public class GradeExam {
    public static void main(String[] args) {
        char[] keys = {'A', 'B', 'A', 'C', 'D'};
        char[][] answers = {
                {'A', 'C', 'A', 'B', 'D'},
                {'B', 'C', 'A', 'A', 'D'},
                {'A', 'D', 'B', 'A', 'D'},
                {'C', 'C', 'B', 'A', 'D'},
                {'A', 'B', 'A', 'C', 'D'},
                {'A', 'C', 'C', 'A', 'D'}};

        int highestCount = 0;
        int highestCountStudent = 0;
        for (int student = 0; student < answers.length; student++) {
            int correctCount = 0;
            for (int answer = 0; answer < answers[student].length; answer++) {
                if (answers[student][answer] == keys[answer])
                    correctCount++;
            }
            if (correctCount > highestCount) {
                highestCount = correctCount;
                highestCountStudent = student;
            }
            System.out.println("Student " + student + "'s correct count is " + correctCount);


        }
        System.out.println("Highest count is: " + highestCount + " student is " + highestCountStudent);


    }
}
