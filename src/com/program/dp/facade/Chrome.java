package com.program.dp.facade;

import java.sql.Driver;

public class Chrome {

	public static Driver getChromeDriver()
	{
		return null;
	}
	
	public static void generateHTMLReport(String test, Driver driver)
	{
		System.out.println("Generating HTML Report for Chrome Driver");
	}
	
	public static void generateJunitReport(String test, Driver driver)
	{
		System.out.println("Generating Junit Report for Chrome Driver");
	}
}
