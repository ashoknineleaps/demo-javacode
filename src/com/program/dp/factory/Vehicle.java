package com.program.dp.factory;

public abstract class Vehicle {

	public abstract int getWheel();
	
	public String toString()
	{
		return "Wheel: "+this.getWheel();
	}
}
