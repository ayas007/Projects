package com.nt;

import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose one from the following option");
		System.out.println("1)  	 U.S. dollar  to   Euro");
		System.out.println("2)  	 U.S. dollar  to   Indian rupee");
		System.out.println("3)     U.S. dollar  to   Japanese yen   ");
		System.out.println("4)     U.S. dollar  to   British Pound   ");
		System.out.println("5)     U.S. dollar  to   Australian Dollar  ");
		System.out.println("6)     U.S. dollar  to   Canadian Dollar  ");
		System.out.println("7)     U.S. dollar  to   Singapore Dollar  ");
	
		int ex=sc.nextInt();
		switch (ex) {
		case 1: {
			System.out.println("Enter the number of USD");
			double usd =sc.nextDouble();
			if(usd>=0)
			{
				System.out.println(usd + "US$ is  "+usd*0.946 + "€");
			}
			else {
				System.out.println("Plz put in positive numbers of USD");
			}
	
		}
		break;
		
		case 2: {
			System.out.println("Enter the number of USD");
			double usd =sc.nextDouble();
			if(usd>=0)
			{
				System.out.println(usd +" US$  is  "+usd*83.240 + " ₹");
			}
			else {
				System.out.println("Plz put in positive numbers of USD");
			}
	
		}
		break;
		case 3: {
			System.out.println("Enter the number of USD");
			double usd =sc.nextDouble();
			if(usd>=0)
			{
				System.out.println(usd +" US$  is  "+usd*0.007 + " ¥ / 円");
			}
			else {
				System.out.println("Plz put in positive numbers of USD");
			}
	
		}
		break;
		case 4: {
			System.out.println("Enter the number of USD");
			double usd =sc.nextDouble();
			if(usd>=0)
			{
				System.out.println(usd +" US$  is  "+usd*1.214 + " £");
			}
			else {
				System.out.println("Plz put in positive numbers of USD");
			}
	
		}
		break;
		case 5: {
			System.out.println("Enter the number of USD");
			double usd =sc.nextDouble();
			if(usd>=0)
			{
				System.out.println(usd +" US$  is  "+usd*0.634 + " A$");
			}
			else {
				System.out.println("Plz put in positive numbers of USD");
			}
	
		}
		break;
		case 6: {
			System.out.println("Enter the number of USD");
			double usd =sc.nextDouble();
			if(usd>=0)
			{
				System.out.println(usd +" US$  is  "+usd*0.724+ " C$");
			}
			else {
				System.out.println("Plz put in positive numbers of USD");
			}
	
		}
		break;
		case 7: {
			System.out.println("Enter the number of USD");
			double usd =sc.nextDouble();
			if(usd>=0)
			{
				System.out.println(usd +" US$  is  "+usd*0.730+ " S$");
			}
			else {
				System.out.println("Plz put in positive numbers of USD");
			}
	
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + ex);
		}
	
		

	}

}
