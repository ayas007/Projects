package com.tech;

import java.util.Scanner;

public class CreateTable {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        String[][] table = new String[rows][columns];

        System.out.println("Enter the headers for each column: ");
        String[] headers = new String[columns];
        for (int i = 0; i < columns; i++) {
            System.out.print("Header for column " + (i + 1) + ": ");
            headers[i] = scanner.next();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for row " + (i + 1) + " column " + headers[j] + ": ");
                table[i][j] = scanner.next();
            }
        }

        System.out.println("\nGenerated Table:");
        for (String header : headers) {
            System.out.print(header + "\t");
        }
        System.out.println();
        for (String[] row : table) {
            for (String data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }

}
