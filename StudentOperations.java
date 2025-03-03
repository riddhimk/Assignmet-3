import java.util.*;

public class StudentOperations {
    private ArrayList<Student> students = new ArrayList<>();

	// method to add new student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

