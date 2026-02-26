package com;

import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {
		
		Driver driver1 = new Driver(1, "Car", "Vignesh", 1400);
		
		Driver driver2 = new Driver(2, "Auto", "Ganesh", 939);
		
		Driver driver3 = new Driver(3, "Lorry", "Rajesh", 1980);
		
		Driver driver4 = new Driver(4, "Car", "Suresh", 1453);
		
		Driver driver5 = new Driver(5, "Car", "Prakash", 1000);
		
		Driver driver6 = new Driver(6, "Lorry", "Sarvesh", 648);
		
		Driver driver7 = new Driver(7, "Auto", "Gnanesesh", 7420);
		
		Driver driver8 = new Driver(8, "Auto", "Vignanesh", 524);
		
		Driver driver9 = new Driver(9, "Lorry", "Venkatesh", 1438);
		
		Travel travel = new Travel();
		
//		Driver array[] = new Driver[9];
//		
//		array[0] = driver1;
//		array[1] = driver2;
//		array[2] = driver3;
//		array[3] = driver4;
//		array[4] = driver5;
//		array[5] = driver6;
//		array[6] = driver7;
//		array[7] = driver8;
//		array[8] = driver9;
		
		ArrayList<Driver>  array = new ArrayList<Driver>();
		array.add(driver1);
		array.add(driver2);
		array.add(driver3);
		array.add(driver4);
		array.add(driver5);
		array.add(driver6);
		array.add(driver7);
		array.add(driver8);
		array.add(driver9);
		
		System.out.println(travel.isCarDriver(driver3));
		
		
		System.out.println("-------------------------------------------");
		
		
		System.out.println(travel.retriveByDriverId(array, 3));
		
		
		System.out.println("-------------------------------------------");
		
		
		System.out.println("Count of drivers: " + travel.retriveCountOfDriver(array, "Auto"));
		
		
		System.out.println("-------------------------------------------");
		
		
		travel.retriveDriver(array, "Car");
		
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Maximum distance travelled among all drivers is : " + travel.retriveMaximumDistanceTravelledDriver(array));
	}
	
	
}
