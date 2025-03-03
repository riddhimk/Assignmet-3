import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentOperations operations = new StudentOperations();

		// Adding sample students
		operations.addStudent(new Student("Rohit Sharma", 23070126101L, "CSE", "A1", 9.1));
		operations.addStudent(new Student("Virat Kohli", 23070126102L, "ENTC", "B3", 8.5));
		operations.addStudent(new Student("Riddhim Kawdia", 23070126103L, "AIML", "B2", 7.8));
		operations.addStudent(new Student("David Warner", 23070126104L, "CIVIL", "A2", 8.2));
		operations.addStudent(new Student("Chris Gayle", 23070126105L, "CSE", "B1", 9.0));

