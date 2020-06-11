package com.program.dp.factory;

//many sub class of super class
public class VehicleFactory {

	public static Vehicle getInstance(String type, int wheel)
	{
		if(type.equals("Car"))
		{
			return new Car(wheel);
		}
		else if(type.equals("Bike"))
		{
			return new Bike(wheel);
		}
		else
		{
			return null;
		}
	}
}
