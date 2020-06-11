package com.program.dp.builder;

public class Vehicle {

	//Required Parameters
	private String engine;
	private int wheel;
	
	//Optional Parameters
	private int airbags;

	public Vehicle(VehicleBuilder vehicleBuilder) {
		
		this.engine = vehicleBuilder.engine;
		this.wheel = vehicleBuilder.wheel;
		this.airbags = vehicleBuilder.airbags;
	}
	
	//only getter method
	public String getEngine() {
		return this.engine;
	}

	public int getWheel() {
		return this.wheel;
	}

	public int getAirbags() {
		return this.airbags;
	}
	
	
	//inner static class
	public static class VehicleBuilder
	{
		private String engine;
		private int wheel;
		
		private int airbags;

		//required parameters
		public VehicleBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}

		//optional parameters with setter and return current object this
		public VehicleBuilder setAirBag(int airbags) {
			this.airbags = airbags;
			return this;
		}
		
		public Vehicle build()
		{
			return new Vehicle(this);
		}
		
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheel=" + wheel + ", airbags=" + airbags + "]";
	}
	
	
}
