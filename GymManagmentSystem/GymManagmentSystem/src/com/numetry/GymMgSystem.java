package com.numetry;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class GymMgSystem {
	 private List<Gym> members = new ArrayList<>();
	    private int nextMemberId = 1;

	    public void createStudent(String name, String address, String profilePicture) {
	        Gym  member = new Gym(nextMemberId++, name, address, profilePicture);
	        members.add(member);
	        System.out.println(" Member created with ID: " + member.getId());
	    }

	    public Gym readStudent(int memberId) {
	        for (Gym member : members) {
	            if (member.getId() == memberId) {
	                return member;
	            }
	        }
	        return null; 
	    }
	    public void updateStudent(int memberId, String name, String address, String MobileNumber) {
	        Gym member = readStudent(memberId);
	        if (member != null) {
	        	member.setName(name);
	        	member.setAddress(address);
	        	member.setMobileNumber(MobileNumber);
	            
	            System.out.println("Member with ID " + memberId + " updated.");
	        } else {
	            System.out.println("Member not found.");
	        }
	    }
	    public void deleteStudent(int mumberId) {
	        Gym gym = readStudent(mumberId);
	        if (gym != null) {
	        	members.remove(gym);
	            System.out.println("Member with ID " + mumberId + " deleted.");
	        } else {
	            System.out.println("Member not found.");
	        }
	    }
	    public static void main(String[] args) {
	        GymMgSystem system = new GymMgSystem();
	        System.out.println("------------>Gym Managment System<-----------");
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Add Member");
	            System.out.println("2. Read all Member");
	            System.out.println("3. Update Member");
	            System.out.println("4. Delete Member");
	            System.out.println("5. BMI Calculate");
	            System.out.println("6. Exit");
	            System.out.print("Select an option: ");
	            int option = scanner.nextInt();
	            switch (option) {
                case 1:
                    System.out.print("Enter Member name: ");
                    String name = scanner.next();
                    System.out.print("Enter Member address: ");
                    String address = scanner.next();
                    System.out.print("Enter  Member Mo. Number: ");
                    String mobileNumber = scanner.next();
                    system.createStudent(name, address, mobileNumber);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int readId = scanner.nextInt();
                    Gym readMember = system.readStudent(readId);
                    if (readMember != null) {
                        System.out.println("Member Info:");
                        System.out.println("ID: " + readMember.getId());
                        System.out.println("Name: " + readMember.getName());
                        System.out.println("Address: " + readMember.getAddress());
                        System.out.println("Mobile Number: " + readMember.getMobileNumber());
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    int updateId = scanner.nextInt();
                    
                    System.out.print("Enter updated  Name: ");
                    String updatedName = scanner.next();
                    System.out.print("Enter updated  Address: ");
                    String updatedAddress = scanner.next();
                    System.out.print("Enter updated  Mobile Number: ");
                    String updatedMobileNumber = scanner.next();
                    system.updateStudent(updateId, updatedName, updatedAddress, updatedMobileNumber);
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    int deleteId = scanner.nextInt();
                    system.deleteStudent(deleteId);
                    break;

                case 5:
                	 Scanner input = new Scanner(System.in);
                     System.out.print("Please enter weight in pounds: ");
                     double weight = input.nextDouble();
                     System.out.print("Please enter height in inches: ");
                     double height = input.nextDouble();
                     final double kilo_per_pound = 0.45359237;
                     final double meters_per_inch = 0.0254;
                     double weight_in_kilo = weight * kilo_per_pound;
                     double height_in_meters = height * meters_per_inch;
                     double bmi = weight_in_kilo / (height_in_meters * height_in_meters);
                     System.out.println("BMI is : "+ bmi);
                     if(bmi < 18.5)
                         System.out.println("\n Underweight::\n \n Increase Your BMI \n Include a variety of foods that are high in calories and rich in nutrients. These would include foods such as avocados, yoghurt, milk, salmon, tuna, nuts, seeds, beans, brown rice, peas, granola, bananas, dried apricots, sweet potatoes, salmon and tuna.\n"); 
                     else if (bmi < 25)
                         System.out.println("Normal");
                     else if (bmi < 30)
                         System.out.println("\n Overweight\r\n   Daily workout 60 minute Best exercises to help reduce BMI:\r\n"
                         		+ "Cycling. Cycling is a well-known workout that boosts fitness and can aid in weight loss and lowering overall BMI. ...\r\n"
                         		+ "Brisk walking. Brisk walking is ideal for beginners who are just starting to add working out to their routine. ...\r\n"
                         		+ "Running. ...\r\n"
                         		+ "Weight training. ...\r\n"
                         		+ "HIIT. ...\r\n"
                         		+ "Swimming. ...\r\n"
                         		+ "Yoga.\n");
                    
                     else
                    	  System.out.println("\n Obese5\r\n   Daily workout 60 minute Best exercises to help reduce BMI:\r\n"
                           		+ "Cycling. Cycling is a well-known workout that boosts fitness and can aid in weight loss and lowering overall BMI. ...\r\n"
                           		+ "Brisk walking. Brisk walking is ideal for beginners who are just starting to add working out to their routine. ...\r\n"
                           		+ "Running. ...\r\n"
                           		+ "Weight training. ...\r\n"
                           		+ "HIIT. ...\r\n"
                           		+ "Swimming. ...\r\n"
                           		+ "Yoga.\n");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
}
	    }}
	    
