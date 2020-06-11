package com.program.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {

	private List<String> vehicles;
	
	public Vehicle() {
		this.vehicles = new ArrayList<>();
	}
	
	public Vehicle(List<String> vehicles) {
		this.vehicles = vehicles;
	}
	
	public void insertData()
	{
		this.getVehicles().add("Honda Amaze");
		this.getVehicles().add("Audi A4");
		this.getVehicles().add("Hyundai Creta");
		this.getVehicles().add("Maruti Baleno");
		this.getVehicles().add("Renault  Duster");
		this.getVehicles().add("BMW S4");
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		List<String> temps = new ArrayList<>();
		
		for(String temp : this.vehicles)
		{
			temps.add(temp);
		}
		
		return new Vehicle(temps);
	}

	public List<String> getVehicles() {
		return vehicles;
	}
}
