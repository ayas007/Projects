package com.numetry;

public class Gym {
	 private int id;
	    private String name;
	    private String address;
	    private String mobileNumber;

	    public Gym(int id, String name, String address, String mobileNumber) {
	        this.id = id;
	        this.name = name;
	        this.address = address;
	        this.mobileNumber = mobileNumber;
	    }

	    public int getId() {
	        return id;
	    }
	
	    public String getName() {
	        return name;
	    }

	    public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAddress() {
	        return address;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }
}
