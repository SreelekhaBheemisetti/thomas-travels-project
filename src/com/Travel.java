 package com;

import java.util.ArrayList;

public class Travel{
	boolean isCarDriver(Driver driver) {
		
		return "Car".equals(driver.getCategory());
		
	}
	
	String retriveByDriverId(ArrayList<Driver> array, int driverId) {
		for(Driver driver: array) {
			if (driver.getDriverId() == driverId) {
				return "Driver name " + driver.getDriverName() + " belonging to the category " + driver.getCategory() + " traveled " + driver.getTotalDistance() + " KM so far.";
			}
		}
		return "No driver found";
	}
	
	int retriveCountOfDriver(ArrayList<Driver> array, String driverCategory) {
		int count = 0;
		for(Driver category : array) {
			if(category.getCategory().equals(driverCategory)) {
				count++;
			}	
		}
		return count;
	}
	
	void retriveDriver(ArrayList<Driver> array, String category) {
		for(Driver driver : array) {
			if (driver.getCategory().equals(category)) {
				System.out.println(driver);
			}
		}
		
	}
	
	String retriveMaximumDistanceTravelledDriver(ArrayList<Driver> array) {
		double max = array.get(0).getTotalDistance();
		String maxTravelledDriver = "";
		for(Driver driver : array) {
			if(driver.getTotalDistance()>max) {
				max = driver.getTotalDistance();
				maxTravelledDriver = driver.getDriverName();
			}
		}
		return maxTravelledDriver;
	}
}
