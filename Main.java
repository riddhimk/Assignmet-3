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

		while (true) {
			System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Search Student by PRN");
			System.out.println("4. Search Student by Name");
			System.out.println("5. Search Student by Position");
			System.out.println("6. Update Student Details");
			System.out.println("7. Delete Student");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			int choice = scan.nextInt();
			scan.nextLine(); 

			switch (choice) {
				case 1: { // add student 
					System.out.print("Enter Name: ");
					String name = scan.nextLine();
					System.out.print("Enter PRN: ");
					long prn = scan.nextLong();
					scan.nextLine();
					System.out.print("Enter Department: ");
					String dept = scan.nextLine();
					System.out.print("Enter Batch: ");
					String batch = scan.nextLine();
					System.out.print("Enter CGPA: ");
					double cgpa = scan.nextDouble();
					scan.nextLine();
					operations.addStudent(new Student(name, prn, dept, batch, cgpa));
					break;
				}
				case 2: { // display students
					operations.displayStudents();
					break;
				}
				case 3: { // search by PRN 
					System.out.print("Enter PRN to search: ");
					long prn = scan.nextLong();
					scan.nextLine();
					Student foundPRN = operations.searchByPRN(prn);
					if (foundPRN != null) {
						foundPRN.display();
					} else {
						System.out.println("Student not found!");
					}
					break;
				}
				case 4: { // search by name
					System.out.print("Enter Name to search: ");
					String name = scan.nextLine();
					Student foundName = operations.searchByName(name);
					if (foundName != null) {
						foundName.display();
					} else {
						System.out.println("Student not found!");
					}
					break;
				}
				case 5: { // search by position
					System.out.print("Enter Position: ");
					int pos = scan.nextInt();
					scan.nextLine();
					Student foundPos = operations.searchByPosition(pos);
					if (foundPos != null) {
						foundPos.display();
					} else {
						System.out.println("Invalid position!");
					}
					break;
				}
				case 6: { // update student details
					System.out.print("Enter PRN of student to update: ");
					long prn = scan.nextLong();
					scan.nextLine();
					System.out.print("Enter New Name: ");
					String name = scan.nextLine();
					System.out.print("Enter New Department: ");
					String dept = scan.nextLine();
					System.out.print("Enter New Batch: ");
					String batch = scan.nextLine();
					System.out.print("Enter New CGPA: ");
					double cgpa = scan.nextDouble();
					scan.nextLine();
					if (operations.updateStudent(prn, name, dept, batch, cgpa)) {
						System.out.println("Student updated successfully!");
					} else {
						System.out.println("Student not found!");
					}
					break;
				}
				case 7: { // delete student
					System.out.print("Enter PRN of student to delete: ");
					long prn = scan.nextLong();
					scan.nextLine();
					operations.deleteStudent(prn);
					System.out.println("Student deleted successfully!");
					break;
				}
				case 8: { // exit the menu
					System.out.println("Exiting program...");
					scan.close();
					return;
				}
				default: {
					System.out.println("Invalid choice! Please try again.");
				}
			}
		}
	}
}