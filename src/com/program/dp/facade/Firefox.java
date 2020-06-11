package com.program.dp.facade;

import java.sql.Driver;

public class Firefox {

	public static Driver getFirefoxDriver()
	{
		return null;
	}
	
	public static void generateHTMLReport(String test, Driver driver)
	{
		System.out.println("Generating HTML Report for Firefox Driver");
	}
	
	public static void generateJunitReport(String test, Driver driver)
	{
		System.out.println("Generating Junit Report for Firefox Driver");
	}
}
