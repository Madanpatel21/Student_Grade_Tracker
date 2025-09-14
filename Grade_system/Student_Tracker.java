package Grade_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Tracker {
	private static ArrayList<Student> students=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("\n===== Student Tracker Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. View Student Report");
            System.out.println("4. View All Students Summary");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addGradeToStudent();
                case 3 -> viewStudentReport();
                case 4 -> viewAllSummary();
                case 5 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
		}while(choice!=5);
            	
		
	}
	private static void addStudent() {
        System.out.print("Enter student name: ");
        String name= sc.nextLine();
        students.add(new Student(name));
        System.out.println("Student added successfully!");
    }
	 private static void addGradeToStudent() {
	        if (students.isEmpty()) {
	            System.out.println("No students available. Add a student first.");
	            return;
	        }
	        System.out.print("Enter student name: ");
	        String name = sc.nextLine();
	        Student student = findStudent(name);
	        if (student != null) {
	            System.out.print("Enter grade (0-100): ");
	            int grade = sc.nextInt();
	            sc.nextLine();
	            student.addGrade(grade);
	            System.out.println("Grade added successfully!");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }
	 private static void viewStudentReport() {
	        System.out.print("Enter student name: ");
	        String name = sc.nextLine();
	        Student student = findStudent(name);
	        if (student != null) {
	            System.out.println("\n--- Report for " + student.getStudent_name() + " ---");
	            System.out.println("Grades: " + student.getGrade());
	            System.out.println("Average: " + student.getAverage());
	            System.out.println("Highest: " + student.getHighest());
	            System.out.println("Lowest: " + student.getLowest());
	        } else {
	            System.out.println("Student not found.");
	        }
	    }
	 private static void viewAllSummary() {
	        if (students.isEmpty()) {
	            System.out.println("No students available.");
	            return;
	        }
	        System.out.println("\n===== All Students Summary =====");
	        for (Student s : students) {
	            System.out.println("Name: " + s.getStudent_name());
	            System.out.println("Grades: " + s.getGrade());
	            System.out.println("Average: " + s.getAverage());
	            System.out.println("Highest: " + s.getHighest());
	            System.out.println("Lowest: " + s.getLowest());
	            System.out.println("-----------------------------");
	        }
	    }

	 private static Student findStudent(String name) {
		// TODO Auto-generated method stub
		 for (Student s : students) {
	            if (s.getStudent_name().equalsIgnoreCase(name)) {
	                return s;
	        }
	        return null;
	    }
		return null;
	 }




}
