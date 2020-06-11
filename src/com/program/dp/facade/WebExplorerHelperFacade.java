package com.program.dp.facade;

import java.sql.Driver;

public class WebExplorerHelperFacade {

	public static void geterateReports(String browser, String report, String test) {
		Driver driver = null;

		switch (browser)
		{

		case "Firefox":
			driver = Firefox.getFirefoxDriver();

			switch (report) 
			{
			case "html":
				Firefox.generateHTMLReport(report, driver);
				break;
			case "junit":
				Firefox.generateJunitReport(report, driver);
				break;
			default:
				System.out.println("Format Extension not Supported");
				break;
			}
			break;
			
		case "Chrome":
			driver = Chrome.getChromeDriver();
			switch(report)
			{
			case "html":
				Chrome.generateHTMLReport(report, driver);
				break;
			case "junit":
				Chrome.generateJunitReport(report, driver);
				break;
			default:
				System.out.println("Format Extension not Supported");
				break;
			}
			break;

		default: 
			System.out.println("Browser not supported: "+browser);
			break;
		}
	}
}
