/*
(Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
students in increasing order of the number of correct answers.
 */
package chapter08.array2d.exercises;

public class Exercise_08_03 {
    public static void main(String[] args) {

        char[] keys = {'A', 'B', 'A', 'C', 'D'};
        char[][] answers = {
                {'A', 'C', 'A', 'B', 'D'}, //
                {'B', 'C', 'A', 'A', 'D'},
                {'A', 'D', 'B', 'A', 'D'},
                {'C', 'C', 'B', 'A', 'D'},
                {'A', 'B', 'A', 'C', 'D'},
                {'A', 'C', 'C', 'A', 'D'}};


        int[][] studentsList = new int[answers.length][2];
        for (int student = 0; student < answers.length; student++) {
            int correctCount = 0;
            for (int answer = 0; answer < answers[student].length; answer++) {
                if (answers[student][answer] == keys[answer])
                    correctCount++;
            }
            studentsList[student][1] = correctCount;
            studentsList[student][0] = student;

        }


        sortStudents(studentsList);

        System.out.println();
        for (int i = 0; i < studentsList.length; i++) {
            System.out.print("Student number " + (studentsList[i][0] + 1) + " got " + studentsList[i][1] + " points.\n");

        }


    }

    public static void sortStudents(int[][] studentsList) {
        for (int student = 0; student < studentsList.length - 1; student++) {
            int currentMin = studentsList[0][1];
            int currentMinIndex = student;
            int currentStudent = 0;

            for (int i = student + 1; i < studentsList.length; i++) {
                if (currentMin > studentsList[i][1]) {
                    currentMin = studentsList[i][1];
                    currentStudent = studentsList[i][0];
                    currentMinIndex = i;
                }
            }

            if (currentMinIndex != student) {
                studentsList[currentMinIndex][1] = studentsList[student][1];
                studentsList[currentMinIndex][0] = studentsList[student][0];
                studentsList[student][0] = currentStudent;
                studentsList[student][1] = currentMin;
            }


        }
    }

}


/* OUTPUT
Student number 4 got 1 points.
Student number 2 got 2 points.
Student number 3 got 2 points.
Student number 1 got 3 points.
Student number 5 got 5 points.
Student number 6 got 2 points.
* */