package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StudentMgSystem {
	 private List<Passenger> Passenger = new ArrayList<>();
	    private int nextPassengerId = 1;

	    public void createStudent(String name, String vehicleNumber , String contactNumber,String email,String amount,String travalingLocationFrom,String travalingLocationTo) {
	        Passenger ps = new  Passenger(nextPassengerId++, name, vehicleNumber, contactNumber, email, amount, travalingLocationFrom,travalingLocationTo);
	        Passenger.add(ps);
	        System.out.println("Passenger created with ID: " + ps.getId());
	    }

	    public Passenger readStudent(int passengerId) {
	        for (Passenger p : Passenger) {
	            if (p.getId() == passengerId) {
	                return p;
	            }
	        }
	        return null; // Passenger not found
	    }
	    public void updateStudent(int passengerId, String name, String vehicleNumber, String contactNumber,String email,  String amount,String travalingLocationFrom,String travalingLocationTo) {
	        Passenger ps = readStudent(passengerId);
	        if (ps != null) {
	            ps.setVehicleNumber(vehicleNumber);
	            System.out.println("Passenger with ID " + passengerId + " updated.");
	        } else {
	            System.out.println("Passenger  not found.");
	        }
	    }
	    public void deleteStudent(int passengerId) {
	        Passenger student = readStudent(passengerId);
	        if (student != null) {
	        	Passenger.remove(student);
	            System.out.println("Passenger with ID " + passengerId + " deleted.");
	        } else {
	            System.out.println("Passenger  not found.");
	        }
	    }
	    public static void main(String[] args) {
	        StudentMgSystem system = new StudentMgSystem();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Create Passenger");
	            System.out.println("2. Read Passenger");
	            System.out.println("3. Update Passenger");
	            System.out.println("4. Delete Passenger");
	            System.out.println("5. Exit");
	            System.out.print("Select an option: ");
	            int option = scanner.nextInt();
	            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNumber = scanner.next();
                    System.out.print("Enter Contact Number: ");
                    String contactNumber = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    
                    System.out.print("Enter Amount: ");
                    String amount = scanner.next();
                    System.out.print("Enter Travaling Location  From: ");
                    String travalingLocationFrom = scanner.next();
                    
                    System.out.print("Enter Travaling Location To: ");
                    String travalingLocationTo= scanner.next();
                    
                    system.createStudent(name, vehicleNumber, contactNumber,email,amount,travalingLocationFrom,travalingLocationTo);
                    break;

                case 2:
                    System.out.print("Enter  ID: ");
                    int readId = scanner.nextInt();
                    Passenger readPassenger = system.readStudent(readId);
                    if (readPassenger != null) {
                        System.out.println("Passenger Info:");
                        System.out.println("ID: " + readPassenger.getId());
                        System.out.println("Name: " + readPassenger.getName());
                        System.out.println("Vehicle Number: " + readPassenger.getVehicleNumber());
                        System.out.println("ContactNumber: " + readPassenger.getContactNumber());
                        System.out.println("Email: " + readPassenger.getEmail());
                        System.out.println("Amount: " + readPassenger.getAmount());
                        System.out.println("Travaling Location From: " + readPassenger.getTravalingLocationFrom());
                        System.out.println("Travaling Location To: " + readPassenger.getTravalingLocationTo());
                    } else {
                        System.out.println("Passenger not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Passenger ID: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter updated  number ");
                    String updatedProfilePicture = scanner.next();
                    system.updateStudent(updateId, null, null, null,null, null, null,null);
                    break;

                case 4:
                    System.out.print("Enter Passenger ID: ");
                    int deleteId = scanner.nextInt();
                    system.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
}
	    }}
	    
