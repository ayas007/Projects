package com.Numetry.Tech;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList< TicketManagementSystem> buses=new ArrayList<TicketManagementSystem>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add( new TicketManagementSystem(1, true, 4));
		buses.add( new TicketManagementSystem(2, false, 50));
		buses.add( new TicketManagementSystem(3, true, 49));
		int userOpt =1;
		Scanner sc=new Scanner(System.in);
	 for (TicketManagementSystem  b : buses) {
		 b.displayBusInfo();
		
	}
		
		while (userOpt==1) {
			System.out.println("Enter 1 to Book");
			System.out.println("Enter 2 to Exit");
			userOpt=sc.nextInt();
			if(userOpt==1)
			{
			 Booking booking= new Booking();
			 if(booking.isAvailable(bookings,buses))
			 {
			 bookings.add(booking);
			 System.out.println("Your booking is confirmed");	 
			 }
			 else
				 System.out.println("Sorry .Tickets are not Available");
			}
			
			
		}
		
		
	}

}
