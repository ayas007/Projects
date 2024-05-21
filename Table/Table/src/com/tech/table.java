package com.tech;
import java.util.*;

public class table {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Student> studentList = new ArrayList<>();

	        // Getting input for student details
	        for (int i = 0; i < 2; i++) { // Change 2 to the desired number of students
	            System.out.println("Enter details for student " + (i + 2) + ":");
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Student ID: ");
	            int studentId = scanner.nextInt();
	            scanner.nextLine(); // Consume the remaining newline
	            System.out.print("Address: ");
	            String address = scanner.nextLine();
	            studentList.add(new Student(name, studentId, address));
	        }

	        // Printing the table
	        System.out.println("Student Table:");
	        System.out.println("---------------------------------------------------");
	        System.out.printf("| %-20s | %-10s | %-30s |\n", "Name", "Student ID", "Address");
	        System.out.println("---------------------------------------------------");
	        for (Student student : studentList) {
	            System.out.printf("| %-20s | %-10d | %-30s |\n", student.getName(), student.getStudentId(), student.getAddress());
	        }
	        System.out.println("---------------------------------------------------");
	    }
	}

	class Student {
	    private String name;
	    private int studentId;
	    private String address;

	    public Student(String name, int studentId, String address) {
	        this.name = name;
	        this.studentId = studentId;
	        this.address = address;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public String getAddress() {
	        return address;
	    }
	}
	

 
	  

