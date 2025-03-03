# Assignmet-3

## Description  
This Java program is a **menu-driven** Student Management System that demonstrates **OOP concepts** like classes, objects, constructors, and encapsulation. The program allows users to:  
- Add students  
- Display students  
- Search students (by PRN, Name, or Position)  
- Update student details  
- Delete students  

It uses **ArrayList** to store student data dynamically and follows Java coding guidelines with proper comments.  

## Files & Structure  

| File Name            | Description |
|----------------------|-------------|
| `Student.java`       | Defines the `Student` class with attributes and getter/setter methods. |
| `StudentOperations.java` | Contains methods to **add, search, update, delete, and display students**. |
| `Main.java`          | Handles **user interaction** and calls functions from `StudentOperations.java`. |

## Features & Functions  

### **Student.java**  
- `Student(String name, long prn, String dept, String batch, double cgpa)`: Constructor to initialize student details.  
- Getter and Setter methods for each attribute.  
- `display()`: Prints student details.  

### **StudentOperations.java**  
- `addStudent(Student student)`: Adds a student to the list.  
- `displayStudents()`: Displays all students.  
- `searchByPRN(long prn)`: Finds and returns
