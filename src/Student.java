import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student extends Person {
    private List<Integer> grades;
    private int studentID;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);

        this.grades = new ArrayList<>();

        setStudentID(studentID);

    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double calculateGPA() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += convertGradeToGPA(grade);
        }

        return sum / grades.size();
    }

    private double convertGradeToGPA(int grade) {
        if (grade >= 95) {
            return 5;
        } else if (grade >= 90) {
            return 5;
        } else if (grade >= 80) {
            return 4;
        } else if (grade >= 70) {
            return 4;
        } else if (grade >= 60) {
            return 3;
        } else if (grade >= 50) {
            return 2;
        } else if (grade >= 40) {
            return 1;
        } else if (grade >= 30) {
            return 1;
        } else if (grade >= 20) {
            return 1;
        } else if (grade >= 10) {
            return 1;

        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Hi I am  student with Id" + studentID;

    }
}