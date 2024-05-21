package com.Numetry.Tech;

public class TicketManagementSystem {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	public TicketManagementSystem(int busNo, boolean ac, int cap) {
		super();
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = cap;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean val) {
		this.ac = val;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int cap) {
		this.capacity = cap;
	}
	
	public void displayBusInfo()
	{
		System.out.println("Bus No :" +busNo+"Ac :"+ac+"Total Capacity : "+capacity);
	}
}
