package com.tech;

import java.util.Scanner;

public class Electricity {
 
	

	public static void main(String[] args) {

 
		String s;
		double amt = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter service number");
		int serno=sc.nextInt();
		System.out.println("Enter Name ");
		String name=sc.next();
		System.out.println("Enter pervious month reading");
		long pre=sc.nextLong();
		System.out.println("Enter current month reading");
		long cur=sc.nextLong();
		long unit=cur-pre;
		if (unit<=50) {
			amt=unit*1.45;
		}
		
		else if (unit<=100) {
			amt=50*1.45 + (unit-50)*2.8;
		}
		else if (unit<=200) {
			amt=50*1.45 +50*2.8 + (unit-100)*3.05;
		}
		else if (unit<=300) {
			amt=50*1.45 +50*2.8 + 100*3.05+(unit-200)*4.75;
		}
		else if (unit<=500) {
			amt=50*1.45 +50*2.8 + 100*3.05+100+4.75+(unit-300)*6;
		}
		System.out.println("");
	    System.out.println("Electricity Bill Genration");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-30s | %-30s | %-30s | %-30s|%-30s\n", "SrNo", "Name", "Pr Reading","Cr reading","Total Amount");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
 
 
            System.out.printf("| %-20s | %-40s | %-40s | %-30s|%-40s\n", serno, name, pre,cur,amt);
 
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    
//System.out.println("Coustmar Name :" +name);
//System.out.println("Service Number :"+serno);
//System.out.println("Pervious month reading :"+pre);
//System.out.println("Ccurrent month reading :"+cur);
//System.out.println("Toatal Amount :"+amt);
	}

}
