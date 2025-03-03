import java.util.*;

public class StudentOperations {
    private ArrayList<Student> students = new ArrayList<>();

	// method to add new student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

	// method to display students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                student.display();
            }
        }
    }

