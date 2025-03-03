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

	// method to search student by PRN
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        return null;
    }

	// method to search student by Name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

	// method to search student by position
    public Student searchByPosition(int pos) {
        if (pos >= 0 && pos < students.size()) {
            return students.get(pos);
        }
        return null;
    }

