/*
(The Course class) Revise the Course class as follows:
■■ Revise the getStudents() method to return an array whose length is the
same as the number of students in the course. (Hint: create a new array and
copy students to it.)
■■ The array size is fixed in Listing 10.6. Revise the addStudent method to automatically
increase the array size if there is no room to add more students. This is done
by creating a new larger array and copying the contents of the current array to it.
■■ Implement the dropStudent method.
■■ Add a new method named clear() that removes all students from the course.
Test your program using https://liveexample.pearsoncmg.com/test/Exercise10_09.txt
*/
package chapter10.oothinking.exercises.Exercise_10_09;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    private double arraySizeThreshold = 0.2; // double the size when 80% full

    public Course(String courseName) {
        this.courseName = courseName;
        numberOfStudents = 0;
    }

    public void addStudent(String student) {
        if ((numberOfStudents + numberOfStudents * arraySizeThreshold) >= student.length()) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, numberOfStudents);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        int shiftStartIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                students[i] = null;
                numberOfStudents--;
                shiftStartIndex = i;
                break;
            }
        }
        for (int i = shiftStartIndex; i < numberOfStudents - 1 + shiftStartIndex; i++) {
            students[i] = students[i + 1];
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] dest = new String[numberOfStudents];
        System.arraycopy(students, 0, dest, 0, numberOfStudents);
        return dest;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }

}
