package com.program.dp.builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirBag(4).build();
		Vehicle bike = new Vehicle.VehicleBuilder("150cc", 2).build();
		
		System.out.println("Car: "+car);
		
		System.out.println("Bike: "+bike);
	}
}
