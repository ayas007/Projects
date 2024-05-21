package simple_project;

import java.util.ArrayList;
import java.util.List;

public class Student_Managment_System {
	
	 public class  Student {
	        private String name;

	        public  Student(String name) {
	            this.name = name;
	        }

	        public String getName() {
	            return name;
	        }
	    }

	    public class StudentList {
	        private List< Student> students = new ArrayList<>();

	        public void addStudent( Student person) {
	        	students.add(person);
	        }

	        public void displayPersons() {
	            System.out.println("Student in the list:");
	            System.out.println("-------------------------");
	            for ( Student std : students) {
	                System.out.println(std.getName());
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	Student_Managment_System system = new Student_Managment_System();
	    	StudentList stdList = system.new StudentList();

	        Student std1 = system.new  Student("Suresh");
	        Student std2 = system.new  Student("Pavan");

	        stdList.addStudent(std1);
	        stdList.addStudent(std2);

	        stdList.displayPersons();
	    }
	

}
