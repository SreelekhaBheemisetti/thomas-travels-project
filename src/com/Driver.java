package com;

public class Driver {
	private String category;
	private int driverId;
	private String driverName;
	private double totalDistance;
	
	public Driver() {
		
	}
	
	public Driver(int driverId, String category, String driverName, double totalDistance) {
		this.driverId = driverId;
		this.category = category;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getDriverId() {
		return driverId;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public double getTotalDistance() {
		return totalDistance;
	}
	
	public void setCategory(String category) {
		if (category.equals("Car") || category.equals("Auto") || category.equals("Lorry") ) {
			this.category = category;
		}
		else {
			System.out.println("Incorrect category");
		}
		
	}
	
	public void setDriverId(int driverId) {
		this.driverId = driverId;
		
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
		
	}
	
	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	@Override
	public String toString() {
		return "Driver [category=" + category + ", driverId=" + driverId + ", driverName=" + driverName
				+ ", totalDistance=" + totalDistance + "]";
	}
	
	
}
