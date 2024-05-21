package com.nt;

public class Passenger {
	    private int id;
	    private String name;
	    private String vehicleNumber;
	    private String contactNumber;
	    private String email;
	    private String amount;
	    private String travalingLocationFrom;
	    private String travalingLocationTo;
		public Passenger(int id, String name, String vehicleNumber, String contactNumber, String email, String amount,
				String travalingLocationFrom,String travalingLocationTo) {
			super();
			this.id = id;
			this.name = name;
			this.vehicleNumber = vehicleNumber;
			this.contactNumber = contactNumber;
			this.email = email;
			this.amount = amount;
			this.travalingLocationFrom = travalingLocationFrom;
			this.travalingLocationTo  = travalingLocationTo;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getVehicleNumber() {
			return vehicleNumber;
		}
		public void setVehicleNumber(String vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getTravalingLocationFrom() {
			return travalingLocationFrom;
		}
		public void setTravalingLocationFrom(String travalingLocationFrom) {
			this.travalingLocationFrom = travalingLocationFrom;
		}
	    
		
		public String getTravalingLocationTo() {
			return travalingLocationTo;
		}
		public void setTravalingLocationTo(String travalingLocationTo) {
			this.travalingLocationTo = travalingLocationTo;
		}
	  
}
