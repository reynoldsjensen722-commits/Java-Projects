package chapter_13;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        System.arraycopy(students, 0, result, 0, numberOfStudents);
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public Course clone() {
        try {
            Course copy = (Course) super.clone();
            copy.students = students.clone(); // deep copy
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

















