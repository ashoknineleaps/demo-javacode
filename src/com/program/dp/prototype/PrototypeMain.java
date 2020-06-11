package com.program.dp.prototype;

import java.util.List;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Vehicle vehicle = new Vehicle();
		vehicle.insertData();
		
		Vehicle clone = (Vehicle) vehicle.clone();
		List<String> vehiclesCloned = clone.getVehicles();
		vehiclesCloned.add("Mercedes Benz");
		
		System.out.println("Original Copy: "+vehicle.getVehicles());
		System.out.println("Cloned Copy: "+vehiclesCloned);
		
		System.out.println();
		
		vehiclesCloned.remove("Audi A4");
		System.out.println("Cloned Copy: After Remove"+vehiclesCloned);
		System.out.println("Original Copy: After Remove"+vehicle.getVehicles());
	}
}
