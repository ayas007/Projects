package com.Numetry.Tech;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name of passenger:  ");
		passengerName=sc.next();
		System.out.println("Enter bus no: ");
		busNo=sc.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<TicketManagementSystem> buses) {
  int capacity=0;
  for (TicketManagementSystem bus : buses) {
	if (bus.getBusNo()==busNo ) {
		capacity=bus.getCapacity();
	}
	int booked=0;
	for ( Booking b : bookings) {
		if (b.busNo==busNo && b.date.equals(date)) {
			booked++;
			
		}
	}
}
		return true;
	}
	 

}
