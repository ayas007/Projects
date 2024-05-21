package com.nt;

import java.util.Scanner;

public class HotelManagementSystem {
    private static boolean[] rooms = new boolean[10]; // Array representing 10 rooms in the hotel

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Check-In");
            System.out.println("2. Check-Out");
            System.out.println("3. Display Rooms");
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
    }

    private static void checkIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room number to check-in: ");
        int roomNumber = scanner.nextInt();
        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("Invalid room number.");
        } else if (rooms[roomNumber - 1]) {
            System.out.println("Room is already occupied.");
        } else {
            rooms[roomNumber - 1] = true;
            System.out.println("Check-in successful for room " + roomNumber + ".");
        }
    }

    private static void checkOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room number to check-out: ");
        int roomNumber = scanner.nextInt();
        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("Invalid room number.");
        } else if (!rooms[roomNumber - 1]) {
            System.out.println("Room is already vacant.");
        } else {
            rooms[roomNumber - 1] = false;
            System.out.println("Check-out successful for room " + roomNumber + ".");
        }
    }

    private static void displayRooms() {
        System.out.println("Room Occupancy Status:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Room " + (i + 1) + ": " + (rooms[i] ? "Occupied" : "Vacant"));
        }
    }
}