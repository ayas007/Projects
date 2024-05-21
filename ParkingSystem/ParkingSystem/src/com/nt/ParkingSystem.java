package com.nt;

import java.util.Scanner;

public class ParkingSystem {
	 
	 
	   private static boolean[] area = new boolean[10]; 

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Parking-In");
	            System.out.println("2. Parking-Out");
	            System.out.println("3. Display Parking List");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkIn();
	                     
	                    break;
	                case 2:
	                    checkOut();
	                    break;
	                case 3:
	                    displayRooms();
	                    break;
	                case 4:
	                    System.out.println("Exiting the program.");
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }//main
	    

	    private static void checkIn() {
	    
	    	   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Token & Parking Area Number  Where do you want to park ??");
	        int Number = scanner.nextInt();
	        if (Number < 1 || Number > 10) {
	            System.out.println("Invalid parking number.");
	        } else if (area[Number - 1]) {
	            System.out.println("parking is already occupied.");
	        } else {
	            area[Number - 1] = true;
	            System.out.println("You have parked your vehicle " + Number + ".");
	        }
	    }

	    private static void checkOut() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter   number to parking-out: ");
	        int Number = scanner.nextInt();
	        if (Number < 1 || Number > 10) {
	            System.out.println("Invalid parking & token number.");
	        } else if (!area[Number - 1]) {
	            System.out.println("Parking space already occupied.");
	        } else {
	            area[Number - 1] = false;
	            System.out.println("Check-out successful for Parking" + Number + ".");
	        }
	    }

	    private static void displayRooms() {
	        System.out.println("Available parking  Status:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Token & Parking Area No " + (i + 1) + ": " + (area[i] ? "Occupied" : "Vacant"));
	        }
	    }
}
