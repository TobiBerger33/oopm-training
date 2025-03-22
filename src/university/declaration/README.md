# oopm-training

Programming Exercise: University Management System
Objective:
Design and implement a simple university management system with students, courses, and professors. You will create classes with attributes, validation logic, and methods for retrieving formatted details.

📌 Class Diagrams
plaintext
CopyEdit
classDiagram
    class Person {
        - name: String
        - age: int
        + getName() String
        + setName(name: String) void
        + getAge() int
        + setAge(age: int) void
        + getDetails() String
    }

    class Student {
        - studentID: String
        - enrolledCourses: List~Course~
        + getStudentID() String
        + setStudentID(studentID: String) void
        + enrollCourse(course: Course) void
        + getDetails() String
    }

    class Professor {
        - employeeID: String
        - department: String
        + getEmployeeID() String
        + setEmployeeID(employeeID: String) void
        + getDepartment() String
        + setDepartment(department: String) void
        + getDetails() String
    }

    class Course {
        - courseName: String
        - courseCode: String
        - credits: int
        + getCourseName() String
        + setCourseName(courseName: String) void
        + getCourseCode() String
        + setCourseCode(courseCode: String) void
        + getCredits() int
        + setCredits(credits: int) void
        + getDetails() String
    }

    Person <|-- Student
    Person <|-- Professor
    Student "1" -- "many" Course : enrolls in
    Professor "1" -- "many" Course : teaches

📌 Requirements
📍 General Requirements:
	1	Implement a superclass Person with:
	◦	name: A string representing the person's name.
	◦	age: An integer representing their age.
	◦	Getters and setters with validation.
	◦	A getDetails() method returning a formatted string.
	2	Implement two subclasses:
	◦	Student
	◦	Professor
	◦	Both should extend Person.
	3	Implement a Course class to store course details.

📍 Class: Person
✅ Set Name
	•	Accepts a valid string as a name.
	•	If null or empty, default to "Unnamed Person".
✅ Set Age
	•	Accepts a positive integer.
	•	Rejects values ≤ 0 with an IllegalArgumentException.
✅ View Person Details
	•	Formatted output:plaintext CopyEdit   "Name: Alice, Age: 25"
	•	  

📍 Class: Student
✅ Set Student ID
	•	Accepts a valid string ID (e.g., "S12345").
	•	If null or empty, defaults to "Unknown ID".
✅ Enroll in Courses
	•	Stores a list of courses.
	•	Adds a course using enrollCourse(Course course).
✅ View Student Details
	•	Displays student ID and enrolled courses:plaintext CopyEdit   "Name: Alice, Age: 20, Student ID: S12345, Enrolled in: Math 101, Physics 102"
	•	  
	•	Uses String.format() for consistency.

📍 Class: Professor
✅ Set Employee ID
	•	Accepts a valid string ID (e.g., "P56789").
	•	If null or empty, defaults to "Unknown ID".
✅ Set Department
	•	Accepts a valid string (e.g., "Computer Science").
	•	If null or empty, defaults to "Unknown Department".
✅ View Professor Details
	•	Displays professor info:plaintext CopyEdit   "Name: Dr. Smith, Age: 45, Employee ID: P56789, Department: Computer Science"
	•	  

📍 Class: Course
✅ Set Course Name
	•	Accepts a valid string as the course name.
	•	Defaults to "Unnamed Course" if empty.
✅ Set Course Code
	•	Accepts a valid string (e.g., "CS101").
	•	Rejects values ≤ 0.
✅ Set Credits
	•	Accepts a positive integer (1-6).
	•	Rejects values ≤ 0.
✅ View Course Details
	•	Displays course info:plaintext CopyEdit   "Course: Math 101, Code: MTH101, Credits: 3"
	•	  

📌 Implementation Hints
	•	Use method chaining (return this;) in setters for fluid object creation.
	•	Use inheritance: Student and Professor extend Person.
	•	Throw exceptions for invalid values (IllegalArgumentException).
	•	Implement constructors for flexibility.
	•	Use String.format() for consistency in getDetails().

📌 Example Usage
java
CopyEdit
import java.util.ArrayList;
import java.util.List;

public class university.Main {
    public static void main(String[] args) {
        Course math = new Course("Math 101", "MTH101", 3);
        Course physics = new Course("Physics 102", "PHY102", 4);

        Student student = new Student("Alice", 20, "S12345")
            .enrollCourse(math)
            .enrollCourse(physics);

        Professor professor = new Professor("Dr. Smith", 45, "P56789", "Computer Science");

        System.out.println(student.getDetails());
        System.out.println(professor.getDetails());
        System.out.println(math.getDetails());
    }
}
Expected Output:
plaintext
CopyEdit
Name: Alice, Age: 20, Student ID: S12345, Enrolled in: Math 101, Physics 102
Name: Dr. Smith, Age: 45, Employee ID: P56789, Department: Computer Science
Course: Math 101, Code: MTH101, Credits: 3

🚀 Challenge: Extend the System
	1	Create a University class that stores students and professors.
	2	Allow students to enroll in multiple courses and view their schedule.
	3	Assign professors to courses dynamically.
