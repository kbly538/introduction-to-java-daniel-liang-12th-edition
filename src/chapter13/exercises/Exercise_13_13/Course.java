/*
(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.
 */
package chapter13.exercises.Exercise_13_13;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    private double arraySizeThreshold = 0.2; // double the size when 80% full

    public Course(String courseName) {
        this.courseName = courseName;
        numberOfStudents = 0;
    }

    public void addStudent(String student) {
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
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Course clone() {
        Course cloneCourse = new Course(this.courseName);
        String[] cloneStudents = new String[100];
        for (int i = 0; i < this.students.length; i++) {
            cloneStudents[i] = this.students[i];
        }
        cloneCourse.students = cloneStudents;
        cloneCourse.numberOfStudents = numberOfStudents;
        return cloneCourse;
    }
}
